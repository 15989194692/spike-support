package com.lsz.order.service;

import com.lsz.activity.ActivityInfo;
import com.lsz.activity.ActivityInfoQuery;
import com.lsz.activity.ActivityRepository;
import com.lsz.activity.ActivityStatusEnum;
import com.lsz.activity.domainservice.ActivityDomainService;
import com.lsz.order.*;
import com.lsz.order.assembler.OrderInfoDtoAssembler;
import com.lsz.order.command.CreateOrderCommand;
import com.lsz.order.dto.CreateOrderDto;
import com.lsz.order.dto.OrderInfoDto;
import com.lsz.product.ProductInfo;
import com.lsz.product.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName OrderApplicationServiceImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:19
 * @Version 1.0.0
 **/
@Service
public class OrderApplicationServiceImpl implements OrderApplicationService {

    @Autowired
    private OrderInfoRepository orderInfoRepository;

    @Autowired
    private OrderInfoBuilderFactory orderInfoBuilderFactory;

    @Autowired
    private OrderInfoDtoAssembler orderInfoDtoAssembler;

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private ActivityDomainService activityDomainService;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public CreateOrderDto create(CreateOrderCommand command) {
        return transactionTemplate.execute(action -> {
            OrderInfoBuilder orderInfoBuilder = orderInfoBuilderFactory.create();
            OrderInfo orderInfo = orderInfoBuilder.address(command.getAddress())
                    .buyNum(command.getBuyNum())
                    .orderPrice(command.getOrderPrice())
                    .orderStatus(command.getOrderStatus())
                    .orderTime(command.getOrderTime())
                    .payType(command.getPayType())
                    .productId(command.getProductId())
                    .userId(command.getUserId())
                    .build();
            ProductInfo productInfo = productInfoRepository.queryByPrimaryId(command.getProductId());
            // 如果是活动商品，需要减少活动库存
            if (productInfo.isSpikeProduct()) {
                ActivityInfoQuery activityInfoQuery = new ActivityInfoQuery.Builder()
                        .productIds(Arrays.asList(command.getProductId()))
                        .activityStatus(Arrays.asList(ActivityStatusEnum.STARTING.getCode()))
                        .build();
                List<ActivityInfo> activityInfos = activityRepository.queryByCondition(activityInfoQuery);
                ActivityInfo activityInfo = activityInfos.get(0);
                activityInfo.reduceInventory(command.getBuyNum());
                activityRepository.update(activityInfo);
            }
            orderInfoRepository.save(orderInfo);

            CreateOrderDto createOrderDto = new CreateOrderDto();
            createOrderDto.setOrderId(orderInfo.getOrderId());
            return createOrderDto;
        });
    }

    @Override
    public List<OrderInfoDto> queryByCondition(OrderInfoQuery query) {
        List<OrderInfo> orders = orderInfoRepository.queryByCondition(query);
        return orders.stream().map(orderInfoDtoAssembler::assemble).collect(Collectors.toList());
    }
}
