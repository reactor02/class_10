package todo.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoAddDTO;
import todo.DTO.TodoDTO;
import todo.service.TodoService;

/**
 * Servlet implementation class TodoCommandController
 */
@WebServlet("/cmd")
public class TodoCommandController extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String todo_id = request.getParameter("todo_id");
		String cmd = request.getParameter("cmd");
		
		if(cmd.equals("insert")) {
			
			insert(request, response);
		}else if(cmd.equals("update"))
		
		update(request, response);
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/update doPost 실행!!");
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		String todo_id = request.getParameter("todo_id");
		String done = request.getParameter("done");
		String dueDate = request.getParameter("dueDate");
		String contents = request.getParameter("contents");
		
		System.out.println(dueDate);
		
		TodoDTO dto = new TodoDTO();
		try {
			dto.setTodo_id(Integer.parseInt(todo_id));
			dto.setDone(Integer.parseInt(done));
			Date a= Date.valueOf(dueDate);
			dto.setDueDate(a);
			dto.setContents(contents);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		TodoService todoService= new TodoService();
		todoService.updateTodo(dto);
		
		response.sendRedirect("http://localhost:8080/proj03_1_todo/detail?todo_id=" + todo_id);
		
	}
}
