package com.lsz.activity.service;

import com.lsz.activity.*;
import com.lsz.activity.assembler.ActivityInfoDtoAssembler;
import com.lsz.activity.command.CreateActivityCommand;
import com.lsz.activity.dto.ActivityInfoDto;
import com.lsz.activity.dto.CreateActivityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName ActivityApplicationImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:55
 * @Version 1.0.0
 **/
@Service
public class ActivityApplicationServiceImpl implements ActivityApplicationService {

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private ActivityInfoBuilderFactory activityInfoBuilderFactory;

    @Autowired
    private ActivityInfoDtoAssembler activityInfoDtoAssembler;

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

    @Override
    public List<ActivityInfoDto> queryByCondition(ActivityInfoQuery query) {
        List<ActivityInfo> activityInfos = activityRepository.queryByCondition(query);
        return activityInfos.stream()
                .map(activityInfoDtoAssembler::assemble)
                .collect(Collectors.toList());
    }
}
