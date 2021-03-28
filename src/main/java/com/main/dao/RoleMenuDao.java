package com.main.dao;

import java.util.List;

/**
 * Created by Administrator on 2021/3/28.
 */
public interface RoleMenuDao {


    /**
     * 根据角色id，查找角色拥有的菜单id（一级菜单编号和二级菜单编号）
     * @param roleId
     * @return
     */
    public List<String> findMenuIdsByRoleId(Integer roleId);
}
