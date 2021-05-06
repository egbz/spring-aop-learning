package com.zmxy.springaoplearning.service.impl;

import com.zmxy.springaoplearning.entity.User;
import com.zmxy.springaoplearning.service.UserService;

/**
 * @author will
 * @date 2020/11/20
 */
public class UserServiceImpl implements UserService {
    private static User user = null;
    @Override
    public User createUser(String firstName, String lastName, int age) {
        user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @Override
    public User queryUser() {
        return user;
    }
}
