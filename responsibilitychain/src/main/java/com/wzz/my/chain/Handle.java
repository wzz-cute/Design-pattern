package com.wzz.my.chain;

import com.wzz.my.Approver;
import com.wzz.my.dto.BusinessDto;

public class Handle {
    public class ProductApprover extends Approver {
        public void processRequest(Object businessDto, Approver approver) {
            BusinessDto dto = (BusinessDto) businessDto;
            if (dto.getProduct() != null) {
                System.out.println("执行product业务");
            }

            if (approver != null) {
                approver.processRequest(dto, approver.getApprover());
            }
            return;
        }
    }

    public class RoleApprover extends Approver {
        public void processRequest(Object businessDto, Approver approver) {
            BusinessDto dto = (BusinessDto) businessDto;
            if (dto.getRole() != null) {
                System.out.println("执行Role业务");
            }

            if (approver != null) {
                approver.processRequest(dto, approver.getApprover());
            }
            return;
        }
    }

    public class UserApprover extends Approver {
        public void processRequest(Object businessDto, Approver approver) {
            BusinessDto dto = (BusinessDto) businessDto;
            if (dto.getUser() != null) {
                System.out.println("执行User业务");
            }
            if (dto.getUser().getTest3()!=null){
                System.out.println("执行Test3业务");
            }

            if (approver != null) {
                approver.processRequest(dto, approver.getApprover());
            }
            return;
        }
    }

    public class Test1Approver extends Approver {
        @Override
        public void processRequest(Object businessDto, Approver approver) {
            BusinessDto dto = (BusinessDto) businessDto;
            if (dto.getTest1() != null) {
                System.out.println("Test1执行");
            }

            if (approver != null) {
                approver.processRequest(dto, approver.getApprover());
            }
            return;
        }
    }

    public class Test2Approver extends Approver {
        @Override
        public void processRequest(Object businessDto, Approver approver) {
            BusinessDto dto = (BusinessDto) businessDto;
            if (dto.getTest2() != null) {
                System.out.println("执行Test2业务");
            }

            if (approver != null) {
                approver.processRequest(dto, approver.getApprover());
            }
            return;
        }
    }
}
