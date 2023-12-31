package com.lsz.http.activity;

import com.lsz.activity.ActivityApplication;
import com.lsz.activity.CreateActivityCommand;
import com.lsz.activity.CreateActivityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private ActivityApplication activityApplication;

    @PostMapping("/create")
    public CreateActivityDto create(CreateActivityCommand command) {
        return activityApplication.createActivity(command);
    }

}
