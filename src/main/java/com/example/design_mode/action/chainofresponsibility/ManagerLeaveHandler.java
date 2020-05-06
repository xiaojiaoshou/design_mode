package com.example.design_mode.action.chainofresponsibility;


/**
 * 部门经理
 */
public class ManagerLeaveHandler  extends  AbstractLeaveHandler {

    public ManagerLeaveHandler() {
        super.allownDays = 7;
        super.handlerName = "直接主管:张主管";
    }

    @Override
    void handlerRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() <= allownDays) {
            System.out.println(handlerName + "审批了" + leaveRequest.getName() + "的" + leaveRequest.getLeaveDays() + "请假");
        } else {
            if (this.nextAbstractLeaveHandler == null) {
                System.out.println("拒绝了你的请假要求");
                return;
            }
            this.nextAbstractLeaveHandler.handlerRequest(leaveRequest);
        }
    }

}
