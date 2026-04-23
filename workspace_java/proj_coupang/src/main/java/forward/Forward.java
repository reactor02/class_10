package forward;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cp.DTO.CpDTO;
import cp.Service.CpService;


@WebServlet("/forward")
public class Forward extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doGet 실행");
		CpService cpService = new CpService();
		if(request.getParameter("id") != null ) {
			System.out.println("/하나잡기");
			
			String id = request.getParameter("id");
			CpDTO cpDTO= cpService.selectOne(id);
			request.setAttribute("cpDTO", cpDTO);
			request.getRequestDispatcher("/userdetail.jsp").forward(request, response);
			
		}else {
			System.out.println("다잡기");
			List list= cpService.userSelectAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/userlist.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doPost 실행");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String phoneNum = request.getParameter("phoneNum");
		String name = request.getParameter("name");
		CpDTO cpDTO = new CpDTO();
		cpDTO.setId(id);
		cpDTO.setPassword(pw);
		cpDTO.setPhoneNum(phoneNum);
		cpDTO.setName(name);
		CpService cpservice = new CpService();
		int a = cpservice.userUpdate(cpDTO);
		System.out.println(a);
		response.sendRedirect("forward?id="+cpDTO.getId() );
	}

}
