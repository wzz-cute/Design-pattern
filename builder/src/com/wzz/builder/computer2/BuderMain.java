package com.wzz.builder.computer2;

public class BuderMain {
    public static void main(String[] args) {
        //指挥者
        ComputerDirector computerDirector = new ComputerDirector();

        //构建
        ComputerBuilder macBuilder = new MacComputerBuilder("R7处理器", "三星125");
        ComputerBuilder lenovoBuilder = new LenovoComputerBuilder("R7处理器", "拯救者系列");

        //造电脑
        computerDirector.makeComputer(macBuilder);
        computerDirector.makeComputer(lenovoBuilder);

        //创建
        Computer macComputer = macBuilder.builder();
        Computer lenovoComputer = lenovoBuilder.builder();

        System.out.println(macComputer.toString());
        System.out.println(lenovoComputer.toString());

    }
}
