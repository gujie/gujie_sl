package com.gj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 账户资金明细表(AccountDetail)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:06:26
 */

@Entity
@Table(name = "account_detail")
public class AccountDetail implements Serializable {
    private static final long serialVersionUID = -56225069149941613L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 关联用户账户表
     */
    private Long accountid;
    /**
     * 记录入账或出账日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accountdate;
    /**
     * 入账
     */
    private Double moneyin;

    /**
     * 出账
     */
    private Double moneyout;
    /**
     * 0充值,1提现,2消费,3收益
     */
    private Integer type;
    /**
     * 交易方账户
     */
    private String otheracountid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAccountid() {
        return accountid;
    }

    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    public Date getAccountdate() {
        return accountdate;
    }

    public void setAccountdate(Date accountdate) {
        this.accountdate = accountdate;
    }

    public Double getMoneyin() {
        return moneyin;
    }

    public void setMoneyin(Double moneyin) {
        this.moneyin = moneyin;
    }

    public Double getMoneyout() {
        return moneyout;
    }

    public void setMoneyout(Double moneyout) {
        this.moneyout = moneyout;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOtheracountid() {
        return otheracountid;
    }

    public void setOtheracountid(String otheracountid) {
        this.otheracountid = otheracountid;
    }

}