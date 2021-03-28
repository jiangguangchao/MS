package com.main.control;

import com.main.dto.MenuDTO;
import com.main.response.Result;
import com.main.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2021/3/28.
 */

@RestController
public class UserCtrl {

    @Autowired
    private UserService userService;

    @RequestMapping("/menu")
    public Result findUserRoleMenus() {
        List<MenuDTO> menuDTOList = userService.findLoginUserMenus();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("menuList",menuDTOList);
        return new Result().ok(map, null);
    }
}
