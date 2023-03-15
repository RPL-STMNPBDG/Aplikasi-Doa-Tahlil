package com.example.ta_aplikasidoatahlil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void DoaTahlil(View view) {
        Intent i = new Intent(dashboard.this, MainActivity.class);
        startActivity(i);
    }

    public void ListNama(View view) {
        Intent l = new Intent(dashboard.this, ListNama.class);
        startActivity(l);
    }

    public void ShalatJenazah(View view) {
        Intent j = new Intent(dashboard.this, ShalatJenazah.class);
        startActivity(j);
    }

    public void ShalatGhaib(View view) {
        Intent g = new Intent(dashboard.this, shalatghaib.class);
        startActivity(g);
    }

    public void About(View view) {
        Intent h = new Intent(dashboard.this, About.class);
        startActivity(h);
    }
}