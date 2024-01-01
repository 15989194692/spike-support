package com.lsz.common.entity;

/**
 * @ClassName AbstractEntity
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午8:22
 * @Version 1.0.0
 **/
public class AbstractEntity {

    private static final Long NEW_CAS_VERSION = 0L;

    private Long casVersion = NEW_CAS_VERSION;

    private Long gmtCreate;

    private Long gmtModified;

    public Long getCasVersion() {
        return casVersion;
    }

    public void setCasVersion(Long casVersion) {
        this.casVersion = casVersion;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}
