package com.example.ta_aplikasidoatahlil.model;

public class DoaList {

    private final String noDoa;
    private final String judulDoa;

    public DoaList(String noDoa, String judulDoa) {
        this.noDoa = noDoa;
        this.judulDoa = judulDoa;
    }

    public String getNoDoa(){
        return noDoa;
    }

    public String getJudulDoa(){
        return judulDoa;
    }
}
