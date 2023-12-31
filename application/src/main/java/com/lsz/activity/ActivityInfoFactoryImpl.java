package com.lsz.activity;

import org.springframework.stereotype.Component;

/**
 * @ClassName ActivityInfoFactoryImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午11:03
 * @Version 1.0.0
 **/
@Component
public class ActivityInfoFactoryImpl implements ActivityInfoFactory {


    @Override
    public ActivityInfo build(CreateActivityCommand command) {
        return null;
    }
}
