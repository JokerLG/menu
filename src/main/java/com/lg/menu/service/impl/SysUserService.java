package com.lg.menu.service.impl;/*
作者：花容
时间：2025/12/24 17:35
描述： 
*/

import com.lg.menu.common.ResponseResult;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;

@Service
public interface SysUserService {

    /**
     * 系统用户登录
     * @return
     */
    public ResponseResult login(String userName, String password);
}
