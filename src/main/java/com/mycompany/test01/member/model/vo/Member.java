package com.mycompany.test01.member.model.vo;

import org.springframework.stereotype.Component;

@Component
public class Member {

	private static final long serialVersionUID = 1111L;
	private String id;
	private String passwd;
	private String name;
	
	public Member() {
		
	}
	

	public Member(String id, String passwd, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", passwd=" + passwd + ", name=" + name + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
