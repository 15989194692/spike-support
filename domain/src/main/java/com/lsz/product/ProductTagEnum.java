package com.lsz.product;

import java.util.HashMap;
import java.util.Map;

public enum ProductTagEnum {

    NORMAL("NORMAL", "普通商品"),

    SPIKE("SPIKE", "秒杀商品"),


    ;

    private final static Map<String, ProductTagEnum> ENUM_MAP = new HashMap<>(values().length);

    static {
        for (ProductTagEnum enumInstance : values()) {
            ENUM_MAP.put(enumInstance.getCode(), enumInstance);
        }
    }


    private final String code;

    private final String desc;


    ProductTagEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ProductTagEnum getByCode(String code) {
        return ENUM_MAP.get(code);
    }

}
