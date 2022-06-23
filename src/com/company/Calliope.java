package com.company;

public class Calliope {
    private String name = "калиопа";

    public String getName(){return name;}

    public void calliopeView(){
        System.out.println(Emotions.AWFUL.value + " " + this.name);
    }
    public void description(){

        System.out.println("[Каллиопа — клавишный музыкальный инструмент]");
    }
    @Override
    public String toString() {
        return "Calliope{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
