package com.main.control;

import com.main.dao.MenuDao;
import com.main.dto.MenuDTO;
import com.main.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:jgc
 * @create:2021-03-22 11:53
 */

@RestController
public class MenuCtrl {

    @Autowired
    private MenuDao menuDao;

    public Result findMenus () {
        Result result = new Result();
        result.setCode("01");
        result.setMessage("查询菜单失败");

        List<MenuDTO> menuDTOList = menuDao.findMenus();
        System.out.println(menuDTOList);
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("menuList", menuDTOList);
        return result.ok(data,"查询菜单成功");

    }
}
