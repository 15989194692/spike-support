package com.lsz.product.service;

import com.lsz.product.*;
import com.lsz.product.assembler.ProductInfoDtoAssembler;
import com.lsz.product.command.CreateProductCommand;
import com.lsz.product.dto.CreateProductDto;
import com.lsz.product.dto.ProductInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName ProductApplicationServiceImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:39
 * @Version 1.0.0
 **/
@Service
public class ProductApplicationServiceImpl implements ProductApplicationService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private ProductInfoDtoAssembler productInfoDtoAssembler;

    @Autowired
    private ProductInfoBuilderFactory productInfoBuilderFactory;

    @Override
    public List<ProductInfoDto> queryByCondition(ProductInfoQuery query) {
        List<ProductInfo> productInfos = productInfoRepository.queryByCondition(query);
        return productInfos.stream()
                .map(productInfoDtoAssembler::assemble)
                .collect(Collectors.toList());
    }

    @Override
    public CreateProductDto create(CreateProductCommand command) {
        ProductInfoBuilder productInfoBuilder = productInfoBuilderFactory.create();
        ProductInfo productInfo = productInfoBuilder.pictureUrl(command.getPictureUrl())
                .productName(command.getProductName())
                .productPrice(command.getProductPrice())
                .tag(command.getTag())
                .build();
        productInfoRepository.save(productInfo);

        CreateProductDto createProductDto = new CreateProductDto();
        createProductDto.setProductId(productInfo.getProductId());
        return createProductDto;
    }

}
