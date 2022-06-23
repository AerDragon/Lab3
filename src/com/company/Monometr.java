package com.company;

public class Monometr {
    private String name = "монометра";


    public String getName(){return name;}



    public static class Arrow{
        private String name = "стрелка";

        public String getName(){return name;}

        public void arrowStatus(Pressure pressure){
            Monometr monometr = new Monometr();
            if (pressure.getStatus().equals("up")){
                System.out.println(this.name + " " + monometr.getName() + " " + "поднялась вверх");
            } else  System.out.println(this.name + " " + monometr.getName() + " " + "опустилась вниз");
        }

    }
}
