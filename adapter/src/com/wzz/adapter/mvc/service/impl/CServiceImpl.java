package com.wzz.adapter.mvc.service.impl;

import com.wzz.adapter.mvc.service.CService;

public class CServiceImpl implements CService {
    @Override
    public String doCServiceSth(String msg) {
        return "执行C业务" + msg;
    }
}
