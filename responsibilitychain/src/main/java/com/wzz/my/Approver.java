package com.wzz.my;

/**
 * 创建处理者
 */
public abstract class Approver<T> {

    Approver approver;  //下一个处理者

    //下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public Approver getApprover() {
        return approver;
    }

    //处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(T dto,Approver approver);

}
