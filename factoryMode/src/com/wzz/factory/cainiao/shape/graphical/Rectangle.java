package com.wzz.factory.cainiao.shape.graphical;

import com.wzz.factory.cainiao.shape.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
