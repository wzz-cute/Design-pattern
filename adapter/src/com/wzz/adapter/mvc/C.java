package com.wzz.adapter.mvc;

import com.wzz.adapter.mvc.service.BService;
import com.wzz.adapter.mvc.service.CService;

public class C implements Adapter {
    @Override
    public String handle(String condition1, String condition2, Object handle) {
        return condition1 + condition2 + ((CService) handle).doCServiceSth("适配器C调用");
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof C);
    }
}
