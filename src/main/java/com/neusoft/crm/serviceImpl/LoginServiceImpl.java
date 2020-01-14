package com.neusoft.crm.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.SysUser;
import com.neusoft.crm.mapper.LoginMapper;
import com.neusoft.crm.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
@Autowired
private LoginMapper loginMapper;
	@Override
	public SysUser selectsysUserByNameByPass(SysUser sysUser) {
		
		return loginMapper.selectsysUserByNameByPass(sysUser);
	}

}
