package com.lsz.order.assembler;

import com.lsz.order.OrderInfo;
import com.lsz.order.OrderStatusEnum;
import com.lsz.order.PayTypeEnum;
import com.lsz.order.dto.OrderInfoDto;
import org.mapstruct.Mapper;

/**
 * @ClassName OrderInfoDtoAssembler
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:22
 * @Version 1.0.0
 **/
@Mapper(componentModel = "spring", imports = {PayTypeEnum.class, OrderStatusEnum.class})
public interface OrderInfoDtoAssembler {


    OrderInfoDto assemble(OrderInfo source);
}
