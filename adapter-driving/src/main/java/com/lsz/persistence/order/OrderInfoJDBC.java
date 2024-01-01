package com.lsz.persistence.order;

import com.lsz.order.OrderInfo;
import com.lsz.order.OrderInfoQuery;
import com.lsz.order.OrderInfoRepository;
import com.lsz.persistence.order.converter.OrderInfoDOConverter;
import com.lsz.persistence.order.dataobject.OrderRecordDO;
import com.lsz.persistence.order.mapper.OrderRecordDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName OrderInfoJDBC
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午2:05
 * @Version 1.0.0
 **/
@Repository
public class OrderInfoJDBC implements OrderInfoRepository {

    @Autowired
    private OrderRecordDOMapper orderRecordDOMapper;

    @Autowired
    private OrderInfoDOConverter orderInfoDOConverter;

    @Override
    public boolean save(OrderInfo orderInfo) {
        OrderRecordDO orderRecordDO = orderInfoDOConverter.toDO(orderInfo);
        return orderRecordDOMapper.insert(orderRecordDO) == 1;
    }

    @Override
    public List<OrderInfo> queryByCondition(OrderInfoQuery query) {
        List<OrderRecordDO> orderRecordDOS = orderRecordDOMapper.selectByCondition(query);
        return orderRecordDOS.stream().map(orderInfoDOConverter::toDomain).collect(Collectors.toList());
    }
}
