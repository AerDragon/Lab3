package com.company;

public class Pressure implements PressureAction{
    private String name = "давление";
    private String status = null;

    public String getName(){return name;}
    public void setStatus(String status){ this.status = status;}

    public String getStatus(){return status;}

    @Override
    public void pressureAction() {

        String s = null;
        switch (status){
            case "down":
                s = "скинуть";
                break;
            case "up":
                s = "поднять";
                break;
        }
        System.out.println(s+" "+this.getName() );
    }
}