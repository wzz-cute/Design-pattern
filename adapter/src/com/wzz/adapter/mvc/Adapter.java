package com.wzz.adapter.mvc;

public interface Adapter {
    public String handle(String condition1, String condition2, Object handle);
    boolean supports(Object handler);
}
