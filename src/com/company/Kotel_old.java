package com.company;

import java.util.Objects;

public class Kotel_old extends Inanimate {
    Items Котел=Items.Котел;

    public void puffing() {
        System.out.print(String.format("%s пыхтел ",Котел));

    }

    public void scrambled() {
        System.out.println(",скрежетал, и как каллиопа");

    }
    public void released(){
        System.out.println("с шипением выпускал по всем направлениям облачка пара.");

    }
    public void hot() {
        System.out.println("Половина  корпуса раскалилась докрасна");

    }
    public void absorbed(){
        System.out.println("Слившиеся в пронзительный вопль торжества слова поглотил разрушительный рев");
    }
    public void exploded(){
        System.out.println("— это взорвался котел \"Оверлука\"");

    }
    @Override
    public String toString() {
        return "Kotel{" +
                "Котел=" + Котел +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kotel_old kotelOld = (Kotel_old) o;
        return Котел == kotelOld.Котел;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Котел);
    }

}
