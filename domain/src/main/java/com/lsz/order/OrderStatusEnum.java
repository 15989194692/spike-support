package com.lsz.order;

import java.util.HashMap;
import java.util.Map;

public enum OrderStatusEnum {

    INIT("INIT", "初始化"),

    PLACE_ORDER("PLACE_ORDER", "已下单"),

    PAYED("PAYED", "已支付"),
    ;

    private final static Map<String, OrderStatusEnum> ENUM_MAP = new HashMap<>(values().length);

    static {
        for (OrderStatusEnum enumInstance : values()) {
            ENUM_MAP.put(enumInstance.getCode(), enumInstance);
        }
    }


    private final String code;

    private final String desc;


    OrderStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static OrderStatusEnum getByCode(String code) {
        return ENUM_MAP.get(code);
    }

}
