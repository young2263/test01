package com.mycompany.test01.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.test01.member.model.vo.Member;

@Repository
public class MemberDao {

		@Autowired
		private SqlSession sqlSession;
		
		public List<Member> listMember(){
			return sqlSession.selectList("Member.memberlist");
		}
		
		public int insertMember(Member m){
			return sqlSession.insert("Member.signUp",m);
		}
	
}
