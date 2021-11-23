package com.mycompany.test01.member.model.service;

import java.util.List;

import com.mycompany.test01.member.model.vo.Member;

public interface MemberService {

	List<Member> listMember();
	int insertMember(Member m);
	
}
