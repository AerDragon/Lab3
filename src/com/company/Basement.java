package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Basement {
    public static void main(String[] args) {
        Creature creature = new Creature("существо");
        Character character = new Character("смотритель");
        Character jackTorans = new Character("Джека Торанса");
        Boy boy = new Boy();
        Lamp lamp = new Lamp();
        Kotel kotel = new Kotel();
        Lamp.Light light = new Lamp.Light();
        Creature_old creatureOld =new Creature_old();
        Dragon dragon=new Dragon();
        Kotel_old kotelOld =new Kotel_old();
        Calliope calliope=new Calliope();
        Pressure_guage pressure_guage=new Pressure_guage();

        Steam steam=new Steam();
        Valve valve=new Valve();
        Furnace furnace=new Furnace();
        Wheel wheel=new Wheel();
        Pressure pressure = new Pressure();
        Kotel.Korpus korpus = new Kotel.Korpus();
        Kotel.Ventil ventil = new Kotel.Ventil();
        Monometr.Arrow arrow = new Monometr.Arrow();
        Monometr monometr = new Monometr();
        Character.Hands hands = new Character.Hands();
        Roar roar = new Roar();

        creature.walking(Speed.FAST);
        System.out.print(ShortWords.ON.value + " ");
        lamp.lampView(LampStatus.YELLOW,LampStatus.WEAK_LIGHT, light);
        creature.getEmotion(Emotions.FEAR);

        System.out.print(ShortWords.A_LITTLE.value + " ");
        creature.grab(boy);
        System.out.print(ShortWords.NOW.value + " ");
        creature.lose("no");
        creature.decide();
        pressure.setStatus("down");
        pressure.pressureAction();
        System.out.print(" " + ShortWords.IN.value + " ");
        System.out.println(kotel.getName() + "_e");
        creature.decide();
        creature.punish(boy);

        creature.say("Нельзя!");

        creature.walking(Speed.FAST);
        System.out.print(ShortWords.TO.value + " ");
        System.out.println(kotel.getName() + "_У");
        korpus.goingHot(kotel);
        korpus.makeHeat();
        kotel.puff();
        kotel.creak();
        System.out.print(ShortWords.LIKE_A.value + " ");
        calliope.calliopeView();

        System.out.println("Если вы не знаете, что такое [калиопа] :");
        System.out.println("1 - вывести справку");
        System.out.println("2 - продолжить программу");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            String number = scanner.next();
            try {
                if (Objects.equals(number, "1")) {
                    calliope.description();
                    flag = true;
                } else if (!Objects.equals(number, "2")) {
                    System.out.println("Некорректный ввод! Введите 1 или 2");
                }
            } catch (Exception e) {
                System.out.println("А надо было вводить нормально");
            }
        }

        kotel.goesSteam(pressure);
        arrow.arrowStatus(pressure);
        character.say("Этого нельзя допустить!");
        creature.put(hands,jackTorans);
        System.out.println(ShortWords.ON.value + " " + ventil.getName());
        hands.heating(jackTorans);
        ventil.open();
        steam.escaped(kotel,pressure);
        arrow.arrowStatus(pressure);
        steam.hidden(arrow, monometr);

        creature.say("Победа!");
        creature.getEmotion(Emotions.FUN);
        creature.dance();
        creature.say("Успел!");
        roar.listenRoar();
        System.out.println(ShortWords.THIS_IS.value + " " );
        kotel.explain();



    }

}

