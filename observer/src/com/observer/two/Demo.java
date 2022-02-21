package com.observer.two;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        new ObserverOne(hero);
        new ObserverTwo(hero);
        new ObserverThree(hero);
        new ObserverFour(hero);
        
        hero.setChooseCondition("abc");

        hero.setChooseCondition("bbb");
    }
}
