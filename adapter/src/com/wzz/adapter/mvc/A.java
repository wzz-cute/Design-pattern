package com.wzz.adapter.mvc;

import com.wzz.adapter.mvc.service.AService;

public class A  implements Adapter{
    @Override
    public String handle(String condition1, String condition2, Object handle) {

        return condition1+condition2+((AService)handle).doAServiceSth("适配器A调用");
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof A);
    }
}
