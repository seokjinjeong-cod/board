package co.seokjin.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.seokjin.board.notice.service.NoticeService;
import co.seokjin.board.notice.service.NoticeVO;
import co.seokjin.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeDelete implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.valueOf(request.getParameter("nId")));
		int n = noticeDao.noticeDelete(vo);
		
		String viewPage = null;
		
		if(n != 0) {
			viewPage = "noticeList.do";
		} else {
			request.setAttribute("message", "삭제가 실패 했습니다.");
			viewPage = "notice/noticeFail";
		}
		
		return viewPage;
	}
}
