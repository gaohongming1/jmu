package com.jmu.dp.api.user;

import com.jmu.dp.api.user.request.UserLoginRequest;

public interface UserLoginProvider {

    /**
     *
     * @param userLoginRequest
     * @return
     */
    Boolean login(UserLoginRequest userLoginRequest);
}
