package com.wzz.factory.cainiao.shape.graphical;

import com.wzz.factory.cainiao.shape.service.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
