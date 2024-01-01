package com.lsz.activity.dto;

/**
 * @ClassName CreateActivityDto
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:59
 * @Version 1.0.0
 **/
public class StartActivityDto {

    private Long activityId;

    private Boolean succss;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Boolean getSuccss() {
        return succss;
    }

    public void setSuccss(Boolean succss) {
        this.succss = succss;
    }
}
