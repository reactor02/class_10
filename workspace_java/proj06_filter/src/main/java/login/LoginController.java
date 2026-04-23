package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 비번이 1234인 경우만
		String pw = request.getParameter("pw");
		if("1234".equals(pw)) {
			HttpSession session = request.getSession();
			session.setAttribute("login", "Y");
			response.sendRedirect("main");
			return;
		}
		// 그렇지 않은 경우
		// 로그인 페이지로 이동
		
		if(pw == null) {
			System.out.println("세션이 텅텅 비었습니다");
			System.out.println("로그인 해줘");
			response.sendRedirect("login.jsp");
			return;
		}
		
		if(!("1234".equals(pw))) {
			System.out.println("암호가 다르잖아");
			System.out.println("로그인으로 가라");
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
