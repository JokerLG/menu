package com.lg.menu.controller;/*
作者：花容
时间：2025/12/22 17:53
描述： 系统用户 请求接口
*/

import com.lg.menu.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @GetMapping("/test")
    public Integer test(){

        return null;
    }
}
