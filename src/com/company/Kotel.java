package com.company;

public class Kotel {

    private String name = "Котел";
    public String getName(){ return name;}

    public void puff(){
        System.out.println(this.name + " " + "пыхтел");
    }
    public void creak(){
        System.out.println(this.name + " " + "скрежетал");
    }
    public void goesSteam(Pressure pressure){
        Steam steam = new Steam();

        System.out.println(this.name + " " + "выпускал" + " " + steam.getName());
        pressure.setStatus("up");
    }

    public void explain(){
        System.out.println(this.name + " " + "взорвался");

    }
    public static class Korpus{
        private String name = "корпус";
        public String getName(){ return name;}

        public void goingHot(Kotel kotel){
            System.out.println(this.name+" " + kotel.getName()+"_a"+ " раскалился");
        }
        public void makeHeat(){
            Heat heat = new Heat();
            System.out.println(this.name+" "+ "излучал" + " " + heat.getName());
        }
    }
    public static class Ventil{
        private String name = "вентиль";
        public String getName(){ return name;}

        public void goingHot(){
            System.out.println(" "+ "раскалился");
        }
        public void makeHeat(){
            Heat heat = new Heat();
            System.out.println(" "+ "излучая" + " " + heat.getName());
        }
        public void open(){
            System.out.println(this.name+" открылся");
        }
    }
}
