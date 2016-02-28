package com.maiquan.aladdin_user.domain;

import java.io.Serializable;

public class User  implements Serializable{
	
	private static final long serialVersionUID = -5657515818573348245L;
	private Long id;
	private String username;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
