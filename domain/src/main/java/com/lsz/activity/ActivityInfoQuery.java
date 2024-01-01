package com.lsz.activity;

import com.lsz.common.query.QueryOrderByClause;

import java.util.List;

/**
 * @ClassName ActivityInfoQuery
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午9:47
 * @Version 1.0.0
 **/
public class ActivityInfoQuery {

    private List<Long> activityIds;

    private List<Long> productIds;

    private List<String> activityStatus;

    private QueryOrderByClause orderByClause;

    public List<Long> getActivityIds() {
        return activityIds;
    }

    public void setActivityIds(List<Long> activityIds) {
        this.activityIds = activityIds;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public QueryOrderByClause getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(QueryOrderByClause orderByClause) {
        this.orderByClause = orderByClause;
    }

    public List<String> getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(List<String> activityStatus) {
        this.activityStatus = activityStatus;
    }

    public static class Builder {
        private List<Long> activityIds;

        private List<Long> productIds;

        private List<String> activityStatus;

        private QueryOrderByClause orderByClause;

        public Builder activityIds(List<Long> activityIds) {
            this.activityIds = activityIds;
            return this;
        }

        public Builder productIds(List<Long> productIds) {
            this.productIds = productIds;
            return this;
        }

        public Builder activityStatus(List<String> activityStatus) {
            this.activityStatus = activityStatus;
            return this;
        }

        public Builder orderByClause(QueryOrderByClause orderByClause) {
            this.orderByClause = orderByClause;
            return this;
        }

        public ActivityInfoQuery build() {
            ActivityInfoQuery activityInfoQuery = new ActivityInfoQuery();
            activityInfoQuery.setActivityIds(activityIds);
            activityInfoQuery.setOrderByClause(orderByClause);
            activityInfoQuery.setProductIds(productIds);
            return activityInfoQuery;
        }
    }
}
