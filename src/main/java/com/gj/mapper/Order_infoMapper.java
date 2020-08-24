package com.gj.mapper;

import com.gj.model.OrderInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface Order_infoMapper {
    @Insert("insert into order_info set ordercode=#{ordercode},createBy=#{createby},orderprice=#{orderprice},createtime=#{createtime},lastupdatetime=#{lastupdatetime},status=#{status},userId=#{userid}")
//    添加订单表
    int insertOrder_info(OrderInfo orderInfo);
}
