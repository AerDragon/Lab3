package com.company;

public class Steam {

    private String name = "пар";

    public String getName(){return name;}

    public void escaped(Kotel kotel,Pressure pressure){
        System.out.println( this.name + " вырвался из " + kotel.getName() + "_a");
        pressure.setStatus("down");
    }
    public void hidden(Monometr.Arrow arrow, Monometr monometr){
        System.out.println(this.name+ " скрыл " +arrow.getName()+ " " + monometr.getName() );
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
    public String toString() {
        return "Steam{}";
    }

}
