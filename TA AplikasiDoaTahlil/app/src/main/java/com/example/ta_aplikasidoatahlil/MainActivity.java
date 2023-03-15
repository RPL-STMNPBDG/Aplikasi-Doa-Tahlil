package com.example.ta_aplikasidoatahlil;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.ta_aplikasidoatahlil.design.CustomAdapter;
import com.example.ta_aplikasidoatahlil.model.DoaList;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<DoaList> mediaList;
    SearchView cariDoa;
    Dialog myDialog;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.rvJudulDoa);
        mediaList = setNoAndJudul();
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,mediaList);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(this);

        floatingActionButton = findViewById(R.id.scrolltop);
        floatingActionButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                listView.smoothScrollToPosition(0);
            }});
}

 private void initSearch(){
        
 }




    private ArrayList<DoaList> setNoAndJudul(){
        mediaList = new ArrayList<>();

        mediaList.add(new DoaList("1", "Pengantar Al-Fatihah"));
        mediaList.add(new DoaList("2", "Al-Fatihah"));
        mediaList.add(new DoaList("3", "Al-Ikhlas (3X)"));
        mediaList.add(new DoaList("4", "Tahlil dan Takbir"));
        mediaList.add(new DoaList("5", "Al-Falaq"));
        mediaList.add(new DoaList("6", "Tahlil dan Takbir"));
        mediaList.add(new DoaList("7", "An-Nas"));
        mediaList.add(new DoaList("8", "Tahlil dan Takbir"));
        mediaList.add(new DoaList("9", "Al-Fatihah"));
        mediaList.add(new DoaList("10", "Al-Baqarah 1-6"));
        mediaList.add(new DoaList("11", "Al-Baqarah 163"));
        mediaList.add(new DoaList("12", "Al-Baqarah 255 (Ayat Kursi)"));
        mediaList.add(new DoaList("13", "Al-Baqarah 284-286"));
        mediaList.add(new DoaList("14", "Hud 73"));
        mediaList.add(new DoaList("15", "Al-Ahzab 33"));
        mediaList.add(new DoaList("16", "Al-Ahzab 56"));
        mediaList.add(new DoaList("17", "Shalawat Nabi (3X)"));
        mediaList.add(new DoaList("18", "Salam Nabi"));
        mediaList.add(new DoaList("19", "Ali Imran 173"));
        mediaList.add(new DoaList("20", "Al-Anfal 40"));
        mediaList.add(new DoaList("21", "Hauqalah"));
        mediaList.add(new DoaList("22", "Istigfar (3X)"));
        mediaList.add(new DoaList("23", "Hadits Keutamaan Tahlil"));
        mediaList.add(new DoaList("24", "Tahlil (160X)"));
        mediaList.add(new DoaList("25", "Dua Kalimat Syahadat"));
        mediaList.add(new DoaList("26", "Doa Tahlil"));
        mediaList.add(new DoaList("27", "Shalawat Zat Mukammalah"));
        mediaList.add(new DoaList("28", "Doa Kebaikan Lahir & Batin"));
        mediaList.add(new DoaList("29", "Doa Keberkahan Al-Qur'an"));
        mediaList.add(new DoaList("30", "Doa Wahbah untuk Para Sahabat Rasul & Wali Allah"));
        mediaList.add(new DoaList("31", "Doa untuk Arwah Penghuni Makam Mualla, Syubaikah, Baqi', dan Mereka yang Tidak Pernah Diziarahi"));
        mediaList.add(new DoaList("32", "Doa Permohonan Rahmat Berkah Al-Qur'an"));
        mediaList.add(new DoaList("33", "Doa Ketentraman untuk Ahli Kubur"));
        mediaList.add(new DoaList("34", "Doa Meminta Syafa'at Al-Qur'an"));
        mediaList.add(new DoaList("35", "Doa Pengantar untuk Penghuni Baru Kubur"));
        mediaList.add(new DoaList("36", "Doa Kelapangan Kubur"));
        mediaList.add(new DoaList("37", "Doa untuk Ahli Kubur"));
        mediaList.add(new DoaList("38", "Doa Khusus untuk Ahli Kubur yang Diziarahi"));
        mediaList.add(new DoaList("39", "Doa agar Ingat dan Paham Al-Qur'an"));
        mediaList.add(new DoaList("40", "Doa Kemurahan dan Keridhaan Allah"));
        return mediaList;

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        DoaList list = mediaList.get(position);
        if (position==0){
            myDialog.setContentView(R.layout.activity_ayatsatu);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==1){
            myDialog.setContentView(R.layout.activity_ayat);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==2){
            myDialog.setContentView(R.layout.activity_ayatdua);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==3){
            myDialog.setContentView(R.layout.activity_ayatawal);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==4){
            myDialog.setContentView(R.layout.activity_ayattiga);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==5){
            myDialog.setContentView(R.layout.activity_ayatawal);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==6){
            myDialog.setContentView(R.layout.activity_ayatempat);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==7){
            myDialog.setContentView(R.layout.activity_ayatawal);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==8){
            myDialog.setContentView(R.layout.activity_ayat);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==9){
            myDialog.setContentView(R.layout.activity_ayatlima);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==10){
            myDialog.setContentView(R.layout.activity_ayatenam);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==11){
            myDialog.setContentView(R.layout.activity_ayattujuh);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==12){
            myDialog.setContentView(R.layout.activity_ayatdelapan);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==13){
            myDialog.setContentView(R.layout.activity_ayatsembilan);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==14){
            myDialog.setContentView(R.layout.activity_ayatsepuluh);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==15){
            myDialog.setContentView(R.layout.activity_ayatsebelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==16){
            myDialog.setContentView(R.layout.activity_ayatduabelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==17) {
            myDialog.setContentView(R.layout.activity_tigabelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==18) {
            myDialog.setContentView(R.layout.activity_ayatempatbelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==19) {
            myDialog.setContentView(R.layout.activity_ayatlimabelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==20) {
            myDialog.setContentView(R.layout.activity_ayatenambelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==21) {
            myDialog.setContentView(R.layout.activity_ayattujuhbelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==22) {
            myDialog.setContentView(R.layout.activity_ayatdelapanbelas);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==23) {
            myDialog.setContentView(R.layout.activity_ayatduapuluh);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==24) {
            myDialog.setContentView(R.layout.activity_ayatduasatu);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==25) {
            myDialog.setContentView(R.layout.activity_ayatduadua);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==26) {
            myDialog.setContentView(R.layout.activity_ayatduatiga);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==27) {
            myDialog.setContentView(R.layout.activity_ayatduaempat);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==28) {
            myDialog.setContentView(R.layout.activity_ayatdualima);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==29) {
            myDialog.setContentView(R.layout.activity_ayatduaenam);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==30) {
            myDialog.setContentView(R.layout.activity_ayatduatujuh);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==31) {
            myDialog.setContentView(R.layout.activity_ayatduadelapan);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==32) {
            myDialog.setContentView(R.layout.activity_ayatduasembilan);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==33) {
            myDialog.setContentView(R.layout.activity_ayattigapuluh);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==34) {
            myDialog.setContentView(R.layout.activity_ayattigasatu);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==35) {
            myDialog.setContentView(R.layout.activity_ayattigadua);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==36) {
            myDialog.setContentView(R.layout.activity_ayattigatiga);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==37) {
            myDialog.setContentView(R.layout.activity_ayattigaempat);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==38) {
            myDialog.setContentView(R.layout.activity_ayattigalima);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }else if (position==39) {
            myDialog.setContentView(R.layout.activity_ayattigaenam);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
            myDialog.show();
        }
    }
}