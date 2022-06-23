package com.company;

public class Boy extends Entity {
    private String name = "мальчишку";

    public String getName(){return name;}

    public String withPower(){
        String boy_with = this.name + " " + "с его ";
        Power p = new Power();
//        p.sthIsWonderfull();
        return boy_with +  p.sthIsWonderfull();
    }



    public class Power implements Wonderfull{
        private String name = "силой";

        public String getName(){return name;}

        @Override
        public String sthIsWonderfull() {
            String a;
            return  a = "замечательной" +" "+ this.name;
        }
    }

}
