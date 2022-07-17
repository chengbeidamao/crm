package com.dingdang.mapper;

import com.dingdang.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    /**
     * 判断登录用户
     * @param userName
     * @return
     */
    @Select("select * from user where user_name = #{userName}")
    User selectUser(String userName);

}
