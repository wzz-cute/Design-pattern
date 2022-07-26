package com.wzz.factory.cainiao.shape.factory;

import com.wzz.factory.cainiao.shape.graphical.Circle;
import com.wzz.factory.cainiao.shape.graphical.Rectangle;
import com.wzz.factory.cainiao.shape.graphical.Square;
import com.wzz.factory.cainiao.shape.service.Shape;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    //根据传入形状的实现类返回
    public Shape getShape(Shape shape){
        return shape;
    }
}
