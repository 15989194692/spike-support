package com.lsz.product;

import com.lsz.common.query.QueryOrderByClause;

import java.util.List;

/**
 * @ClassName ProductInfoQuery
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:38
 * @Version 1.0.0
 **/
public class ProductInfoQuery {


    private List<Long> productIds;



    private QueryOrderByClause orderByClause;


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
