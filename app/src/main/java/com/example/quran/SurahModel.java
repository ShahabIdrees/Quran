package com.example.quran;

public class SurahModel {
    private int number;
    private String nameEnglish;
    private String nameUrdu;
    public SurahModel(int Number, String NameEnglish, String NameUrdu) {
        this.number = Number;
        this.nameEnglish = NameEnglish;
        this.nameUrdu = NameUrdu;
    }

    public int getNumber() {
        return number;
    }
    public String getNameEnglish() {
        return nameEnglish;
    }
    public String getNameUrdu() {
        return nameUrdu;
    }
}
