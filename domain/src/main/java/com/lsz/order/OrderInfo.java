package com.lsz.order;

import com.lsz.common.valueobject.Money;

/**
 * @ClassName OrderInfo
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:03
 * @Version 1.0.0
 **/
public class OrderInfo {

    private Long id;

    private Long orderId;

    private Long productId;

    private Long userId;

    private Long buyNum;

    private Money orderPrice;

    private String address;

    private PayTypeEnum payType;

    private Long orderTime;

    private OrderStatusEnum orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Long buyNum) {
        this.buyNum = buyNum;
    }

    public Money getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Money orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PayTypeEnum getPayType() {
        return payType;
    }

    public void setPayType(PayTypeEnum payType) {
        this.payType = payType;
    }

    public Long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }
}
