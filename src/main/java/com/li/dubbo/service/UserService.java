package com.li.dubbo.service;

import com.li.dubbo.deans.User;

public interface UserService {

    /**
     * 根据用户表示获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id,String username);
}
