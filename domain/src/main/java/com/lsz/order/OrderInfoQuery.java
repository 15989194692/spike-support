package com.lsz.order;

import com.lsz.common.query.QueryOrderByClause;

import java.util.List;

/**
 * @ClassName OrderInfoQuery
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:04
 * @Version 1.0.0
 **/
public class OrderInfoQuery {

    private List<Long> orderIds;

    private QueryOrderByClause orderByClause;

    public List<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    public QueryOrderByClause getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(QueryOrderByClause orderByClause) {
        this.orderByClause = orderByClause;
    }
}
