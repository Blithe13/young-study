package com.yzc.spring5.core.controller;


import com.yzc.spring5.base.ApiResponse;
import com.yzc.spring5.core.entity.User;
import com.yzc.spring5.core.service.UserService;
import com.yzc.spring5.core.utils.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author public
 * @since 2023-02-07
 */
@RestController
@RequestMapping("/user")
@Api(value = "UserController", description = "用户控制层")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("getuser")
    @ApiOperation("查询用户")
    public ApiResponse getUser() {
        return new ApiResponse(userService.getUsers());
    }

    @PostMapping("usersaveredis")
    @ApiOperation("用户信息保存至redis")
    public ApiResponse saveRedis(@RequestBody User user) {
        boolean status = redisUtil.set(user.getUserName(), user.getPassword(), 10L);
        return new ApiResponse(status);
    }
}

