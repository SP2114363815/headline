package com.shaopeng.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shaopeng.pojo.Type;
import com.shaopeng.service.TypeService;
import com.shaopeng.mapper.TypeMapper;
import com.shaopeng.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 邵
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2023-12-04 15:03:07
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    /**
     * 查询所有类别数据
     *
     * @return
     */
    @Override
    public Result findAllTypes() {
        List<Type> types = typeMapper.selectList(null);
        return Result.ok(types);
    }
}




