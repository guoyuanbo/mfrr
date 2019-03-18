package com.dubbo.provider;


import com.dubbo.api.UserService;

/**
 * Created by YYT on 2017/7/3.
 */
public class UserServiceImpl implements UserService {
    public String sayHi(String s) {
        return "hello " + s + "!";
    }
}
