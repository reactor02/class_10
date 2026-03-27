package forward;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Forward")
public class ForwardServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/Foreward의 doGet 실행");
		
		int num = 10;
		
		Map map = new HashMap();
		map.put("점심", "라면");
		map.put("개수", 3);
		System.out.println(map);
		
		request.setAttribute("num", num);
		request.setAttribute("map", map);
		
		List list = new ArrayList();
		list.add(7);
		list.add("글씨");
		list.add(map);
		
		String[] arr = new String[3];
		arr[0] = "x";
		arr[1] = "1";
		arr[2] = "2";
		
		TodoDTO dto = new TodoDTO();
		dto.setContents("할일");
		
		request.setAttribute("list", list);
		request.setAttribute("arr", arr);
		request.setAttribute("dto", dto);
		
		request.getRequestDispatcher("el_4.jsp").forward(request, response);
	
	}

	

}
