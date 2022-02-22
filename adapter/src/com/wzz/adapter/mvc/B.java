package com.wzz.adapter.mvc;

import com.wzz.adapter.mvc.service.AService;
import com.wzz.adapter.mvc.service.BService;

public class B implements Adapter {
    @Override
    public String handle(String condition1, String condition2, Object handle) {
        return condition1+condition2+((BService)handle).doBServiceSth("适配器B调用");
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof B);
    }
}
