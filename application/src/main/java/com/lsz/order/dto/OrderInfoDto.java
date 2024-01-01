package com.lsz.order.dto;

import com.lsz.common.valueobject.Money;

/**
 * @ClassName OrderInfoDto
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:18
 * @Version 1.0.0
 **/
public class OrderInfoDto {

    private Long id;

    private Long orderId;

    private Long productId;

    private Long userId;

    private Long buyNum;

    private Money orderPrice;

    private String address;

    private String payType;

    private Long orderTime;

    private String orderStatus;

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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
