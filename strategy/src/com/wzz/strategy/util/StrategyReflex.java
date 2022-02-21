package com.wzz.strategy.util;

import com.wzz.strategy.point.StrategyPoint;

import java.lang.reflect.Method;

public class StrategyReflex {

    public static Object getInvoke(String type, StrategyPoint classMethod) throws Exception {
        Class<?> aClass = Class.forName(classMethod.getClassPath());

        Method method = aClass.getMethod(classMethod.getMethodName(), String.class);
        return method.invoke(aClass.newInstance(), type);
    }
}
