package com.example.design_mode.action.chainofresponsibility;

public class Test {

    public static void main(String[] args) {
        AbstractLeaveHandler competentLeaveHandler = new CompetentLeaveHandler();
        AbstractLeaveHandler managerLeaveHandler = new ManagerLeaveHandler();
        AbstractLeaveHandler directorLeaveHandler = new DirectorLeaveHandler();

        competentLeaveHandler.setNextHandler(managerLeaveHandler);
        managerLeaveHandler.setNextHandler(directorLeaveHandler);

        LeaveRequest leaveRequest = LeaveRequest
                .builder()
                .leaveDays(9)
                .name("张三")
                .build();

        competentLeaveHandler.handlerRequest(leaveRequest);





    }
}
