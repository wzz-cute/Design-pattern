package com.wzz.factory.cainiao.shape;

import com.wzz.factory.cainiao.abstractshape.color.Blue;
import com.wzz.factory.cainiao.abstractshape.factory.TotalFactory;
import com.wzz.factory.cainiao.shape.factory.ShapeFactory;
import com.wzz.factory.cainiao.shape.graphical.Circle;
import com.wzz.factory.cainiao.shape.service.Color;
import com.wzz.factory.cainiao.shape.service.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        TotalFactory totalFactory = new TotalFactory();
        Shape circle = totalFactory.getShape(new Circle());
        circle.draw();

        Color color = totalFactory.getColor(new Blue());
        color.fill();
    }
}
