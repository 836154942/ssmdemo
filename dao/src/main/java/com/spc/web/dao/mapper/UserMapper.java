package com.spc.web.dao.mapper;


import com.spc.web.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户数据映射
 * Created by spc on 2017/6/5.
 */
public interface UserMapper {

    @Select(value="select username,password,enabled from users where username = #{username}")
    User loadUserByUsername(@Param("username") String username);
    @Insert(value="insert into users (username, password, enabled, create_date) value(#{username},#{password},#{enabled},#{createDate})")
    void saveUser(User user);
}