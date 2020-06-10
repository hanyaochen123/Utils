package com.wang.service.impl;

import com.wang.mapper.UserMapper;
import com.wang.model.UserDto;
import com.wang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dolyw.com
 * @date 2018/8/9 15:45
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDto> implements IUserService {
    @Autowired
    UserMapper userMapper;

    public void user(){
    }
}
