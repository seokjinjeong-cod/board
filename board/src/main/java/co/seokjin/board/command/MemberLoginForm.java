package co.seokjin.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberLoginForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		return "member/memberLoginForm";
	}

}
