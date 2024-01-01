package com.lsz.product;

import java.util.List;

/**
 * @ClassName ProductInfoRepository
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:39
 * @Version 1.0.0
 **/
public interface ProductInfoRepository {


    boolean save(ProductInfo productInfo);


    List<ProductInfo> queryByCondition(ProductInfoQuery query);
}
