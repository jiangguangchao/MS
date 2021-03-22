package com.main.dto;

import com.main.bean.SubMenu;

import java.util.Date;
import java.util.List;

/**
 * @description:一次性查询一级菜单和二级菜单
 * @author:jgc
 * @create:2021-03-22 11:34
 */
public class MenuDTO {

    private String menuId;
    private String menuName;
    private String url;
    private String state;
    private Date createTime;

    private List<SubMenu> subMenuList;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
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

    public List<SubMenu> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<SubMenu> subMenuList) {
        this.subMenuList = subMenuList;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", state='" + state + '\'' +
                ", createTime=" + createTime +
                ", subMenuList=" + subMenuList +
                '}';
    }
}
