package com.neusoft.crm.service;

import com.neusoft.crm.entity.SysUser;

public interface LoginService {
	public SysUser selectsysUserByNameByPass(SysUser sysUser);
		
	
}
