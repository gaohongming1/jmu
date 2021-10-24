package com.jmu.ds.rpc.user.impl;

import com.jmu.dp.api.user.UserLoginProvider;
import com.jmu.dp.api.user.request.UserLoginRequest;
import com.jmu.ds.rpc.user.UserLoginRpc;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author gaohongming
 * @version 1.0.0
 * @ClassName UserLoginRpcImpl.java
 * @Description TODO
 * @createTime 2021年10月24日 21:57:00
 */
@Slf4j
@Service
public class UserLoginRpcImpl implements UserLoginRpc {

    @DubboReference(version = "1.0.0")
    UserLoginProvider userLoginProvider;

    @Override
    public Boolean login(String name, String passWord) {
        UserLoginRequest userLoginRequest = new UserLoginRequest();
        userLoginRequest.setUserName("test");
        userLoginRequest.setPassWord("123456");
        return userLoginProvider.login(userLoginRequest);
    }
}
