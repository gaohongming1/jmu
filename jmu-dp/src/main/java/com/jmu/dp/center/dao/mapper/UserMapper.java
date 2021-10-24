package com.jmu.dp.center.dao.mapper;

import com.jmu.dp.center.dao.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    UserBean getInfo(@Param("name") String name, @Param("passWord")String passWord);

}
