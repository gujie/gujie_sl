package com.gj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 会员人数报表(Report)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:09:00
 */
@Entity
@Table(name = "report")
public class Report implements Serializable {
    private static final long serialVersionUID = 224813091410520060L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 相应会员类型对应的人数
     */
    private Integer usernum;
    /**
     * 关联角色表
     */
    private Integer roleid;
    /**
     * 会员类型
     */
    private String rolename;
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}