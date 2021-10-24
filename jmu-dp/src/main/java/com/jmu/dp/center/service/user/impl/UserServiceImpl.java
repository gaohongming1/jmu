package com.jmu.dp.center.service.user.impl;

import com.jmu.dp.center.dao.entity.UserBean;
import com.jmu.dp.center.dao.mapper.UserMapper;
import com.jmu.dp.center.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Resource
    private UserMapper userMapper;


    @Override
    public UserBean loginIn(String name, String passWord) {
        return userMapper.getInfo(name, passWord);
    }

}