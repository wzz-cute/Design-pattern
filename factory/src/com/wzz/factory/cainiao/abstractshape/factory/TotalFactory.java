package com.wzz.factory.cainiao.abstractshape.factory;

import com.wzz.factory.cainiao.shape.service.Color;
import com.wzz.factory.cainiao.shape.service.Shape;

public class TotalFactory extends AbstractFactory {
    @Override
    public Color getColor(Color color) {
        return color;
    }

    @Override
    public Shape getShape(Shape shape) {
        return shape;
    }
}
