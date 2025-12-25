package com.lg.menu.controller;/*
作者：花容
时间：2025/12/22 17:53
描述： 系统用户 请求接口
*/

import com.lg.menu.common.ResponseResult;
import com.lg.menu.mapper.SysUserMapper;
import com.lg.menu.service.impl.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/login")
    public ResponseResult test(@RequestParam String userName, String password){
        return sysUserService.login(userName,password);
    }
}
