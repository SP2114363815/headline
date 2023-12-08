package com.shaopeng.controller;

import com.shaopeng.pojo.Headline;
import com.shaopeng.service.HeadlineService;
import com.shaopeng.utils.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("headline")
@CrossOrigin//跨域
public class HeadlineController {
    @Autowired
    private HeadlineService headlineService;

    //登录以后才能发布
    @PostMapping("publish")
    public Result publish(@RequestBody Headline headline,@RequestHeader String token){
        Result result=headlineService.publish(headline,token);
        return result;
    }


    @PostMapping("findHeadlineByHid")
    public Result findHeadlineByHid(Integer hid){
       Headline headline=headlineService.getById(hid);
       Map data=new HashMap<>();
       data.put("headline",headline);
       return Result.ok(data);
    }

    @PostMapping("update")
    public Result update(@RequestBody Headline headline){
        Result result=headlineService.updateDate(headline);
        return result;
    }

    @PostMapping("removeByHid")
    public Result removeByHid(Integer hid){
        headlineService.removeById(hid);
        return Result.ok(null);
    }
}
