package com.company;

import java.util.Objects;

public class Valve {
    Items Вентиль=Items.Вентиль;

    public void interaction(){
        System.out.println(String.format("— на %s не обращая внимания на запах горелого мяса, который поднялся от обуглившейся плоти,",Вентиль));

    }
    public void succumb(){
        System.out.println(String.format("%s поддался",Вентиль));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valve valve = (Valve) o;
        return Вентиль == valve.Вентиль;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Вентиль);
    }

    @Override
    public String toString() {
        return "Valve{" +
                "Вентиль=" + Вентиль +
                '}';
    }


}
