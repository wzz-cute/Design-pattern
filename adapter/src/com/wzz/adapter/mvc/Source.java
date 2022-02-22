package com.wzz.adapter.mvc;

import com.wzz.adapter.mvc.service.AService;
import com.wzz.adapter.mvc.service.BService;
import com.wzz.adapter.mvc.service.CService;
import com.wzz.adapter.mvc.service.impl.AServiceImpl;
import com.wzz.adapter.mvc.service.impl.BServiceImpl;
import com.wzz.adapter.mvc.service.impl.CServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Source {
    private List<Adapter> adapterList = null;

    public void initialization() {
        adapterList = new ArrayList<>();
        Adapter adapterA = new A();
        Adapter adapterB = new B();
        Adapter adapterC = new C();

        adapterList.add(adapterA);
        adapterList.add(adapterB);
        adapterList.add(adapterC);
    }

    public Adapter match(Adapter adapterService) {
        for (Adapter adapter : adapterList) {
            if (adapter.supports(adapterService)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Source source = new Source();
        source.initialization();

        AService aService = new AServiceImpl();
        BService bService = new BServiceImpl();
        CService cService = new CServiceImpl();

        Adapter match = source.match(new C());
        if (match != null) {
            String handle = match.handle("条件1", "条件2", cService);
            System.out.println(handle);
        } else {
            System.out.println("对象为空");
        }
    }
}
