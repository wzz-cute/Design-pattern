package com.wzz.strategy.service.impl;

import com.wzz.strategy.service.StrategyService;

public class TwoServiceImpl implements StrategyService {
    @Override
    public void execute() {
        System.out.println("lpf在奖励自己");
    }
}
