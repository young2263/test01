package com.mycompany.test01.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.test01.member.model.dao.MemberDao;
import com.mycompany.test01.member.model.vo.Member;


@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public List<Member> listMember(){
		return memberDao.listMember();
	}
	
	@Override
	public int insertMember(Member m){
		return memberDao.insertMember(m);
	}
	
}
