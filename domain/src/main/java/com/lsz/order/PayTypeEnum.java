package com.lsz.order;

import java.util.HashMap;
import java.util.Map;

public enum PayTypeEnum {

    CASH_ON_DELIVERY("CASH_ON_DELIVERY", "货到付款"),

    ONLINE_PAYMENT("ONLINE_PAYMENT", "线上支付"),

    ;

    private final static Map<String, PayTypeEnum> ENUM_MAP = new HashMap<>(values().length);

    static {
        for (PayTypeEnum enumInstance : values()) {
            ENUM_MAP.put(enumInstance.getCode(), enumInstance);
        }
    }


    private final String code;

    private final String desc;


    PayTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static PayTypeEnum getByCode(String code) {
        return ENUM_MAP.get(code);
    }

}
