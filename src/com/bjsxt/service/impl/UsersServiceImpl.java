package com.bjsxt.service.impl;

import com.bjsxt.service.UsersService;

public class UsersServiceImpl implements UsersService {
    @Override
    public void addUsers() {
        System.out.println("addUsers……");
    }

    @Override
    public void updateUsers(String username) {
        System.out.println("updateUsers "+username);
    }
}
