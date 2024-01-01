package com.lsz.order;

import java.util.List;

/**
 * @ClassName OrderInfoRepository
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:03
 * @Version 1.0.0
 **/
public interface OrderInfoRepository {


    boolean save(OrderInfo orderInfo);

    List<OrderInfo> queryByCondition(OrderInfoQuery query);

}
