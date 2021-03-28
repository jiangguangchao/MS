package com.main.service.serviceImpl;

import com.main.dao.RoleMenuDao;
import com.main.service.serviceInterface.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2021/3/28.
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuDao roleMenuDao;
    /**
     * 根据角色id，查找角色拥有的菜单id（一级菜单编号和二级菜单编号）
     *
     * @param roleId
     * @return
     */
    @Override
    public List<String> findMenuIdsByRoleId(Integer roleId) {

        return roleMenuDao.findMenuIdsByRoleId(roleId);
    }
}
