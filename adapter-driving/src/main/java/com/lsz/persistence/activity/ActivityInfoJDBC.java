package com.lsz.persistence.activity;

import com.lsz.activity.ActivityInfo;
import com.lsz.activity.ActivityInfoQuery;
import com.lsz.activity.ActivityRepository;
import com.lsz.persistence.activity.converter.ActivityInfoDOConverter;
import com.lsz.persistence.activity.dataobject.ActivityInfoDO;
import com.lsz.persistence.activity.mapper.ActivityInfoDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName ActivityInfoJDBC
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午9:45
 * @Version 1.0.0
 **/
@Repository
public class ActivityInfoJDBC implements ActivityRepository {

    @Autowired
    private ActivityInfoDOMapper activityInfoDOMapper;

    @Autowired
    private ActivityInfoDOConverter activityInfoDOConverter;

    @Override
    public boolean save(ActivityInfo activityInfo) {
        ActivityInfoDO activityInfoDO = activityInfoDOConverter.toDO(activityInfo);
        return activityInfoDOMapper.insert(activityInfoDO) == 1;
    }

    @Override
    public boolean update(ActivityInfo activityInfo) {
        ActivityInfoDO activityInfoDO = activityInfoDOConverter.toDO(activityInfo);
        return activityInfoDOMapper.updateByPrimaryKey(activityInfoDO) == 1;
    }

    @Override
    public List<ActivityInfo> queryByCondition(ActivityInfoQuery activityInfoQuery) {
        List<ActivityInfoDO> activityInfoDOS = activityInfoDOMapper.selectByCondition(activityInfoQuery);
        return activityInfoDOS.stream().map(activityInfoDOConverter::toDomain).collect(Collectors.toList());
    }


    @Override
    public ActivityInfo queryByPrimaryId(Long activityId) {
        ActivityInfoDO activityInfoDO = activityInfoDOMapper.selectByPrimaryKey(activityId);
        return activityInfoDOConverter.toDomain(activityInfoDO);
    }
}
