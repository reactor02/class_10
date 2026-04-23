package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyPage
 */
@WebServlet("/mypage")
public class MyPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		// 기존에 세션이 없으면 null
		// 있으면 그걸 가져옴
		HttpSession session = request.getSession(false);
		
		if(session == null) {
			response.getWriter().println("서버켜진 이후 처음으로<br>");
			response.getWriter().println("여기로 처음 방문");
			response.getWriter().println("당연히 로그인 안했음");
			
//			response.sendRedirect("cookie/cookie.jsp");
		} else {
			
			response.getWriter().println("처음 방문은 아닌 것");
			
//			(boolean) session.getAttribute("login");
			Boolean login = ( Boolean) session.getAttribute("login");
			int level = (int) session.getAttribute("level");
			if(login == null || login!=true) {
				//로그인 안함
//				response.sendRedirect("cookie/cookie.jsp");
				response.getWriter().print("if문 안쪽");


			}else {
				response.getWriter().print("매우 사적이어서 로그인해야만 올 수 있는 곳");
				response.getWriter().print("<br>");
				response.getWriter().print("userId :" + session.getAttribute("userId"));
				if(level <= 1) {
					
					response.getWriter().print("관리자님 반갑습니다");
				} 
				// level이 1인 경우에

			}
		}
	}


}
