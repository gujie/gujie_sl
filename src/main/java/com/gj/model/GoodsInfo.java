package com.gj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 把该表数据放ES中(GoodsInfo)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:08:54
 */
@Entity
@Table(name = "goods_info")
public class GoodsInfo implements Serializable {
    private static final long serialVersionUID = -33003708421319593L;
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 商品编码
     */
    private String goodssn;
    /**
     * 商品名称
     */
    private String goodsname;
    /**
     * 商品规格
     */
    private String goodsformat;
    /**
     * 市场价
     */
    private Double marketprice;
    /**
     * 优惠价格
     */
    private Double realprice;
    /**
     * 状态（1、上架、2、下架）
     */
    private Integer state;
    /**
     * 商品说明
     */
    private String note;
    /**
     * 库存数量
     */
    private Integer num;
    /**
     * 单位
     */
    private String unit;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    /**
     * 最后更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastupdatetime;
    /**
     * 创建人
     */
    private String createdby;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodssn() {
        return goodssn;
    }

    public void setGoodssn(String goodssn) {
        this.goodssn = goodssn;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsformat() {
        return goodsformat;
    }

    public void setGoodsformat(String goodsformat) {
        this.goodsformat = goodsformat;
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public Double getRealprice() {
        return realprice;
    }

    public void setRealprice(Double realprice) {
        this.realprice = realprice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

}