package com.wzz.factory.cainiao.shape.graphical;

import com.wzz.factory.cainiao.shape.service.Shape;

public class Circle implements Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
