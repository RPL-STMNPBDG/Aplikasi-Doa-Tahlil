package com.example.ta_aplikasidoatahlil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShalatJenazah extends AppCompatActivity {

    MaterialCardView cardViewa, cardViewb, cardViewc, cardViewd, cardViewe, cardViewf, cardViewg;
    ImageButton showa, showb, showc, showd, showe, showf, showg;
    RelativeLayout hiddensatu, hiddendua, hiddentiga, hiddenempat, hiddenlima, hiddenenam, hiddentujuh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_shalat_jenazah);
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
        cardViewf = findViewById(R.id.cardenam);
        showf = findViewById(R.id.imageenam);
        hiddenenam = findViewById(R.id.isienam);
        cardViewg = findViewById(R.id.cardtujuh);
        showg = findViewById(R.id.imagetujuh);
        hiddentujuh = findViewById(R.id.isitujuh);

        showg.setOnClickListener(view -> {
            if (hiddentujuh.getVisibility() == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cardViewg, new AutoTransition());
                hiddentujuh.setVisibility(View.GONE);
                showg.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
            } else {
                TransitionManager.beginDelayedTransition(cardViewg, new AutoTransition());
                hiddentujuh.setVisibility(View.VISIBLE);
                showg.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
            }
        });

        showa.setOnClickListener(view -> {
            if (hiddensatu.getVisibility() == View.VISIBLE){
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

        showf.setOnClickListener(view -> {
            if (
                    hiddenenam.getVisibility() == View.VISIBLE
            ){
                TransitionManager.beginDelayedTransition(cardViewf, new AutoTransition());
                hiddenenam.setVisibility(View.GONE);
                showf.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
            } else {
                TransitionManager.beginDelayedTransition(cardViewf, new AutoTransition());
                hiddenenam.setVisibility(View.VISIBLE);
                showf.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
            }
        });
    }

}