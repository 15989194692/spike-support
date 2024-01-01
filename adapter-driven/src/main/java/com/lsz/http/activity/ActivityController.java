package com.lsz.http.activity;

import com.lsz.activity.dto.ActivityInfoDto;
import com.lsz.activity.service.ActivityApplicationService;
import com.lsz.activity.ActivityInfoQuery;
import com.lsz.activity.command.CreateActivityCommand;
import com.lsz.activity.dto.CreateActivityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ActivityController
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午10:54
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("/activity")
public class ActivityController {


    @Autowired
    private ActivityApplicationService activityApplicationService;

    @PostMapping("/create")
    public CreateActivityDto create(CreateActivityCommand command) {
        return activityApplicationService.createActivity(command);
    }


    @PostMapping("/query")
    public List<ActivityInfoDto> query(ActivityInfoQuery query) {
        return activityApplicationService.queryByCondition(query);
    }

}
