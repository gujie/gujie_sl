package com.gj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购买会员订单明细表(OrderUser)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:09:00
 */
@Entity
@Table(name = "order_user")
public class OrderUser implements Serializable {
    private static final long serialVersionUID = -41767830344697084L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 关联订单表
     */
    private Long orderinfoid;
    /**
     * 会员类型
     */
    private String rolename;
    /**
     * 会员价格
     */
    private Double roleprice;
    /**
     * 关联角色表
     */
    private Integer roleid;

    private String createby;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderinfoid() {
        return orderinfoid;
    }

    public void setOrderinfoid(Long orderinfoid) {
        this.orderinfoid = orderinfoid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Double getRoleprice() {
        return roleprice;
    }

    public void setRoleprice(Double roleprice) {
        this.roleprice = roleprice;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

}