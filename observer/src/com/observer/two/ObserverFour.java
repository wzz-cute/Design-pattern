package com.observer.two;

public class ObserverFour extends Observer {
    public ObserverFour(Hero hero){
        this.hero = hero;
        this.hero.atth(this);
    }

    @Override
    public void setOutContion() {
        System.out.println("第四个观察者查询了一条数据"+this.hero.getChooseCondition());
    }
}
