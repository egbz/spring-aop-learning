package com.zmxy.springaoplearning.service;

import com.zmxy.springaoplearning.entity.User;

/**
 * @author will
 * @date 2020/11/20
 */
public interface UserService {
    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
