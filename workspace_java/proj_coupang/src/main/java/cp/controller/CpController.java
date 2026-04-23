package cp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cp.DTO.CpDTO;
import cp.Service.CpService;


@WebServlet("/cpcontroller")
public class CpController extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/cpController doPost 실행");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String eMail = request.getParameter("email");
		String phoneNum = request.getParameter("phoneNum");
		String[] essential = request.getParameterValues("essential");
		String[] option = request.getParameterValues("option");
		
		CpDTO cpDTO = new CpDTO();
		if(pw != null) {
			
			cpDTO.setId(id);
			cpDTO.setPassword(pw);
			cpDTO.setName(name);
			cpDTO.setPhoneNum(phoneNum);
			CpService cpService = new CpService();
			int a= cpService.join(cpDTO);
			System.out.println(a);
			System.out.println("가입성공");
			response.sendRedirect("/proj_coupang/mainpage.jsp");
		}else {
			System.out.println("유저 삭제를 시작합니다");
			cpDTO.setId(id);
			CpService cpService = new CpService();
			int a= cpService.userDelete(cpDTO);
			System.out.println(a);
			response.sendRedirect("/proj_coupang/forward");
		}
		
	}

}
