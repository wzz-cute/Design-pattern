package com.wzz.adapter.mvc;

/**
 * 适配器
 */
public interface Adapter {
    //具体执行业务的方法
    public String handle(String condition1, String condition2, Object handle);

    //判断是否是当前对象
    boolean supports(Object handler);
}
