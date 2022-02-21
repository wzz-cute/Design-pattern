package com.observer.two;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String chooseCondition;
    private List<Observer> observers = new ArrayList<>();

    public void atth(Observer observer) {
        observers.add(observer);
    }

    public String getChooseCondition() {
        return chooseCondition;
    }

    public void setChooseCondition(String chooseCondition) {
        this.chooseCondition = chooseCondition;
        update();
    }

    public void update() {
        for (Observer observer : observers) {
            observer.setOutContion();
        }
    }
}
