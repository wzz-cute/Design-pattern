package com.wzz.my.chain;

import com.wzz.my.Approver;

/**
 * 创建职责链处理类
 */
public class ResponsibilityChain<T> {
    private T dto;
    //    private List<Approver> approvers = new ArrayList<>();
    private Approver approver = new Approver<T>() {
        @Override
        public void processRequest(T dto, Approver approver) {

        }
    };

    public ResponsibilityChain(T dto) {
        this.dto = dto;
    }

    public void addApprovers(Approver approver) {
        Approver head = this.approver;
        while (head.getApprover() != null) {
            if (head.getApprover() == null) {
                break;
            }
            head = head.getApprover();
        }
        head.setApprover(approver);
//        this.approvers.add(approver);
    }

    public void execute() {
        Approver head = this.approver.getApprover();

        if (head != null) {
            head.processRequest(this.dto, head.getApprover());
        }
        System.out.println("执行完毕");

//        for (Approver approver : this.approvers) {
//            approver.processRequest(this.dto);
//        }
    }

}
