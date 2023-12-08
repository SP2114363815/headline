package com.shaopeng.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shaopeng.pojo.Headline;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shaopeng.pojo.vo.PortalVo;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author 邵
* @description 针对表【news_headline】的数据库操作Mapper
* @createDate 2023-12-04 15:03:07
* @Entity com.shaopeng.pojo.Headline
*/
public interface HeadlineMapper extends BaseMapper<Headline> {
    IPage<Map> selectMyPage(IPage page, @Param("portalVo") PortalVo portalVo);

    Map queryDetailMap(Integer hid);
}




