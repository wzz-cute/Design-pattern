package com.observer.three;

public class ObserverTwo extends Observer {
    public ObserverTwo(Hero hero) {
        this.hero = hero;
        this.hero.addObserver(this);
    }

    @Override
    public void push() {
        System.out.println("英雄有动静，第二个观察者被推送一次  更新操作"
                + this.hero.getCondition());
    }
}
