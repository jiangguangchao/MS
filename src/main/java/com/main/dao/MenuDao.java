package com.main.dao;

import com.main.dto.MenuDTO;

import java.util.List;

public interface MenuDao {

    public List<MenuDTO> findMenus();
}
