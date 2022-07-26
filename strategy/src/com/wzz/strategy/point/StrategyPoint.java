package com.wzz.strategy.point;

public enum StrategyPoint {
    //根据实现类实现
//    DO_ZERO("0", "com.wzz.strategy.service.impl.ZeroServiceImpl"),
//    DO_ONE("1", "com.wzz.strategy.service.impl.OneServiceImpl"),
//    DO_TWO("2", "com.wzz.strategy.service.impl.TwoServiceImpl"),
//    DO_THREE("3", "com.wzz.strategy.service.impl.ThreeServiceImpl"),
    BASE_PATH("","com.wzz.strategy.service.impl.DoNumSome"),
    //根据方法进实现
    DO_ZERO_MOTHOD("0", BASE_PATH.getClassPath(), "doZero"),
    DO_ONE_MOTHOD("1", BASE_PATH.getClassPath(), "doOne"),
    DO_TWO_MOTHOD("2", BASE_PATH.getClassPath(), "doTwo"),
    DO_THREE_MOTHOD("3", BASE_PATH.getClassPath(), "doThree");

    private String type;
    private String classPath;
    private String methodName;

    StrategyPoint(String type, String classPath) {
        this.type = type;
        this.classPath = classPath;
    }

    StrategyPoint(String classPath) {
        this.classPath = classPath;
    }

    StrategyPoint(String type, String classPath, String methodName) {
        this.type = type;
        this.classPath = classPath;
        this.methodName = methodName;
    }

    // 根据类型获取class路径
    public static String getClass(String type) {
        for (StrategyPoint s : StrategyPoint.values()) {
            if (s.getType().equals(type)) {
                return s.getClassPath();
            }
        }
        return null;
    }


    public static StrategyPoint getClassMethod(String type) {
        for (StrategyPoint s : StrategyPoint.values()) {
            if (s.getType().equals(type)) {
                return s;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
