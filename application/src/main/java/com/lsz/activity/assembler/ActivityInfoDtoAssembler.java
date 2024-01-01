package com.lsz.activity.assembler;

import com.lsz.activity.ActivityInfo;
import com.lsz.activity.ActivityStatusEnum;
import com.lsz.activity.dto.ActivityInfoDto;
import org.mapstruct.Mapper;

/**
 * @ClassName ActivityInfoDtoAssembler
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 上午10:28
 * @Version 1.0.0
 **/
@Mapper(componentModel = "spring", imports = {ActivityStatusEnum.class})
public interface ActivityInfoDtoAssembler {

    ActivityInfoDto assemble(ActivityInfo activityInfo);

}
