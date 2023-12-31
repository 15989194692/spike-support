package com.lsz.activity;

/**
 * @ClassName ActivityInfoAssembler
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午11:26
 * @Version 1.0.0
 **/
public interface ActivityInfoAssembler {

    ActivityInfo assemble(CreateActivityCommand command);

}
