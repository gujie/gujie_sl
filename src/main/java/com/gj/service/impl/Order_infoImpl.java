package com.gj.service.impl;

import com.gj.model.OrderInfo;
import org.springframework.stereotype.Service;


public interface Order_infoImpl {
//    添加订单
    int insert(OrderInfo orderInfo)throws Exception;
}
