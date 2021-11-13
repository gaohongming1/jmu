package com.jmu.ds.rpc.user.impl;

import com.jmu.ds.DsApplication;
import com.jmu.ds.rpc.user.UserLoginRpc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DsApplication.class)
public class UserLoginRpcImplTest {

    @Resource
    UserLoginRpc userLoginRpc;


    @Test
    public void testLogin() {
        Boolean status = userLoginRpc.login("test","123456");
        System.out.println(status);
    }
}