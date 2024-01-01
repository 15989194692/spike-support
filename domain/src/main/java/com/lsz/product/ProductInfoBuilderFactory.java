package com.lsz.product;

import com.lsz.sequence.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName ProductInfoBuilderFactory
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:54
 * @Version 1.0.0
 **/
@Component
public class ProductInfoBuilderFactory {

    @Autowired
    private SequenceService sequenceService;


    public ProductInfoBuilder create() {
        return new ProductInfoBuilder(sequenceService);
    }
}
