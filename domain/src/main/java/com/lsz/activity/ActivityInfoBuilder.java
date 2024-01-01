package com.lsz.activity;

import com.lsz.common.valueobject.DateRange;
import com.lsz.common.valueobject.Money;
import com.lsz.sequence.SequenceService;
import com.lsz.sequence.SequenceTypeEnum;

/**
 * @ClassName ActivityInfoBuilder
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午11:04
 * @Version 1.0.0
 **/
public class ActivityInfoBuilder {

    private final SequenceService sequenceService;

    public ActivityInfoBuilder(SequenceService sequenceService) {
        this.sequenceService = sequenceService;
    }

    private Long activityId;

    private String activityName;

    private Long productId;

    private DateRange activityTime;

    private Long limitNum;

    private Long stockNum;

    private String activityStatus;

    private String activityPictureUrl;

    private Money activityPrice;


    public ActivityInfoBuilder activityName(String activityName) {
        this.activityName = activityName;
        return this;
    }

    public ActivityInfoBuilder activityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }

    public ActivityInfoBuilder activityPictureUrl(String activityPictureUrl) {
        this.activityPictureUrl = activityPictureUrl;
        return this;
    }

    public ActivityInfoBuilder activityPrice(Money activityPrice) {
        this.activityPrice = activityPrice;
        return this;
    }

    public ActivityInfoBuilder productId(Long productId) {
        this.productId = productId;
        return this;
    }

    public ActivityInfoBuilder limitNum(Long limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    public ActivityInfoBuilder stockNum(Long stockNum) {
        this.stockNum = stockNum;
        return this;
    }


    public ActivityInfoBuilder activityTime(DateRange activityTime) {
        this.activityTime = activityTime;
        return this;
    }

    public ActivityInfo build() {
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityName(activityName);
        activityInfo.setActivityPictureUrl(activityPictureUrl);
        activityInfo.setActivityPrice(activityPrice);
        activityInfo.setActivityStatus(ActivityStatusEnum.getByCode(activityStatus));
        activityInfo.setActivityTime(activityTime);
        activityInfo.setLimitNum(limitNum);
        activityInfo.setStockNum(stockNum);
        activityInfo.setProductId(productId);
        activityInfo.setActivityId(sequenceService.generateUniqueId(SequenceTypeEnum.ACTIVITY_ID));
        return activityInfo;
    }

}
