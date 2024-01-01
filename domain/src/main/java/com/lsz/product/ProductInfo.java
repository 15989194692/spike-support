package com.lsz.product;

import com.lsz.common.valueobject.Money;

/**
 * @ClassName ProductInfo
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:31
 * @Version 1.0.0
 **/
public class ProductInfo {

    private Long id;

    private Long productId;

    private String productName;

    private String pictureUrl;

    private Money productPrice;

    private ProductTagEnum tag;

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

    public ProductTagEnum getTag() {
        return tag;
    }

    public void setTag(ProductTagEnum tag) {
        this.tag = tag;
    }
}
