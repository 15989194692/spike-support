package com.lsz.sequence;

public enum SequenceTypeEnum {

    USER_ID("USER_ID"),

    ACTIVITY_ID("ACTIVITY_ID"),

    ORDER_ID("ORDER_ID"),

    PRODUCT_ID("PRODUCT_ID"),

    ;

    private final String code;

    SequenceTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
