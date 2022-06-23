package com.company;

public class Creature extends Entity implements Emotion {

    public Creature(String name){this.name = name;}


    public void walking(Speed speed){
        String s = null;
        switch (speed){
            case FAST:
                s = "быстро";
                break;
            case SLOW:
                s = "медленно";
                break;
        }
        System.out.println(this.name+ " " + s + " " + "шло");
    }


    @Override
    public void getEmotion(Emotions emotions) {
        System.out.println(this.name + " " + emotions.value);

    }

    public void grab(Boy boy){
        System.out.println( this.name + " " + "заполучило бы" + " " + boy.withPower());
    }
    public void lose(String s){
        String result = null;
        switch (s){
            case "no":
                result = "не хочет";
                break;
            case "yes":
                result = "хочет";
                break;
        }
        System.out.println(this.name+ " "+ result + " " + "проиграть");
    }

    public void decide(){
        System.out.println(this.name + " " + "решило");

    }

    public void punish(Boy boy){
        System.out.println( "наказать" + " " + boy.getName());

    }

    public void say(String s){
        System.out.println("- "+ s + " - кричал " + this.name );
    }

    public void put(Character.Hands hands, Character character){
        System.out.println(this.name + " " + "положило" + " " + hands.getName()+ " " +character.getName() );
    }
    public void dance(){
        System.out.println( " танцевало " );

    }
}
