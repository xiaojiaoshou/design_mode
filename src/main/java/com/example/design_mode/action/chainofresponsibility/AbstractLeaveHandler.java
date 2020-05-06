package com.example.design_mode.action.chainofresponsibility;

public abstract class AbstractLeaveHandler {

    /**
     * 审批的天数
     */
    protected int allownDays;

    /**
     * 领导名称
     */
    protected String handlerName;
    /**
     * 下一个节点
     */
    protected AbstractLeaveHandler nextAbstractLeaveHandler;


    public void setNextHandler(AbstractLeaveHandler nextAbstractLeaveHandler) {
        this.nextAbstractLeaveHandler = nextAbstractLeaveHandler;
    }


    abstract void handlerRequest(LeaveRequest leaveRequest);

}
