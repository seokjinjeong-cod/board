package co.seokjin.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.seokjin.prj.member.service.MemberService;
import co.seokjin.prj.member.serviceImpl.MemberServiceImpl;
import co.seokjin.prj.member.vo.MemberVO;

public class MemberSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId((String)session.getAttribute("id"));
		vo = memberDao.memberSelect(vo);
		
		request.setAttribute("member", vo);
		
		return "member/memberSelect";
	}

}
