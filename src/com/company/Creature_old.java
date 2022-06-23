package com.company;

public class Creature_old implements Action,Scream {

    @Override
    public void RunAway(String object) {

        System.out.println(object+" " +"торопилось по подвалу на желтый снег,");
    }
    public void sobbing(String object) {
        System.out.println(object + " " + "всхлипывало");
    }
    public void get(){
        System.out.println("Ещё немного и оно бы получило мальчишку");
    }
    public  void change(){
        System.out.println("Оно скинет давление в котле");
    }
    public void hurt(){
        System.out.println("а потом сурово накажет мальчишку с его огромной силой.");
    }
    @Override
    public void scream(String character){
        System.out.println(String.format("— Нельзя! — кричало %s. — О нет, нельзя!",character));
    }

    public void hurry(){
        System.out.println("Оно спешило через комнату к котлу.");

    }
    public void put(){
        System.out.println("Существо положило руки — руки Джека Торранса ");
    }
    public void turn(){
        System.out.println("Существо отвернуло его до упора,");
    }

    public void scream() {
        System.out.println("Победа!-завопило существо.");
    }
    public void expressed(){
        System.out.println("В поднимающемся горячем тумане оно выделывало непристойные па");
    }
    @Override
    public String toString() {
        return "Creature{}";
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
