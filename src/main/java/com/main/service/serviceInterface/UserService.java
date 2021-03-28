package com.main.service.serviceInterface;

import com.main.bean.User;
import com.main.dto.MenuDTO;

import java.util.List;

/**
 * Created by Administrator on 2021/3/28.
 */
public interface UserService {

    public User findUserById(String userId);

    /**
     * 获取当前登录的用户信息
     * @return
     */
    public User getLoginUser();

    /**
     * 查找当前登录用户的菜单列表
     * @return
     */
    public List<MenuDTO> findLoginUserMenus();

}
