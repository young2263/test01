package com.mycompany.test01.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.test01.member.model.service.MemberService;
import com.mycompany.test01.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/signUp", method = RequestMethod.POST)
	public String signUp(Model m,HttpServletRequest httpServletRequest) {
		List<Member> result = memberService.listMember();
		String id =httpServletRequest.getParameter("id");
		String passwd =httpServletRequest.getParameter("passwd");
		String name =httpServletRequest.getParameter("name");
		
		Member member = new Member();
		member.setId(id);
		member.setPasswd(passwd);
		member.setName(name);
		int loginResult = memberService.insertMember(member);
		if(loginResult == 1) {
			m.addAttribute("result",result);
			m.addAttribute("msg","성공하였습니다");
		}else if(loginResult == 0) {
			m.addAttribute("msg", "실패하였습니다");
		}else {
			m.addAttribute("msg","예외가 발생하였습니다");
		}
		
		return "redirect:/";
	}
	
}
