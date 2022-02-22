package com.wzz.adapter.mvc;

import com.wzz.adapter.mvc.service.AService;
import com.wzz.adapter.mvc.service.BService;
import com.wzz.adapter.mvc.service.CService;
import com.wzz.adapter.mvc.service.impl.AServiceImpl;
import com.wzz.adapter.mvc.service.impl.BServiceImpl;
import com.wzz.adapter.mvc.service.impl.CServiceImpl;

public class Test {
    public static void main(String[] args) {
        //定义适配器
        Adapter adapterA = new A();
        Adapter adapterB = new B();
        Adapter adapterC = new C();

        //定义执行业务类
        AService aService = new AServiceImpl();
        BService bService = new BServiceImpl();
        CService cService = new CServiceImpl();

        String handleA = adapterA.handle("wzz", "啦啦啦", aService);
        String handleB = adapterB.handle("hrh", "噜噜噜", bService);
        String handleC = adapterC.handle("lpf", "奖励哥", cService);

        System.out.println(handleA);
        System.out.println(handleB);
        System.out.println(handleC);

    }
}
