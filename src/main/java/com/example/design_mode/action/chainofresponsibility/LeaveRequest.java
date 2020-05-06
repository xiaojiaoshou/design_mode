package com.example.design_mode.action.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LeaveRequest {
    /**
     * 请假人名字
     */
    private String name;
    /**
     * 请假天数
     */
    private  int  leaveDays;
}
