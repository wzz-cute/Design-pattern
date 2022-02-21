package com.wzz.builder.computer2;

/**
 * 必选的填入构造函数，不提供get/set方法
 */
public class Computer {
    private String cup;//必选
    private String ram;//必选
    private String usbCount;
    private String keyboard;
    private String display;

    private Computer() {

    }

    public Computer(String cup, String ram) {
        this.cup = cup;
        this.ram = ram;
    }

    public String getUsbCount() {
        return usbCount;
    }

    public void setUsbCount(String usbCount) {
        this.usbCount = usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cup='" + cup + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount='" + usbCount + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
