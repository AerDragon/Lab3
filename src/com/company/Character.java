package com.company;

public class Character extends Entity implements Emotion {

    public Character(String name){this.name = name;}


    public void say(String s){
        System.out.println("- "+ s + " - кричал " + this.name );
    }


    @Override
    public String toString() {
        return "Caretaker{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void getEmotion(Emotions emotions) {

    }

    public static class Hands{
        private String name = "руки";

        public String getName(){return name;}

        public void heating(Character character){
            System.out.println(this.name  + " " +  character.getName() + " " + "начали гореть");
        }
    }
}
