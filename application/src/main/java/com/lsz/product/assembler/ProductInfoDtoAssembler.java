package com.lsz.product.assembler;

import com.lsz.product.ProductInfo;
import com.lsz.product.ProductTagEnum;
import com.lsz.product.dto.ProductInfoDto;
import org.mapstruct.Mapper;

/**
 * @ClassName ProductInfoDtoAssembler
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:37
 * @Version 1.0.0
 **/
@Mapper(componentModel = "spring", imports = {ProductTagEnum.class})
public interface ProductInfoDtoAssembler {


    ProductInfoDto assemble(ProductInfo source);


}
