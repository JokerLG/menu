package com.lg.menu.service.impl.impl;/*
作者：花容
时间：2025/12/24 17:36
描述： 
*/

import com.lg.menu.common.ResponseResult;
import com.lg.menu.common.enums.ResponseEnum;
import com.lg.menu.common.exception.ServiceException;
import com.lg.menu.mapper.SysUserMapper;
import com.lg.menu.model.SysUser;
import com.lg.menu.service.impl.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SysUserImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public ResponseResult login(String userName, String password) {
        if(Objects.isNull(userName)){
            throw new ServiceException(4000, "用户名为空");
        }
        if (Objects.isNull(password)){
            throw new ServiceException(4001, "密码为空");
        }
        //通过账号去数据库查询用户信息
        SysUser sysUser = sysUserMapper.selectByUserName(userName);

        if(Objects.isNull(sysUser)){
            throw new ServiceException(4002,"该用户未注册，请注册后登录");
        }
        // 若用户存在 则对比密码
        if (!password.equals(sysUser.getPassword())){
            throw new ServiceException(4003,"密码错误");
        }

        return ResponseResult.success();
    }
}
