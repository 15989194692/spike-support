package com.lsz.persistence.product.converter;

import com.lsz.common.valueobject.Money;
import com.lsz.persistence.product.dataobject.ProductInfoDO;
import com.lsz.product.ProductInfo;
import com.lsz.product.ProductTagEnum;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @ClassName ProductInfoDOConverter
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:30
 * @Version 1.0.0
 **/
@Mapper(componentModel = "spring", imports = {Money.class, ProductTagEnum.class})
public interface ProductInfoDOConverter {

    @Mapping(target = "productPrice", expression = "java(Money.of(source.getProductPriceAmt(), source.getCcy()))")
    ProductInfo toDomain(ProductInfoDO source);

    @Mapping(target = "productPriceAmt", expression = "java(source.getProductPrice().getAmt())")
    @Mapping(target = "ccy", expression = "java(source.getProductPrice().getCcy())")
    ProductInfoDO toDo(ProductInfo source);
}
