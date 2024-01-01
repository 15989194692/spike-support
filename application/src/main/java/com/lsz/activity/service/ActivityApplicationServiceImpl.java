package com.lsz.activity.service;

import com.lsz.activity.*;
import com.lsz.activity.assembler.ActivityInfoDtoAssembler;
import com.lsz.activity.command.CreateActivityCommand;
import com.lsz.activity.command.StartActivityCommand;
import com.lsz.activity.command.StopActivityCommand;
import com.lsz.activity.domainservice.ActivityDomainService;
import com.lsz.activity.dto.ActivityInfoDto;
import com.lsz.activity.dto.CreateActivityDto;
import com.lsz.activity.dto.StartActivityDto;
import com.lsz.activity.dto.StopActivityDto;
import com.lsz.product.ProductInfo;
import com.lsz.product.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.Assert;

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

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private ActivityDomainService activityDomainService;

    @Autowired
    private TransactionTemplate transactionTemplate;

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
    public StartActivityDto startActivity(StartActivityCommand command) {
        ActivityInfo activityInfo = activityRepository.queryByPrimaryId(command.getActivityId());
        ProductInfo productInfo = productInfoRepository.queryByPrimaryId(activityInfo.getProductId());
        activityDomainService.startSpikeActivity(activityInfo, productInfo);
        transactionTemplate.execute(action -> {
            boolean updateActivitySuccess = activityRepository.update(activityInfo);
            Assert.isTrue(updateActivitySuccess, "update activity record fail,activityInfo: " + activityInfo);
            boolean updateProductSuccess = productInfoRepository.update(productInfo);
            Assert.isTrue(updateProductSuccess, "update product record fail,productInfo: " + productInfo);
            return true;
        });

        StartActivityDto startActivityDto = new StartActivityDto();
        startActivityDto.setActivityId(activityInfo.getActivityId());
        startActivityDto.setProductId(productInfo.getProductId());
        startActivityDto.setSuccss(true);

        return startActivityDto;
    }

    @Override
    public StopActivityDto stopActivity(StopActivityCommand command) {
        ActivityInfo activityInfo = activityRepository.queryByPrimaryId(command.getActivityId());
        ProductInfo productInfo = productInfoRepository.queryByPrimaryId(activityInfo.getProductId());
        activityDomainService.stopSpikeActivity(activityInfo, productInfo);
        transactionTemplate.execute(action -> {
            boolean updateActivitySuccess = activityRepository.update(activityInfo);
            Assert.isTrue(updateActivitySuccess, "update activity record fail,activityInfo: " + activityInfo);
            boolean updateProductSuccess = productInfoRepository.update(productInfo);
            Assert.isTrue(updateProductSuccess, "update product record fail,productInfo: " + productInfo);
            return true;
        });

        StopActivityDto stopActivityDto = new StopActivityDto();
        stopActivityDto.setActivityId(activityInfo.getActivityId());
        stopActivityDto.setProductId(productInfo.getProductId());
        stopActivityDto.setSuccss(true);

        return stopActivityDto;
    }

    @Override
    public List<ActivityInfoDto> queryByCondition(ActivityInfoQuery query) {
        List<ActivityInfo> activityInfos = activityRepository.queryByCondition(query);
        return activityInfos.stream()
                .map(activityInfoDtoAssembler::assemble)
                .collect(Collectors.toList());
    }
}
