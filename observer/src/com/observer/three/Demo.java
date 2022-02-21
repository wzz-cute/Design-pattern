package com.observer.three;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();

        new ObserverOne(hero);
        new ObserverTwo(hero);
        new ObserverThree(hero);

        hero.setCondition("英雄向前五步");

    }
}
