package com.shaopeng.service;

import com.shaopeng.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shaopeng.utils.Result;

/**
* @author 邵
* @description 针对表【news_user】的数据库操作Service
* @createDate 2023-12-04 15:03:07
*/
public interface UserService extends IService<User> {

    /**
     *
     * 登录业务
     * @param user
     * @return
     */
    Result login(User user);

    /**
     *
     * 根据token获取用户数据
     * @param token
     * @return
     */

    Result getUserInfo(String token);

    /**
     *
     * 检查账号是否可用
     * @param username
     * @return
     */

    Result checkUserName(String username);

    /**
     * 注册业务
     * @param user
     * @return
     */

    Result regist(User user);
}
