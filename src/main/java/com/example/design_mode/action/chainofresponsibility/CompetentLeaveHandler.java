package com.example.design_mode.action.chainofresponsibility;


/**
 * 直接主管 允许 3天
 */
public class CompetentLeaveHandler extends AbstractLeaveHandler {

//    /**
//     * 审批的天数
//     */
//    protected int allownDays=3;

    public CompetentLeaveHandler() {
        super.allownDays = 3;
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
