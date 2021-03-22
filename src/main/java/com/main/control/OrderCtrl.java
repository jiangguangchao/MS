package com.main.control;

import com.main.dao.FOrderdao;
import com.main.dto.FOrderDTO;
import com.main.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:jgc
 * @create:2021-03-16 09:50
 */

@RestController
public class OrderCtrl {

    @Autowired
    public FOrderdao orderDao;

    @RequestMapping("/forder")
    @ResponseBody
    public Result findOrder() {
        Result result = new Result();
        result.setCode("01");
        result.setMessage("查询订单失败");
        FOrderDTO orderDTO = new FOrderDTO();
        System.out.println("-----------开始查询订单-----------");
        List<FOrderDTO> orderList = orderDao.findOrderDTO(orderDTO);

        System.out.println("-----------查询订单结束-----------");
        System.out.println(orderList);
        if (orderList == null) {
            System.out.println("查询订单为空");
            return result;
        }
        System.out.println("开始组装map");
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("orderList", orderList);
        return result.ok(data,"查询订单成功");

    }

    @RequestMapping("/forder/query")
    public Result queryOrderList(@RequestBody FOrderDTO orderQuery ) {
        Result result = new Result();
        result.setCode("01");
        result.setMessage("查询订单失败");

        System.out.println("-----------开始查询订单-----------");
        List<FOrderDTO> orderList = orderDao.findOrderDTO(orderQuery);
        System.out.println("-----------查询订单结束-----------");
        System.out.println(orderList);
        if (orderList == null) {
            System.out.println("查询订单为空");
            return result;
        }

        System.out.println("开始组装map");
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("orderList", orderList);
        return result.ok(data,"查询订单成功");

    }

    @RequestMapping("/forder/detail/{orderId}")
    public Result getOrderDetail(@PathVariable(name="orderId") Integer orderId) {
        Result result = new Result();
        result.setCode("01");
        result.setMessage("查询订单失败");

        if (orderId == null) {
            return result;
        }
        FOrderDTO orderDTO = new FOrderDTO();
        orderDTO.setOrderId(orderId);
        return this.queryOrderList(orderDTO);
    }

    @RequestMapping("/forder/modify")
    public Result modifyOrder(@RequestBody FOrderDTO order) {
        Result result = new Result();
        result.setCode("01");
        result.setMessage("修改订单失败");
        System.out.println(order);

        orderDao.modifyOrder(order);
        return result.ok(null,"");
    }
}
