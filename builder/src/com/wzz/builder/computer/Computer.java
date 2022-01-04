package com.wzz.builder.computer;

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    //只有子类能够实现
    protected Computer() {
    }


    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        this.mDisplay = display;

    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
