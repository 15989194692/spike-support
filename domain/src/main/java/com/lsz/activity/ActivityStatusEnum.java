package com.lsz.activity;

import java.util.HashMap;
import java.util.Map;

public enum ActivityStatusEnum {

    INIT("INIT", "初始化，未开始"),

    STARTING("STARTING", "进行中"),

    FINISHED("FINISHED", "已结束"),


    ;

    private final static Map<String, ActivityStatusEnum> ENUM_MAP = new HashMap<>(values().length);

    static {
        for (ActivityStatusEnum enumInstance : values()) {
            ENUM_MAP.put(enumInstance.getCode(), enumInstance);
        }
    }


    private final String code;

    private final String desc;


    ActivityStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ActivityStatusEnum getByCode(String code) {
        return ENUM_MAP.get(code);
    }

}
