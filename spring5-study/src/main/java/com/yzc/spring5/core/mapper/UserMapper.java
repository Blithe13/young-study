package com.yzc.spring5.core.mapper;

import com.yzc.spring5.core.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author public
 * @since 2023-02-07
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> getUsers();
}
