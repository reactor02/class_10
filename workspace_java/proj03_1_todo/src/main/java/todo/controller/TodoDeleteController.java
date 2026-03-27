package todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

/**
 * Servlet implementation class TodoDeleteController
 */
@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String todo_id = request.getParameter("todo_id");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost /todo/delete 실행");
		String todo_id = request.getParameter("todo_id");
		
		TodoDTO dto = new TodoDTO();
		dto.setTodo_id(Integer.parseInt(todo_id));
		
		TodoService service = new TodoService();
		service.deleteTodo(dto);
		
		response.sendRedirect("../todo");
	}

}
