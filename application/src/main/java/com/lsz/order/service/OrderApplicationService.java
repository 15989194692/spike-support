package com.lsz.order.service;

import com.lsz.order.OrderInfoQuery;
import com.lsz.order.command.CreateOrderCommand;
import com.lsz.order.dto.CreateOrderDto;
import com.lsz.order.dto.OrderInfoDto;

import java.util.List;

/**
 * @ClassName OrderApplicationService
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:17
 * @Version 1.0.0
 **/
public interface OrderApplicationService {


    CreateOrderDto create(CreateOrderCommand command);

    List<OrderInfoDto> queryByCondition(OrderInfoQuery query);

}
