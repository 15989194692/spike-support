package com.lsz.persistence.order.converter;

import com.lsz.common.valueobject.Money;
import com.lsz.order.OrderInfo;
import com.lsz.order.OrderStatusEnum;
import com.lsz.order.PayTypeEnum;
import com.lsz.persistence.order.dataobject.OrderRecordDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @ClassName OrderInfoDOConverter
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:05
 * @Version 1.0.0
 **/
@Mapper(componentModel = "spring", imports = {Money.class, PayTypeEnum.class, OrderStatusEnum.class})
public interface OrderInfoDOConverter {

    @Mapping(target = "orderPrice", expression = "java(Money.of(source.getOrderPriceAmt(), source.getCcy()))")
    OrderInfo toDomain(OrderRecordDO source);

    @Mapping(target = "orderPriceAmt", expression = "java(source.getOrderPrice().getAmt())")
    @Mapping(target = "ccy", expression = "java(source.getOrderPrice().getCcy())")
    OrderRecordDO toDO(OrderInfo source);


}
