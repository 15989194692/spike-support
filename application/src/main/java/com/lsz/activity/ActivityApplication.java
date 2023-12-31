package com.lsz.activity;

/**
 * @ClassName ActivityApplication
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:55
 * @Version 1.0.0
 **/
public interface ActivityApplication {


    CreateActivityDto createActivity(CreateActivityCommand command);

}
