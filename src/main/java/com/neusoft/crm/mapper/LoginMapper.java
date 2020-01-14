package com.neusoft.crm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.crm.entity.SysUser;
@Mapper
public interface LoginMapper {
	
	@Select ("select * from sysuser where userName=#{userName} and userPassword=#{userPassword}")
	public SysUser selectsysUserByNameByPass(SysUser sysUser);
}
