package com.lsz.http.activity;

import com.lsz.activity.ActivityInfoQuery;
import com.lsz.activity.command.CreateActivityCommand;
import com.lsz.activity.command.StartActivityCommand;
import com.lsz.activity.command.StopActivityCommand;
import com.lsz.activity.dto.ActivityInfoDto;
import com.lsz.activity.dto.CreateActivityDto;
import com.lsz.activity.dto.StartActivityDto;
import com.lsz.activity.dto.StopActivityDto;
import com.lsz.activity.service.ActivityApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public CreateActivityDto create(@RequestBody CreateActivityCommand command) {
        return activityApplicationService.createActivity(command);
    }


    @PostMapping("/query")
    public List<ActivityInfoDto> query(@RequestBody ActivityInfoQuery query) {
        return activityApplicationService.queryByCondition(query);
    }



    @PostMapping("/start")
    public StartActivityDto start(@RequestBody StartActivityCommand command) {
        return activityApplicationService.startActivity(command);
    }


    @PostMapping("/stop")
    public StopActivityDto stop(@RequestBody StopActivityCommand command) {
        return activityApplicationService.stopActivity(command);
    }



}
