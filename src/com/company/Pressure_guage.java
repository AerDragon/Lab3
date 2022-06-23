package com.company;

import java.util.Objects;

public class Pressure_guage implements Action {
    Items Стрелка_Монометра=Items.Стрелка_Монометра;

    @Override
    public void RunAway(String object) {
        System.out.println(object+" " +"убежала на дальний конец шкалы.");
    }
    public void decline(){
        System.out.println("она начала отклоняться обратно");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pressure_guage that = (Pressure_guage) o;
        return Стрелка_Монометра == that.Стрелка_Монометра;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Стрелка_Монометра);
    }

    @Override
    public String toString() {
        return "Pressure_guage{" +
                "Стрелка_Монометра=" + Стрелка_Монометра +
                '}';
    }
}
