package com.wzz.strategy.service.impl;

import com.wzz.strategy.service.StrategyService;

public class ZeroServiceImpl implements StrategyService {
    @Override
    public void execute() {
        System.out.println("wzz 在做好事");
    }
}
