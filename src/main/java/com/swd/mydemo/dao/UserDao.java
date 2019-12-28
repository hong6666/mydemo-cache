package com.swd.mydemo.dao;

import com.swd.mydemo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @program: mydemo
 * @Date: 2019/12/25 14:32
 * @Author: lhh
 * @Description:
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User getById(Integer id);

    @Update("update user set username = #{username} , password = #{password} where id = #{id}")
    void updateById(User user);

}
