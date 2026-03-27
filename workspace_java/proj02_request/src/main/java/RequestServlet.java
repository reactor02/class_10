

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/req")
public class RequestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet 실행");
		
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String item = request.getParameter("item");
		String[] items = request.getParameterValues("item");
		String none = request.getParameter("none");
		String hidden = request.getParameter("hidden");
		String btn1 = request.getParameter("btn1");
		String btn2 = request.getParameter("btn2");
		String radio1 = request.getParameter("radio1");
		String ta = request.getParameter("ta");
		String date1 = request.getParameter("date1");
		String[] selects = request.getParameterValues("select");
		System.out.println("id : "+id);
		System.out.println("pw : "+pw);
		// 여러 개가 있어도 하나만 가져온다
		System.out.println("item : "+item);
		
		// 없으면 null
		System.out.println(request.getParameter("pw2"));
		if(items == null) {
			System.out.println("null입니다");
		}else {
			for(String a : items) {
				System.out.println(a);
			}
		}
		System.out.println("none : "+none);
		System.out.println("hidden : "+hidden);
		System.out.println("btn1 : "+btn1);
		System.out.println("btn2 : "+btn2);
		System.out.println(request.getParameter("pw2"));
		if(selects == null) {
			System.out.println("null입니다");
		}else {
			// select는 단 하나만 와서 getParameter를 하는데
			// 한개짜리 배열로도 온다는 거 연습
			for(String a : selects) {
				System.out.println(a);
			}
		}
		System.out.println("radio1 : "+radio1);
		System.out.println("ta : "+ta);
		System.out.println("date1 : "+date1);
		
		
		response.getWriter().println("{\"key\" : 1234}");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doPost 실행 ");
		
		// post로 보낸 id 값 출력
		String id = request.getParameter("id");
		System.out.println("id :" + id);
	}

}
