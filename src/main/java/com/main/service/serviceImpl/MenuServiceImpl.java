package com.main.service.serviceImpl;

import com.main.dao.MenuDao;
import com.main.dto.MenuDTO;
import com.main.service.serviceInterface.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2021/3/28.
 */

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuDao menuDao;

    /**
     * 查询所有的一级和二级菜单
     * @return
     */
    @Override
    public List<MenuDTO> findMenus() {
        return menuDao.findMenus();
    }


    /**
     * 根据给定的一级或者二级菜单编号，查找对应的一级和二级菜单
     * @param menuIds
     * @return
     */
    @Override
    public List<MenuDTO> findMenusByMenuId( List<String> menuIds) {

        return menuDao.findMenusByMenuId(menuIds);
    }
}
