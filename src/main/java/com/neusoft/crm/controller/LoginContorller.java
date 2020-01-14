package com.neusoft.crm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.SysUser;
import com.neusoft.crm.service.LoginService;

@RestController
public class LoginContorller {
	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public SysUser selectsysUserByNameByPass(@RequestBody SysUser sysUser) {
		System.out.println(sysUser.getUserName()+"---");
		SysUser result = loginService.selectsysUserByNameByPass(sysUser);
		return result;

	}
}
