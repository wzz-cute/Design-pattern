package com.wzz.adapter.mvc.service.impl;

import com.wzz.adapter.mvc.service.BService;

public class BServiceImpl implements BService {
    @Override
    public String doBServiceSth(String msg) {
        return "执行B业务" + msg;
    }
}
