package com.main.bean;

import java.util.Date;

/**
 * @description:二级菜单
 * @author:jgc
 * @create:2021-03-22 11:10
 */
public class SubMenu {
    private String subMenuId;
    private String parentId;
    private String subMenuName;
    private String url;
    private String state;
    private Date createTime;

    public String getSubMenuId() {
        return subMenuId;
    }

    public void setSubMenuId(String subMenuId) {
        this.subMenuId = subMenuId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getSubMenuName() {
        return subMenuName;
    }

    public void setSubMenuName(String subMenuName) {
        this.subMenuName = subMenuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SubMenu{" +
                "subMenuId='" + subMenuId + '\'' +
                ", parentId='" + parentId + '\'' +
                ", subMenuName='" + subMenuName + '\'' +
                ", url='" + url + '\'' +
                ", state='" + state + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
