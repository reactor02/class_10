package emp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;


@WebServlet("/list")
public class EmpListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpService empService = new EmpService();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		int size= 10; // 페이지당 표시수
		int page=1; // 현재 페이지
		
		String sSize = request.getParameter("size");
		String sPize = request.getParameter("page");
		
		try {
			
			size = Integer.parseInt(sSize);
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// 같이 있으면 처음꺼 오류시 두번째도 안되니까 분리
		try {
			
			page = Integer.parseInt(sPize);
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setSize(size);
		empDTO.setPage(page);
		//DB 조회
		Map map = empService.getListEmp(empDTO);
		
		request.setAttribute("list", list);
		//jsp로 보내기
		
		request.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(request, response);
		
	}

	

}
