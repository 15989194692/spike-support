package com.lsz.order;

import com.lsz.common.valueobject.Money;
import com.lsz.sequence.SequenceService;
import com.lsz.sequence.SequenceTypeEnum;

/**
 * @ClassName OrderInfoBuilder
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:11
 * @Version 1.0.0
 **/
public class OrderInfoBuilder {

    private final SequenceService sequenceService;

    private Long productId;

    private Long userId;

    private Long buyNum;

    private Money orderPrice;

    private String address;

    private String payType;

    private Long orderTime;

    private String orderStatus;

    public OrderInfoBuilder(SequenceService sequenceService) {
        this.sequenceService = sequenceService;
    }


    public OrderInfoBuilder productId(Long productId) {
        this.productId = productId;
        return this;
    }

    public OrderInfoBuilder userId(Long userId) {
        this.userId = userId;
        return this;
    }

    public OrderInfoBuilder buyNum(Long buyNum) {
        this.buyNum = buyNum;
        return this;
    }

    public OrderInfoBuilder orderPrice(Money orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }

    public OrderInfoBuilder address(String address) {
        this.address = address;
        return this;
    }

    public OrderInfoBuilder payType(String payType) {
        this.payType = payType;
        return this;
    }

    public OrderInfoBuilder orderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public OrderInfoBuilder orderTime(Long orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    public OrderInfo build() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(sequenceService.generateUniqueId(SequenceTypeEnum.ORDER_ID));
        orderInfo.setBuyNum(buyNum);
        orderInfo.setAddress(address);
        orderInfo.setOrderPrice(orderPrice);
        orderInfo.setOrderStatus(OrderStatusEnum.getByCode(orderStatus));
        orderInfo.setOrderTime(orderTime);
        orderInfo.setUserId(userId);
        orderInfo.setProductId(productId);
        orderInfo.setPayType(PayTypeEnum.getByCode(payType));
        return orderInfo;
    }
}
