package com.lsz.persistence.activity.converter;

import com.lsz.activity.ActivityInfo;
import com.lsz.activity.ActivityStatusEnum;
import com.lsz.common.valueobject.DateRange;
import com.lsz.common.valueobject.Money;
import com.lsz.persistence.activity.dataobject.ActivityInfoDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @ClassName ActivityInfoDOConverter
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午9:49
 * @Version 1.0.0
 **/
@Mapper(componentModel = "spring", imports = {Money.class, DateRange.class, ActivityStatusEnum.class})
public interface ActivityInfoDOConverter {

    @Mapping(target = "activityStartTime", expression = "java(source.getActivityTime().getBeginDateTimestamp())")
    @Mapping(target = "activityEndTime", expression = "java(source.getActivityTime().getEndDateTimestamp())")
    @Mapping(target = "activityPriceAmt", expression = "java(source.getActivityPrice().getAmt())")
    @Mapping(target = "ccy", expression = "java(source.getActivityPrice().getCcy())")
    ActivityInfoDO toDO(ActivityInfo source);
    
    @Mapping(target = "activityTime", expression = "java(DateRange.of(source.getActivityStartTime(), source.getActivityEndTime()))")
    @Mapping(target = "activityPrice", expression = "java(Money.of(source.getActivityPriceAmt(), source.getCcy()))")
    ActivityInfo toDomain(ActivityInfoDO source);
    
}
