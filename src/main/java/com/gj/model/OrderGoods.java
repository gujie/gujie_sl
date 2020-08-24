package com.gj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购买商品订单明细表(OrderGoods)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:08:59
 */
@Entity
@Table(name = "order_goods")
public class OrderGoods implements Serializable {
    private static final long serialVersionUID = 241932260269097877L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 商品编号,关联商品表
     */
    private Integer goodsid;
    /**
     * 商品名字
     */
    private String goodsname;
    /**
     * 商品价格
     */
    private Double goodsprice;
    /**
     * 商品数量
     */
    private Integer goodsnum;
    /**
     * 创建人
     */
    private String createby;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastupdatetime;
    /**
     * 关联订单表
     */
    private Integer orderinfoid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getOrderinfoid() {
        return orderinfoid;
    }

    public void setOrderinfoid(Integer orderinfoid) {
        this.orderinfoid = orderinfoid;
    }

}