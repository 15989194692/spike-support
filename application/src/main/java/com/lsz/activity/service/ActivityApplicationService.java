package com.lsz.activity.service;

import com.lsz.activity.ActivityInfoQuery;
import com.lsz.activity.command.CreateActivityCommand;
import com.lsz.activity.dto.ActivityInfoDto;
import com.lsz.activity.dto.CreateActivityDto;

import java.util.List;

/**
 * @ClassName ActivityApplication
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:55
 * @Version 1.0.0
 **/
public interface ActivityApplicationService {


    CreateActivityDto createActivity(CreateActivityCommand command);


    List<ActivityInfoDto> queryByCondition(ActivityInfoQuery query);

}
