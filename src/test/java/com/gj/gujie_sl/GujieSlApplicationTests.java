package com.gj.gujie_sl;

import com.gj.model.OrderInfo;
import com.gj.service.Order_infoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


@SpringBootTest

class GujieSlApplicationTests {

@Autowired
    Order_infoService service;
@Test
    public void insert()throws Exception{
    OrderInfo orderInfo=new OrderInfo();
    long l = System.currentTimeMillis();
    String s = String.valueOf(l);
    orderInfo.setId(1);
    orderInfo.setOrdercode(s);
    orderInfo.setCreateby("李四");
    orderInfo.setCreatetime(new Date());
    orderInfo.setOrderprice(2000.0);
    orderInfo.setStatus(1);
    orderInfo.setLastupdatetime(new Date());
    orderInfo.setUserid(1);
    int insert = service.insert(orderInfo);


}



}
