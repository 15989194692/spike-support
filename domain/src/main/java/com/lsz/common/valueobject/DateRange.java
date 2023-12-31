package com.lsz.common.valueobject;

/**
 * @ClassName DateRange
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午9:53
 * @Version 1.0.0
 **/
public class DateRange {

    private final Long beginDateTimestamp;

    private final Long endDateTimestamp;


    private DateRange(Long beginDateTimestamp, Long endDateTimestamp) {
        this.beginDateTimestamp = beginDateTimestamp;
        this.endDateTimestamp = endDateTimestamp;
    }

    public static DateRange of(Long beginDateTimestamp, Long endDateTimestamp) {
        return new DateRange(beginDateTimestamp, endDateTimestamp);
    }

    public Long getBeginDateTimestamp() {
        return beginDateTimestamp;
    }

    public Long getEndDateTimestamp() {
        return endDateTimestamp;
    }
}
