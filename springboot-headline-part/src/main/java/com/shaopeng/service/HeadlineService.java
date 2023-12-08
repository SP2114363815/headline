package com.shaopeng.service;

import com.shaopeng.pojo.Headline;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shaopeng.pojo.vo.PortalVo;
import com.shaopeng.utils.Result;

/**
* @author 邵
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2023-12-04 15:03:07
*/
public interface HeadlineService extends IService<Headline> {

    /**
     *
     *
     * 首页数据查询
     * @param portalVo
     * @return
     */
    Result findNewsPage(PortalVo portalVo);

    /**
     *
     * 根据id查询详情
     * @param hid
     * @return
     */
    Result showHeadlineDetail(Integer hid);




    /**
     *
     * 发布头条方法
     * @param headline
     * @return
     */
    Result publish(Headline headline, String token);

    //修改头条数据
    Result updateDate(Headline headline);
}
