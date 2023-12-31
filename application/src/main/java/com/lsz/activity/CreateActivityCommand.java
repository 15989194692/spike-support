package com.lsz.activity;

import com.lsz.common.valueobject.DateRange;
import com.lsz.common.valueobject.Money;

/**
 * @ClassName CreateActivityCommand
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:56
 * @Version 1.0.0
 **/
public class CreateActivityCommand {

    private String activityName;

    private Long productId;

    private DateRange activityTime;

    private Long limitNum;

    private Long stockNum;

    private String activityStatus;

    private String activityPictureUrl;

    private Money activityPrice;

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
