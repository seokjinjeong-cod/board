package co.seokjin.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.seokjin.board.notice.service.NoticeService;
import co.seokjin.board.notice.service.NoticeVO;
import co.seokjin.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 하나의 게시글조회
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.valueOf(request.getParameter("nid")));
		vo = noticeDao.noticeSelect(vo);
		request.setAttribute("notice", vo);
		return "notice/noticeSelect";
	}

}
