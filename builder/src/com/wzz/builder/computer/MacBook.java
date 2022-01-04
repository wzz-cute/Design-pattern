package com.wzz.builder.computer;

/**
 * 产品类
 */
public class MacBook extends Computer {
    protected MacBook(){

    }

    @Override
    public void setOs() {
        mOs = "Mac OS X 12";
    }
}
