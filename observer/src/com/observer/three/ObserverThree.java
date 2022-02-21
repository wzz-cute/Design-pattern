package com.observer.three;

public class ObserverThree extends Observer {
    public ObserverThree(Hero hero) {
        this.hero = hero;
        this.hero.addObserver(this);
    }

    @Override
    public void push() {
        System.out.println("英雄有动静，第三个观察者被推送一次  更新并查询"
                + this.hero.getCondition());
    }
}
