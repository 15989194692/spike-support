package com.lsz.activity;

import java.util.List;

/**
 * @ClassName ActivityRepository
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午9:46
 * @Version 1.0.0
 **/
public interface ActivityRepository {

    boolean save(ActivityInfo activityInfo);

    boolean update(ActivityInfo activityInfo);

    List<ActivityInfo> queryByCondition(ActivityInfoQuery activityInfoQuery);

    ActivityInfo queryByPrimaryId(Long activityId);

}
