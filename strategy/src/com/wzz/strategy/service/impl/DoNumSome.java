package com.wzz.strategy.service.impl;

import com.wzz.strategy.service.DoSomeService;

public class DoNumSome implements DoSomeService {
    @Override
    public String doZero(String type) {
        return "wzz在做正事";
    }

    @Override
    public String doOne(String type) {
        return "hrh在做ex的事";
    }

    @Override
    public String doTwo(String type) {
        return "lpf再奖励自己";
    }

    @Override
    public String doThree(String type) {
        return "阿屎和pf一起奖励";
    }
}
