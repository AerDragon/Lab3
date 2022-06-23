package com.company;

public abstract class Entity extends LiveObject {


    String getName() {return this.name;}

    public void say(String s){
        System.out.println("- "+ s + " - кричал " + this.name );
    }
}
