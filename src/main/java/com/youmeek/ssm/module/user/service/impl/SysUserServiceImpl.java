package com.youmeek.ssm.module.user.service.impl;

import com.youmeek.ssm.module.user.mapper.SysUserMapper;
import com.youmeek.ssm.module.user.pojo.SysUser;
import com.youmeek.ssm.module.user.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;

//233555
	@Override
	public SysUser getById(Long id) {

		//update 1                  33   88 999  10101444 8899 00  112  888  9999
		return sysUserMapper.selectByPrimaryKey(id);
//7
	}
}
