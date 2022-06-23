package com.company;

import java.util.Objects;

public class Furnace {
    Items Топка=Items.Топка;

    void locate(){
        System.out.println(String.format("где находилась %s ",Топка));
    }
    @Override
    public String toString() {
        return "Furnace{" +
                "Топка=" + Топка +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furnace furnace = (Furnace) o;
        return Топка == furnace.Топка;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Топка);
    }
}
