package com.main.dao;

import com.main.dto.MenuDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {

    public List<MenuDTO> findMenus();

    public List<MenuDTO> findMenusByMenuId(@Param("menuIds") List<String> menuIds);
}
