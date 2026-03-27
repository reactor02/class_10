package todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoAddDTO;
import todo.service.TodoService;

/**
 * Servlet implementation class TodoAddServlet
 */
@WebServlet("/todo/add")
public class TodoAddController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo doGet 실행!!");
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		String contents = request.getParameter("contents");
		TodoAddDTO addDTO = new TodoAddDTO();
		addDTO.setContents(contents);
		
		TodoService service = new TodoService();
		int answer = service.addTodo(addDTO);
		
		
		System.out.println(addDTO.getContents());
		System.out.println(answer);
//		request.getRequestDispatcher("/todo").forward(request, response);
//		response.sendRedirect("../todo");
		response.sendRedirect("/proj03_1_todo/todo");
		
	}	

}
