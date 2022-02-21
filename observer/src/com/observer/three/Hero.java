package com.observer.three;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * 条件：在什么时候触发，推送消息
 */
public class Hero {
    private String condition;//条件

    List<Observer> observers = new ArrayList<Observer>();

    /**
     * 添加观察者
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
        // 触发 推送消息
        heroPush();
    }

    public void heroPush() {
        for (Observer observer : observers) {
            observer.push();
        }
    }
}
