package com.swd.mydemo.service;

import com.swd.mydemo.bean.User;
import com.swd.mydemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @program: mydemo
 * @Date: 2019/12/25 14:34
 * @Author: lhh
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Cacheable(cacheNames = "userw",key = "#id")//key里面的id取得是参数id
    public User getUserById(Integer id)
    {
        System.out.println("查询"+id+"员工");
        User user = userDao.getById(id);
        return user;
    }

    @CachePut(cacheNames = "userw",key = "#result.id")//result.id和user.id都可以
    public User updateUserById(User user)
    {
        System.out.println("更新"+user.getId()+"员工"+user.getUsername());
        userDao.updateById(user);
        return user;
    }

}
