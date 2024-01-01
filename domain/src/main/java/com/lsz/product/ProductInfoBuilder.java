package com.lsz.product;

import com.lsz.common.valueobject.Money;
import com.lsz.sequence.SequenceService;
import com.lsz.sequence.SequenceTypeEnum;

/**
 * @ClassName ProductInfoBuilder
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:50
 * @Version 1.0.0
 **/
public class ProductInfoBuilder {

    private final SequenceService sequenceService;

    private String productName;

    private String pictureUrl;

    private Money productPrice;

    private String tag;

    public ProductInfoBuilder(SequenceService sequenceService) {
        this.sequenceService = sequenceService;
    }

    public ProductInfoBuilder productName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductInfoBuilder pictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    public ProductInfoBuilder tag(String tag) {
        this.tag = tag;
        return this;
    }

    public ProductInfoBuilder productPrice(Money productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    public ProductInfo build() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(sequenceService.generateUniqueId(SequenceTypeEnum.PRODUCT_ID));
        productInfo.setPictureUrl(pictureUrl);
        productInfo.setProductName(productName);
        productInfo.setProductPrice(productPrice);
        productInfo.setTag(ProductTagEnum.getByCode(tag));
        return productInfo;
    }
}
