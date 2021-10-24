package com.jmu.dp.center.provider.user;

import com.jmu.dp.api.user.UserLoginProvider;
import com.jmu.dp.api.user.request.UserLoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author gaohongming
 * @version 1.0.0
 * @ClassName UserProviderImpl.java
 * @Description TODO
 * @createTime 2021年10月24日 21:36:00
 */

@Slf4j
@DubboService(version = "1.0.0")
public class UserLoginProviderImpl implements UserLoginProvider {

    @Override
    public Boolean login(UserLoginRequest userLoginRequest) {
        log.info("JMU USER LOGIN NAME:{} PASSWORD:{}",userLoginRequest.getUserName(),userLoginRequest.getPassWord());
        return true;
    }
}
