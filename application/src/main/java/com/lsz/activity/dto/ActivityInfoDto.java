package com.lsz.activity.dto;

import com.lsz.common.valueobject.DateRange;
import com.lsz.common.valueobject.Money;

/**
 * @ClassName ActivityInfoDto
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 上午10:25
 * @Version 1.0.0
 **/
public class ActivityInfoDto {
    private Long id;

    private Long activityId;

    private String activityName;

    private Long productId;

    private DateRange activityTime;

    private Long limitNum;

    private Long stockNum;

    private String activityStatus;

    private String activityPictureUrl;

    private Money activityPrice;

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

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
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
