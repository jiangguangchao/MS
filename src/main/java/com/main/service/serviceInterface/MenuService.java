package com.main.service.serviceInterface;

import com.main.dto.MenuDTO;

import java.util.List;

/**
 * Created by Administrator on 2021/3/28.
 */
public interface MenuService {

    /**
     * 查询所有的一级和二级菜单
     * @return
     */
    public List<MenuDTO> findMenus();


    /**
     * 根据给定的一级或者二级菜单编号，查找对应的一级和二级菜单
     * @return
     */
    public List<MenuDTO> findMenusByMenuId(List<String> menuIds);
}
