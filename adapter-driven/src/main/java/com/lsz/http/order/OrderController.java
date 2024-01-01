package com.lsz.http.order;

import com.lsz.order.OrderInfoQuery;
import com.lsz.order.command.CreateOrderCommand;
import com.lsz.order.dto.CreateOrderDto;
import com.lsz.order.dto.OrderInfoDto;
import com.lsz.order.service.OrderApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:29
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderApplicationService orderApplicationService;

    @PostMapping("/query")
    public List<OrderInfoDto> query(@RequestBody OrderInfoQuery query) {
        return orderApplicationService.queryByCondition(query);
    }

    @PostMapping("/create")
    public CreateOrderDto create(@RequestBody CreateOrderCommand command) {
        return orderApplicationService.create(command);
    }

}
