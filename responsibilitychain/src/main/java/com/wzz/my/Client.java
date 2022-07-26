package com.wzz.my;

import com.wzz.my.chain.Handle;
import com.wzz.my.chain.ResponsibilityChain;
import com.wzz.my.dto.BusinessDto;
import com.wzz.my.entity.*;

public class Client {
    public static void main(String[] args) {
        //模拟前端传入dto
        BusinessDto businessDto = new BusinessDto();
        set(businessDto);

        //初始化传入dto
        ResponsibilityChain chain = new ResponsibilityChain<BusinessDto>(businessDto);

        Handle handle = new Handle();

        //此处需要注意顺序

        chain.addApprovers(handle.new ProductApprover());
        chain.addApprovers(handle.new RoleApprover());
        chain.addApprovers(handle.new UserApprover());
        chain.addApprovers(handle.new Test1Approver());
        chain.addApprovers(handle.new Test2Approver());

        chain.execute();//执行

    }

    private static void set(BusinessDto businessDto) {
        User user = new User();

        Test3 test3 = new Test3();
        user.setTest3(test3);

        Product product = new Product();

        Role role = new Role();

        Test1 test1 = new Test1();

        Test2 test2 = new Test2();

        businessDto.setUser(user);
        businessDto.setProduct(product);
        businessDto.setRole(role);
        businessDto.setTest1(test1);
        businessDto.setTest2(test2);
    }
}
