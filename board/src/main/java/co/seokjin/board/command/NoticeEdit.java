package co.seokjin.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.seokjin.board.notice.service.NoticeService;
import co.seokjin.board.notice.service.NoticeVO;
import co.seokjin.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeEdit implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.parseInt(request.getParameter("nId")));
		vo.setTitle(request.getParameter("modTitle"));
		vo.setContents(request.getParameter("modContents"));
		System.out.println(vo.getnId());
		System.out.println(request.getParameter("modTitle"));
		System.out.println(request.getParameter("modContents"));
		int n = noticeDao.noticeUpdate(vo);
		
		String viewPage = null;
		if(n != 0) {
			viewPage = "/noticeList.do";
		} else {
			request.setAttribute("message", "수정을 실패하였습니다.");
			viewPage = "notice/noticeFail";
		}
		return viewPage;
	}
}
