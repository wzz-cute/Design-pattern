package com.wzz.builder.computer2;

public class ComputerDirector {
    public void makeComputer(ComputerBuilder computerBuilder) {
        computerBuilder.setDisplay();
        computerBuilder.setkeyboard();
        computerBuilder.setUsbCount();
    }
}
