package com.lsz.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName ActivityInfoAssemblerImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午11:26
 * @Version 1.0.0
 **/
@Component
public class ActivityInfoAssemblerImpl implements ActivityInfoAssembler {

    @Autowired
    private ActivityInfoBuilderFactory activityInfoBuilderFactory;

    @Override
    public ActivityInfo assemble(CreateActivityCommand command) {
        ActivityInfoBuilder activityInfoBuilder = activityInfoBuilderFactory.create();
        return activityInfoBuilder.activityPictureUrl(command.getActivityPictureUrl())
                .activityName(command.getActivityName())
                .activityPrice(command.getActivityPrice())
                .activityStatus(command.getActivityStatus())
                .activityTime(command.getActivityTime())
                .limitNum(command.getLimitNum())
                .productId(command.getProductId())
                .stockNum(command.getStockNum()).build();
    }
}
