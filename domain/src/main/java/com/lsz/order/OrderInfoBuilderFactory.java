package com.lsz.order;

import com.lsz.sequence.SequenceService;
import com.lsz.sequence.SequenceTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName OrderInfoBuilderFactory
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:15
 * @Version 1.0.0
 **/
@Component
public class OrderInfoBuilderFactory {

    @Autowired
    private SequenceService sequenceService;

    public OrderInfoBuilder create() {
        return new OrderInfoBuilder(sequenceService);
    }
}
