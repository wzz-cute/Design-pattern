package com.observer.three;

/**
 * 被观察者 做了什么事 通过 中间者 告诉观察者
 * 中间者
 */
public abstract class Observer {
    protected Hero hero;

    /**
     * 推送消息
     */
    public abstract void push();

}
