package com.wzz.strategy.util;

import com.wzz.strategy.point.StrategyPoint;

import java.lang.reflect.Method;

public class StrategyReflex {

    public static Object getInvoke(String type, StrategyPoint classMethod) throws Exception {
        //根据类路径反射出class
        Class<?> aClass = Class.forName(classMethod.getClassPath());

        //根据class与方法名执行 返回Object
        Method method = aClass.getMethod(classMethod.getMethodName(), String.class);
        return method.invoke(aClass.newInstance(), type);
    }
}
