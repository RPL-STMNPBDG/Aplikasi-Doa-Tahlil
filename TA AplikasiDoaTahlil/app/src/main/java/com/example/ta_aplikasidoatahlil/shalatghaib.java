package com.example.ta_aplikasidoatahlil;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class shalatghaib extends AppCompatActivity {
    MaterialCardView cardViewa, cardViewb, cardViewc, cardViewd, cardViewe;
    ImageButton showa, showb, showc, showd, showe;
    ImageButton ps, pls, ss, pd, pld, sd, pt, plt, st, pe, ple, se, pl, pll, sl;
    MediaPlayer ms, md, mt, me, ml;
    RelativeLayout hiddensatu, hiddendua, hiddentiga, hiddenempat, hiddenlima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_shalatghaib);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cardViewa = findViewById(R.id.cardsatu);
        showa = findViewById(R.id.imagesatu);
        hiddensatu = findViewById(R.id.isisatu);
        cardViewb = findViewById(R.id.carddua);
        showb = findViewById(R.id.imagedua);
        hiddendua = findViewById(R.id.isidua);
        cardViewc = findViewById(R.id.cardtiga);
        showc = findViewById(R.id.imagetiga);
        hiddentiga = findViewById(R.id.isitiga);
        cardViewd = findViewById(R.id.cardempat);
        showd = findViewById(R.id.imageempat);
        hiddenempat = findViewById(R.id.isiempat);
        cardViewe = findViewById(R.id.cardlima);
        showe = findViewById(R.id.imagelima);
        hiddenlima = findViewById(R.id.isilima);

        showa.setOnClickListener(view -> {
            if (
                    hiddensatu.getVisibility() == View.VISIBLE
            ){
                TransitionManager.beginDelayedTransition(cardViewa, new AutoTransition());
                hiddensatu.setVisibility(View.GONE);
                showa.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
            } else {
                TransitionManager.beginDelayedTransition(cardViewa, new AutoTransition());
                hiddensatu.setVisibility(View.VISIBLE);
                showa.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
            }
        });

        showb.setOnClickListener(view -> {
            if (
                    hiddendua.getVisibility() == View.VISIBLE
            ){
                TransitionManager.beginDelayedTransition(cardViewb, new AutoTransition());
                hiddendua.setVisibility(View.GONE);
                showb.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
            } else {
                TransitionManager.beginDelayedTransition(cardViewb, new AutoTransition());
                hiddendua.setVisibility(View.VISIBLE);
                showb.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
            }
        });

        showc.setOnClickListener(view -> {
            if (
                    hiddentiga.getVisibility() == View.VISIBLE
            ){
                TransitionManager.beginDelayedTransition(cardViewc, new AutoTransition());
                hiddentiga.setVisibility(View.GONE);
                showc.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
            } else {
                TransitionManager.beginDelayedTransition(cardViewc, new AutoTransition());
                hiddentiga.setVisibility(View.VISIBLE);
                showc.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
            }
        });

        showd.setOnClickListener(view -> {
            if (
                    hiddenempat.getVisibility() == View.VISIBLE
            ){
                TransitionManager.beginDelayedTransition(cardViewd, new AutoTransition());
                hiddenempat.setVisibility(View.GONE);
                showd.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
            } else {
                TransitionManager.beginDelayedTransition(cardViewd, new AutoTransition());
                hiddenempat.setVisibility(View.VISIBLE);
                showd.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
            }
        });

        showe.setOnClickListener(view -> {
            if (
                    hiddenlima.getVisibility() == View.VISIBLE
            ){
                TransitionManager.beginDelayedTransition(cardViewe, new AutoTransition());
                hiddenlima.setVisibility(View.GONE);
                showe.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
            } else {
                TransitionManager.beginDelayedTransition(cardViewe, new AutoTransition());
                hiddenlima.setVisibility(View.VISIBLE);
                showe.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
            }
        });

        ps = (ImageButton) findViewById(R.id.psatu);
        pls = (ImageButton) findViewById(R.id.plsatu);
        ss = (ImageButton) findViewById(R.id.ssatu);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ms!=null){
                    ms.pause();
                    Toast.makeText(shalatghaib.this, "Pause Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ms==null){
                    ms = MediaPlayer.create(getApplicationContext(),R.raw.satu);
                    Toast.makeText(shalatghaib.this, "Play Audio", Toast.LENGTH_LONG).show();
                }
                ms.start();
            }
        });

        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ms!=null){
                    ms.release();
                    ms = null;
                    Toast.makeText(shalatghaib.this, "Stop Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        pd = (ImageButton) findViewById(R.id.pdua);
        pld = (ImageButton) findViewById(R.id.pldua);
        sd = (ImageButton) findViewById(R.id.sdua);

        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (md!=null){
                    md.pause();
                    Toast.makeText(shalatghaib.this, "Pause Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        pld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (md==null){
                    md = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                    Toast.makeText(shalatghaib.this, "Play Audio", Toast.LENGTH_LONG).show();
                }
                md.start();
            }
        });

        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (md!=null){
                    md.release();
                    md = null;
                    Toast.makeText(shalatghaib.this, "Stop Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        pt = (ImageButton) findViewById(R.id.ptiga);
        plt = (ImageButton) findViewById(R.id.pltiga);
        st = (ImageButton) findViewById(R.id.stiga);

        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mt!=null){
                    mt.pause();
                    Toast.makeText(shalatghaib.this, "Pause Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        plt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mt==null){
                    mt = MediaPlayer.create(getApplicationContext(),R.raw.tiga);
                    Toast.makeText(shalatghaib.this, "Play Audio", Toast.LENGTH_LONG).show();
                }
                mt.start();
            }
        });

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mt!=null){
                    mt.release();
                    mt = null;
                    Toast.makeText(shalatghaib.this, "Stop Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        pe = (ImageButton) findViewById(R.id.pempat);
        ple = (ImageButton) findViewById(R.id.plempat);
        se = (ImageButton) findViewById(R.id.sempat);

        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (me!=null){
                    me.pause();
                    Toast.makeText(shalatghaib.this, "Pause Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        ple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (me==null){
                    me = MediaPlayer.create(getApplicationContext(),R.raw.empat);
                    Toast.makeText(shalatghaib.this, "Play Audio", Toast.LENGTH_LONG).show();
                }
                me.start();
            }
        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (me!=null){
                    me.release();
                    me = null;
                    Toast.makeText(shalatghaib.this, "Stop Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        pl = (ImageButton) findViewById(R.id.plima);
        pll = (ImageButton) findViewById(R.id.pllima);
        sl = (ImageButton) findViewById(R.id.slima);

        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ml!=null){
                    ml.pause();
                    Toast.makeText(shalatghaib.this, "Pause Audio", Toast.LENGTH_LONG).show();
                }
            }
        });

        pll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ml==null){
                    ml = MediaPlayer.create(getApplicationContext(),R.raw.lima);
                    Toast.makeText(shalatghaib.this, "Play Audio", Toast.LENGTH_LONG).show();
                }
                ml.start();
            }
        });

        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ml!=null){
                    ml.release();
                    ml = null;
                    Toast.makeText(shalatghaib.this, "Stop Audio", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}