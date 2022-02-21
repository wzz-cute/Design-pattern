package com.observer.two;

public class ObserverThree extends Observer {
    public ObserverThree(Hero hero){
        this.hero = hero;
        this.hero.atth(this);
    }
    @Override
    public void setOutContion() {
        System.out.println("第三个观察者删除了一条消息"+this.hero.getChooseCondition());
    }
}
