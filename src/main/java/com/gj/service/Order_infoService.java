package com.gj.service;

import com.gj.mapper.Order_infoMapper;
import com.gj.model.OrderInfo;
import com.gj.service.impl.Order_infoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class Order_infoService implements Order_infoImpl {
@Autowired
    private Order_infoMapper mapper;



@Override
@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public int insert(OrderInfo orderInfo) throws Exception {
    int i = mapper.insertOrder_info(orderInfo);
    return i;
    }
}
