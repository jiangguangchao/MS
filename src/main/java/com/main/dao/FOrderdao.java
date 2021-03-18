package com.main.dao;

import com.main.bean.Forder;
import com.main.dto.FOrderDTO;

import java.util.List;

public interface FOrderdao {

    public Forder findOrderById(String orderId);

    public List<Forder> findOrders(Forder forder);

    public List<FOrderDTO> findOrderDTO(FOrderDTO orderDTO);

    public void modifyOrder(FOrderDTO orderDTO);
}
