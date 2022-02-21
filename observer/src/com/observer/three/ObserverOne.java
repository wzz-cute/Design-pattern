package com.observer.three;

public class ObserverOne extends Observer {
    public ObserverOne(Hero hero) {
        this.hero = hero;
        this.hero.addObserver(this);
    }

    @Override
    public void push() {
        System.out.println("英雄有动静，第一个观察者被推送一次  执行查询操作"
                + this.hero.getCondition());
    }
}
