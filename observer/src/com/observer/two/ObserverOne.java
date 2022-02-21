package com.observer.two;

public class ObserverOne extends Observer {
    public ObserverOne(Hero hero){
        this.hero = hero;
        this.hero.atth(this);
    }

    @Override
    public void setOutContion() {
        System.out.println("第一个观察者添加了一条记录"+this.hero.getChooseCondition());
    }
}
