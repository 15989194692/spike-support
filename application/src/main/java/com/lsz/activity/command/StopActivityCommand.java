package com.lsz.activity.command;

/**
 * @ClassName CreateActivityCommand
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:56
 * @Version 1.0.0
 **/
public class StopActivityCommand {


    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
