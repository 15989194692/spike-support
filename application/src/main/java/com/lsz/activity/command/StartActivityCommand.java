package com.lsz.activity.command;

import com.lsz.common.valueobject.DateRange;
import com.lsz.common.valueobject.Money;

/**
 * @ClassName CreateActivityCommand
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:56
 * @Version 1.0.0
 **/
public class StartActivityCommand {


    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
