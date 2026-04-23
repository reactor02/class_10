package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp.EmpDTO;
import login.LoginDAO;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/loginCheck")
public class LoginCheck extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDTO empDTO = new EmpDTO();
//		request.getParameter("ename");
//		request.getParameter("empno");
		empDTO.setEmpno(Integer.parseInt(request.getParameter("empno")) );
		empDTO.setEname(request.getParameter("ename"));
		
		//db에서 로그인한 dto를 받는다
		//단, 로그인 실패 시 null 받는다
		LoginDAO loginDAO = new LoginDAO();
		EmpDTO resultDTO = loginDAO.getSelectMember(empDTO);
		// null이면
		//		로그인 페이지로 이동
		if(resultDTO == null) {
			
			response.sendRedirect("login.jsp?msg=1");
		}else if(resultDTO != null) {
		// null이 아니면
		//		emp list 보여주는 서블릿으로 이동
		// 		일단 로그인 성공이라고만 출력
			System.out.println("로그인 성공");
			System.out.println(resultDTO.getJob() + "환영합니다");
			
			HttpSession session = request.getSession();
			session.setAttribute("resultDTO", resultDTO);
		}
		
	}

	
	

}
