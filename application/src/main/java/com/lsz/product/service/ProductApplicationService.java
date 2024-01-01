package com.lsz.product.service;

import com.lsz.product.ProductInfoQuery;
import com.lsz.product.command.CreateProductCommand;
import com.lsz.product.dto.CreateProductDto;
import com.lsz.product.dto.ProductInfoDto;

import java.util.List;

/**
 * @ClassName ProductApplicationService
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:35
 * @Version 1.0.0
 **/
public interface ProductApplicationService {


    List<ProductInfoDto> queryByCondition(ProductInfoQuery query);


    CreateProductDto create(CreateProductCommand command);

}
