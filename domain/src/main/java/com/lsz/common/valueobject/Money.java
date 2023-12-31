package com.lsz.common.valueobject;

/**
 * @ClassName Money
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午9:50
 * @Version 1.0.0
 **/
public class Money {

    private final Long amt;

    private final String ccy;


    private Money(Long amt, String ccy) {
        this.amt = amt;
        this.ccy = ccy;
    }

    public static Money of(Long amt, String ccy) {
        return new Money(amt, ccy);
    }

    public Long getAmt() {
        return amt;
    }

    public String getCcy() {
        return ccy;
    }
}
