package com.gj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * (LeaveMessage)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:08:57
 */
@Entity
@Table(name = "leave_message")
public class LeaveMessage implements Serializable {
    private static final long serialVersionUID = 423967018357417577L;
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 留言用户code
     */
    private String createdby;
    /**
     * 留言编码
     */
    private String messagecode;
    /**
     * 留言标题
     */
    private String messagetitle;
    /**
     * 留言内容
     */
    private String messagecontent;
    /**
     * 状态（1、已回复0、未回复）
     */
    private Integer state;
    /**
     * 留言时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getMessagecode() {
        return messagecode;
    }

    public void setMessagecode(String messagecode) {
        this.messagecode = messagecode;
    }

    public String getMessagetitle() {
        return messagetitle;
    }

    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}