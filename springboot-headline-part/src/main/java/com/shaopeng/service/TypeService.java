package com.shaopeng.service;

import com.shaopeng.pojo.Type;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shaopeng.utils.Result;

/**
* @author 邵
* @description 针对表【news_type】的数据库操作Service
* @createDate 2023-12-04 15:03:07
*/
public interface TypeService extends IService<Type> {
    /**
     *
     * 查询所有类别数据
     * @return
     */
    Result findAllTypes();


}
