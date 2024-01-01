package com.lsz.order.service;

import com.lsz.order.*;
import com.lsz.order.assembler.OrderInfoDtoAssembler;
import com.lsz.order.command.CreateOrderCommand;
import com.lsz.order.dto.CreateOrderDto;
import com.lsz.order.dto.OrderInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public CreateOrderDto create(CreateOrderCommand command) {
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
        orderInfoRepository.save(orderInfo);
        CreateOrderDto createOrderDto = new CreateOrderDto();
        createOrderDto.setOrderId(orderInfo.getOrderId());
        return createOrderDto;
    }

    @Override
    public List<OrderInfoDto> queryByCondition(OrderInfoQuery query) {
        List<OrderInfo> orders = orderInfoRepository.queryByCondition(query);
        return orders.stream().map(orderInfoDtoAssembler::assemble).collect(Collectors.toList());
    }
}
