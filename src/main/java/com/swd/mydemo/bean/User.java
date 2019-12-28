package com.swd.mydemo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: mydemo
 * @Date: 2019/12/25 14:30
 * @Author: lhh
 * @Description:
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
}
