package com.yzc.spring5.core.service.impl;

import com.yzc.spring5.core.entity.User;
import com.yzc.spring5.core.mapper.UserMapper;
import com.yzc.spring5.core.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author public
 * @since 2023-02-07
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        List<User> userList = userMapper.getUsers();
        log.info("当前的用户有：{}", userList);
        return userList;
    }
}
