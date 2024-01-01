package com.lsz.activity;

import com.lsz.sequence.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName ActivityInfoBuilderFactory
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午11:23
 * @Version 1.0.0
 **/
@Component
public class ActivityInfoBuilderFactory {

    @Autowired
    private SequenceService sequenceService;

    public ActivityInfoBuilder create() {
        return new ActivityInfoBuilder(sequenceService);
    }

}
