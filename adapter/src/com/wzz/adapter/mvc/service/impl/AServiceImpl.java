package com.wzz.adapter.mvc.service.impl;

import com.wzz.adapter.mvc.service.AService;

public class AServiceImpl implements AService {
    @Override
    public String doAServiceSth(String msg) {
        return "执行A业务" + msg;
    }
}
