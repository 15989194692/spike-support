package com.lsz.activity;

import com.lsz.common.valueobject.DateRange;
import com.lsz.common.valueobject.Money;

/**
 * @ClassName ActivityInfo
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午9:46
 * @Version 1.0.0
 **/
public class ActivityInfo {

    private Long id;

    private Long activityId;

    private String activityName;

    private Long productId;

    private DateRange activityTime;

    private Long limitNum;

    private Long stockNum;

    private ActivityStatusEnum activityStatus;

    private String activityPictureUrl;

    private Money activityPrice;


    public void startActivity() {
        this.activityStatus = ActivityStatusEnum.STARTING;
    }


    public void stopActivity() {
        this.activityStatus = ActivityStatusEnum.FINISHED;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public DateRange getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(DateRange activityTime) {
        this.activityTime = activityTime;
    }

    public Long getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Long limitNum) {
        this.limitNum = limitNum;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public ActivityStatusEnum getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(ActivityStatusEnum activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getActivityPictureUrl() {
        return activityPictureUrl;
    }

    public void setActivityPictureUrl(String activityPictureUrl) {
        this.activityPictureUrl = activityPictureUrl;
    }

    public Money getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Money activityPrice) {
        this.activityPrice = activityPrice;
    }
}
