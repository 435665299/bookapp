package com.baidu.test.entity;

import java.io.Serializable;



/**
 * The persistent class for the user database table.
 * 
 */

public class User implements Serializable {
	private static final long serialVersionUID = 1L;


	private int userId;

	private int departmentId;

	private int powerId;

	private String userName;

	private String userPassword;
	

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getPowerId() {
		return this.powerId;
	}

	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
		
}