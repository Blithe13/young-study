package com.yzc.spring5.core.service;

import com.yzc.spring5.core.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author public
 * @since 2023-02-07
 */
public interface UserService extends IService<User> {
    List<User> getUsers();
}
