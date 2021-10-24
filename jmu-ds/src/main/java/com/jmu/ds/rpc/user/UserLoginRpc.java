package com.jmu.ds.rpc.user;

/**
 * @author gaohongming
 * @version 1.0.0
 * @ClassName UserLoginRpc.java
 * @Description TODO
 * @createTime 2021年10月24日 21:57:00
 */
public interface UserLoginRpc {

    Boolean login(String name,String passWord);
}
