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
}
