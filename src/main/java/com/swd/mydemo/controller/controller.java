package com.swd.mydemo.controller;

import com.swd.mydemo.bean.User;
import com.swd.mydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mydemo
 * @Date: 2019/12/25 14:36
 * @Author: lhh
 * @Description:
 */
@RestController
public class controller {

    @Autowired
    UserService userService;

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable("id") Integer id)
    {
        return userService.getUserById(id);
    }

    @GetMapping("user")
    public void updateUserById(User user)
    {
        userService.updateUserById(user);
    }

}
