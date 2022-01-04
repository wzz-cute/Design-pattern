package com.wzz.builder.computer;

/**
 * 抽象构建
 * 由子类构建其中的几个属性
 */
public abstract class Builder {
    abstract void buildBoard(String board);
    abstract void buildDisplay(String display);
    abstract void buildOs();
    abstract Computer build();
}
