package com.example.ta_aplikasidoatahlil;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListNama extends AppCompatActivity implements OnClickListener {

    // Primitive Variables
    String selected_ID = "";

    // Widget GUI Declare
    EditText edit_text;
    Button btnAddEmployee, btnUpdate, btnDelete;
    ListView lvEmployees;

    // DB Objects
    DBHelper helper;
    SQLiteDatabase db;

    // Adapter Object
    SimpleCursorAdapter adapter;

    /**
     * Called when the activity is first created.
     **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_list_nama);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Init DB Objects
        helper = new DBHelper(this);

        // Widget GUI Init
        edit_text = (EditText) findViewById(R.id.edit_text);
        lvEmployees = (ListView) findViewById(R.id.lvEmployees);

        btnAddEmployee = (Button) findViewById(R.id.btnAdd);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);

        // Attached Listener
        btnAddEmployee.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        lvEmployees.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                String name;

                // Display Selected Row of Listview into EditText widget

                Cursor row = (Cursor) adapter.getItemAtPosition(position);
                selected_ID = row.getString(0);
                name = row.getString(1);

                edit_text.setText(name);
            }
        });

        // Fetch Data from database
        fetchData();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {

        // Perform CRUD Operation
        if (v == btnAddEmployee) {
            // Add Record with help of ContentValues and DBHelper class object
            ContentValues values = new ContentValues();
            values.put(DBHelper.C_ENAME, edit_text.getText().toString());

            // Call insert method of SQLiteDatabase Class and Close after perfoming task
            db = helper.getWritableDatabase();
            db.insert(DBHelper.TABLE, null, values);
            db.close();

            clearFields();
            Toast.makeText(this, "Nama Berhasil Ditambahkan", Toast.LENGTH_LONG).show();

            // Fetch Data from database and display into listview
            fetchData();
        }

        if (v == btnUpdate) {
            // Update Record with help of ContentValues and DBHelper class object
            ContentValues values = new ContentValues();
            values.put(DBHelper.C_ENAME, edit_text.getText().toString());

            // Call update method of SQLiteDatabase Class and close after
            // performing task
            db = helper.getWritableDatabase();
            db.update(DBHelper.TABLE, values, DBHelper.C_ID + "=?", new String[]{selected_ID});
            db.close();

            // Fetch Data from database and display into listview
            fetchData();
            Toast.makeText(this, "Nama Berhasil Diupdate", Toast.LENGTH_LONG).show();
            clearFields();
        }

        if (v == btnDelete) {
            // Call delete method of SQLiteDatabase Class to delete record and
            // close after performing task
            db = helper.getWritableDatabase();
            db.delete(DBHelper.TABLE, DBHelper.C_ID + "=?", new String[]{selected_ID});
            db.close();

            // Fetch Data from database and display into listview
            fetchData();
            Toast.makeText(this, "Nama Berhasil Dihapus", Toast.LENGTH_LONG).show();
            clearFields();
        }
    }

    // Clear Fields
    private void clearFields() {
        edit_text.setText("");
    }

    // Fetch Fresh data from database and display into listview
    private void fetchData() {
        db = helper.getReadableDatabase();
        Cursor c = db.query(DBHelper.TABLE, null, null, null, null, null, null);

        adapter = new SimpleCursorAdapter(this, R.layout.list_row_main, c, new String[]{
                DBHelper.C_ENAME
        }, new int[]{R.id.text_view}, 1);
        lvEmployees.setAdapter(adapter);
    }
}
