package com.gj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购物车中商品信息表(CartGoods)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:08:52
 */
@Entity
@Table(name = "cart_goods")
public class CartGoods implements Serializable {
    private static final long serialVersionUID = 871886394489681297L;
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
     * 购物车ID,关联购物车表
     */
    private Integer cartid;
    /**
     * 0表示无货,1表示有货
     */
    private Integer flag;
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

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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

}