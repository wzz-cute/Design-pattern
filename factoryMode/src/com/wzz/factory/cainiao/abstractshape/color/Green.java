package com.wzz.factory.cainiao.abstractshape.color;

import com.wzz.factory.cainiao.shape.service.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
