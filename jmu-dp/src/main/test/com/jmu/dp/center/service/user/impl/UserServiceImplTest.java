package com.jmu.dp.center.service.user.impl;

import com.jmu.dp.DpApplication;
import com.jmu.dp.center.dao.entity.UserBean;
import com.jmu.dp.center.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DpApplication.class)
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("test", "123456");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}