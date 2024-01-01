package com.lsz.persistence.product;

import com.lsz.persistence.product.converter.ProductInfoDOConverter;
import com.lsz.persistence.product.dataobject.ProductInfoDO;
import com.lsz.persistence.product.mapper.ProductInfoDOMapper;
import com.lsz.product.ProductInfo;
import com.lsz.product.ProductInfoQuery;
import com.lsz.product.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName ProductInfoRepositoryImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:40
 * @Version 1.0.0
 **/
@Repository
public class ProductInfoRepositoryImpl implements ProductInfoRepository {

    @Autowired
    private ProductInfoDOMapper productInfoDOMapper;

    @Autowired
    private ProductInfoDOConverter productInfoDOConverter;

    @Override
    public boolean save(ProductInfo productInfo) {
        ProductInfoDO productInfoDO = productInfoDOConverter.toDo(productInfo);
        return productInfoDOMapper.insert(productInfoDO) == 1;
    }

    @Override
    public boolean update(ProductInfo productInfo) {
        ProductInfoDO productInfoDO = productInfoDOConverter.toDo(productInfo);
        return productInfoDOMapper.updateByPrimaryKey(productInfoDO) == 1;
    }

    @Override
    public List<ProductInfo> queryByCondition(ProductInfoQuery query) {
        List<ProductInfoDO> productInfoDOS = productInfoDOMapper.selectByCondition(query);
        return productInfoDOS.stream()
                .map(productInfoDOConverter::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public ProductInfo queryByPrimaryId(Long productId) {
        ProductInfoDO productInfoDO = productInfoDOMapper.selectByPrimaryKey(productId);
        return productInfoDOConverter.toDomain(productInfoDO);
    }
}
