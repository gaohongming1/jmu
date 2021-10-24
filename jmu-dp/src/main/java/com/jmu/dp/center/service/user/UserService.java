package com.jmu.dp.center.service.user;

import com.jmu.dp.center.dao.entity.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);
}
