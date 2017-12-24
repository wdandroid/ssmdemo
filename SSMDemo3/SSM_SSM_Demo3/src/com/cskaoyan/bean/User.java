package com.cskaoyan.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private int uid;
	private String username;
	private String nickname;
	private String password;
	private String email;
	private Date birthday;
	private String headicon;
	private Date updatetime;
	
	private int state;
	private String activecode;
	
 	
	
	 
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getHeadicon() {
		return headicon;
	}
	public void setHeadicon(String headicon) {
		this.headicon = headicon;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getActivecode() {
		return activecode;
	}
	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", nickname="
				+ nickname + ", password=" + password + ", email=" + email
				+ ", birthday=" + birthday + ", headicon=" + headicon
				+ ", updatetime=" + updatetime + ", state=" + state
				+ ", activecode=" + activecode + ", shoppingCart="
				+ "" + "]";
	}
	 
	
	
}
