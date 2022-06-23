package com.company;

import java.util.Objects;

public class Wheel {
    Items Колесо=Items.Колесо;
    public void drown(){
        System.out.println(String.format("раскаленное докрасна %s утонуло в ней, будто это была мягкая дорожная грязь.",Колесо));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Колесо == wheel.Колесо;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Колесо);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "Колесо=" + Колесо +
                '}';
    }
}
