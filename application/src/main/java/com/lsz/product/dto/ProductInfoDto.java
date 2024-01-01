package com.lsz.product.dto;

import com.lsz.common.valueobject.Money;
import com.lsz.product.ProductTagEnum;

/**
 * @ClassName ProductInfoDto
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:36
 * @Version 1.0.0
 **/
public class ProductInfoDto {
    private Long id;

    private Long productId;

    private String productName;

    private String pictureUrl;

    private Money productPrice;

    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Money getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Money productPrice) {
        this.productPrice = productPrice;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
