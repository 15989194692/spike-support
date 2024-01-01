package com.lsz.product.command;

import com.lsz.common.valueobject.Money;

/**
 * @ClassName CreateProductCommand
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:48
 * @Version 1.0.0
 **/
public class CreateProductCommand {

    private String productName;

    private String pictureUrl;

    private Money productPrice;

    private String tag;

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
