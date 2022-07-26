package com.wzz.strategy;

import com.wzz.strategy.point.StrategyPoint;
import com.wzz.strategy.service.StrategyService;
import com.wzz.strategy.util.StrategyReflex;

public class PlainTest {
    public static void main(String[] args) throws Exception {
//        原本业务
//        int type = 0;
//        if (type == 0) { //模拟业务操作
//            System.out.println("wzz 在做好事");
//        } else if (type == 1) { //就把type 作为条件
//            System.out.println("hrh 在做ex的是");
//        } else if (type == 2) {
//            System.out.println("lpf在奖励自己");
//        } else if (type == 3) {
//            System.out.println("li ju帮pf奖励");
//        }

        //策略者模式实现 根据实现类
//        String type = "1";
//        String classPath = StrategyPoint.getClass(type);
//        StrategyService strategyService = (StrategyService)Class.forName(classPath).newInstance();
//        strategyService.execute();

        String type = "2";
        StrategyPoint classMethod = StrategyPoint.getClassMethod(type);
        Object invoke = StrategyReflex.getInvoke(type, classMethod);
        System.out.println(invoke);

    }

}
