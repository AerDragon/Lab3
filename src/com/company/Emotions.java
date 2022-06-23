package com.company;

public enum Emotions {
    FEAR("всхлипывало от страха"),
    AWFUL("чудовищная"),
    FUN("радостно");

    String value;

    Emotions(String value){
        this.value = value;
    }
}
