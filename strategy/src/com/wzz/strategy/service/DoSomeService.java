package com.wzz.strategy.service;

/**
 * 根据方法实现策略者模式
 */
public interface DoSomeService {
    public String doZero(String type);

    public String doOne(String type);

    public String doTwo(String type);

    public String doThree(String type);
}
