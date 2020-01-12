package com.neusoft.crm.entity;

public class sysUser {
private int userId;
private String userName;
private String Password;
private int daId;
private int userRoleId;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getDaId() {
	return daId;
}
public void setDaId(int daId) {
	this.daId = daId;
}
public int getUserRoleId() {
	return userRoleId;
}
public void setUserRoleId(int userRoleId) {
	this.userRoleId = userRoleId;
}

}
