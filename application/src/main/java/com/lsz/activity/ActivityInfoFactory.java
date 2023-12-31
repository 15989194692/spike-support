package com.lsz.activity;

/**
 * @ClassName ActivityInfoFactory
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午11:01
 * @Version 1.0.0
 **/
public interface ActivityInfoFactory {

    ActivityInfo build(CreateActivityCommand command);

}
