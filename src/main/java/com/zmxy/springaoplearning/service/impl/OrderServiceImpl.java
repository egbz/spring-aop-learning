package com.zmxy.springaoplearning.service.impl;

import com.zmxy.springaoplearning.entity.Order;
import com.zmxy.springaoplearning.service.OrderService;

/**
 * @author will
 * @date 2020/11/20
 */
public class OrderServiceImpl implements OrderService {
    private static Order order = null;

    @Override
    public Order createOrder(String userName, String product) {
        order = new Order();
        order.setUserName(userName);
        order.setProduct(product);
        return order;
    }

    @Override
    public Order queryOrder(String userName) {
        return order;
    }
}
