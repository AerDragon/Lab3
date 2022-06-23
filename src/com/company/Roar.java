package com.company;

public class Roar {
    private String name = "рев";

    public String getName(){return name;}

    public void listenRoar(){
        System.out.println("раздался "+ this.name);
    }
}
