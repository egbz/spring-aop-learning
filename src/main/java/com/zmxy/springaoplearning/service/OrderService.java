package com.zmxy.springaoplearning.service;

import com.zmxy.springaoplearning.entity.Order;

/**
 * @author will
 * @date 2020/11/20
 */
public interface OrderService {
    Order createOrder(String userName, String product);

    Order queryOrder(String userName);

}
