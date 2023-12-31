package com.lsz.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ActivityApplicationImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:55
 * @Version 1.0.0
 **/
@Service
public class ActivityApplicationImpl implements ActivityApplication {

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private ActivityInfoBuilderFactory activityInfoBuilderFactory;

    @Override
    public CreateActivityDto createActivity(CreateActivityCommand command) {
        ActivityInfoBuilder activityInfoBuilder = activityInfoBuilderFactory.create();

        ActivityInfo activityInfo = activityInfoBuilder.activityPictureUrl(command.getActivityPictureUrl())
                .activityName(command.getActivityName())
                .activityPrice(command.getActivityPrice())
                .activityStatus(command.getActivityStatus())
                .activityTime(command.getActivityTime())
                .limitNum(command.getLimitNum())
                .productId(command.getProductId())
                .stockNum(command.getStockNum()).build();
        activityRepository.save(activityInfo);

        CreateActivityDto createActivityDto = new CreateActivityDto();
        createActivityDto.setActivityId(activityInfo.getActivityId());
        return createActivityDto;
    }
}
