package com.lsz.activity;

public enum ActivityStatusEnum {

    INIT("INIT", "初始化，未开始"),

    STARTING("STARTING", "进行中"),

    FINISHED("FINISHED", "已结束"),


    ;

    private final String code;

    private final String desc;


    ActivityStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }



}
