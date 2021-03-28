package com.main.service.serviceImpl;

import com.main.bean.User;
import com.main.dao.UserDao;
import com.main.dto.MenuDTO;
import com.main.service.serviceInterface.MenuService;
import com.main.service.serviceInterface.RoleMenuService;
import com.main.service.serviceInterface.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2021/3/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleMenuService roleMenuService;

    @Autowired
    private MenuService menuService;


    @Override
    public User findUserById(String userId) {
        return userDao.findUserById(userId);
    }


    @Override
    public User getLoginUser() {
        Subject subject = SecurityUtils.getSubject();
        Object obj = subject.getPrincipal();
        if (obj == null) {
            System.out.println("当前没有用户登录");
            return null;
        }
        String userId = (String)obj;
        User user = userDao.findUserById(userId);
        return user;
    }

    @Override
    public List<MenuDTO> findLoginUserMenus() {

        User loginUser = getLoginUser();
        if (loginUser == null) {
            System.out.println("当前没有登录用户");
            return null;
        }

        System.out.println("当前登录用户：" + loginUser);

        /*
        查找当前登录用户所拥有的菜单编号，这里的菜单编号有一级菜单编号
        和二级菜单编号，给角色配置菜单，正常情况下只需要配置二级编号。
        不需要配置一级编号，因为根据二级编号可以查找一级编号。之所以配
        置一级菜单编号，是针对没有子菜单的一级菜单，比如首页。
         */
        List<String> menuIdList = roleMenuService.findMenuIdsByRoleId(loginUser.getRole());
        System.out.println("该用户的菜单编号：" + menuIdList);

        /*
        根据菜单编号查找对应的一级和二级菜单。因为上面查找到的菜单编号，
        是一级编号和二级编号的集合，为了方便后面根据编号查找菜单。这里将
        一级和二级编号区分开，放入两个list中，一级编号长度是2位，二
        级编号是4位，根据位数进行划分。先测试在menu.xml中进行区分
         */
        List<MenuDTO> menuDTOList = menuService.findMenusByMenuId(menuIdList);

        return menuDTOList;
    }
}
