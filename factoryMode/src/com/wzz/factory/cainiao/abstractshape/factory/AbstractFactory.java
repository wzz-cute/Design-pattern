package com.wzz.factory.cainiao.abstractshape.factory;

import com.wzz.factory.cainiao.shape.service.Color;
import com.wzz.factory.cainiao.shape.service.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(Color color);
    public abstract Shape getShape(Shape shape);
}
