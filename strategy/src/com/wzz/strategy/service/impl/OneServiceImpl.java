package com.wzz.strategy.service.impl;

import com.wzz.strategy.service.StrategyService;

public class OneServiceImpl implements StrategyService {
    @Override
    public void execute() {
        System.out.println("hrh 在做ex的是");
    }
}
