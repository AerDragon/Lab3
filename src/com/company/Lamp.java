package com.company;

public class Lamp {
    private String name = "лампочки";

    public String getName(){return name;}

    public void lampView(LampStatus lampStatusColor, LampStatus lampStatus, Light light){
//        light.lightState(lampStatus);
//        light.lightColor(lampStatusColor);
        System.out.println(light.lightState(lampStatus) + " "+light.lightColor(lampStatusColor)+ " " + light.name+ " " + this.name);
    }


    public static class Light{
        private String name = "свет";

        public String getName(){return name;}

        public String lightColor(LampStatus lampStatus){
            String s = null;
            switch (lampStatus){
                case YELLOW:
                    s = "желтый";
                    break;
                case RED:
                    s = "красный";
                    break;
                case GREEN:
                    s = "зеленый";
                    break;

            }
            return s;
        }

        public String lightState(LampStatus lampStatus){
            String s = null;
            switch (lampStatus){
                case WEAK_LIGHT:
                    s = "слабый";
                    break;
                case STRONG_LIGHT:
                    s = "яркий";
                    break;
            }
            return s;
        }



    }
}
