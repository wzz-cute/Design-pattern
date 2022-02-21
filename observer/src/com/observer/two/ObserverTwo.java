package com.observer.two;

public class ObserverTwo extends Observer{
    public ObserverTwo(Hero hero){
        this.hero = hero;
        this.hero.atth(this);
    }

    @Override
    public void setOutContion() {
        System.out.println("第二个观察者更新了一条数据"+this.hero.getChooseCondition());
    }
}
