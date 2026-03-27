package todo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;


@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/modify goGet 실행");
		String todo_id = request.getParameter("todo_id");
		
		System.out.println("todo_id : " + todo_id);
		
		System.out.println("/todo doGet 실행!!");
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		// DB에서 모든 목록 가져오기
		// "todo_id" 받아서 출력하세요

		int nTodo_id = Integer.parseInt(todo_id);
		// nTodo_id를 service --> DAO 까지 보낼꺼임
		
		TodoService todoService = new TodoService();
		TodoDTO todoDTO = todoService.getTodo(nTodo_id);
		
		PrintWriter out = response.getWriter(); 
		
		out.write("<form method=post action=update>");
		out.write("Todo_id :"+"<span>" +todoDTO.getTodo_id()+ "</span><br>" ); 
		out.write("<input type=hidden name=todo_id value="+ todoDTO.getTodo_id() + ">");
		out.write( "Done"+"<input type=\"number\" name=done value=\"" +todoDTO.getDone()+ "\"><br>");
		out.write( "Duedate"+"<input type=\"date\" name =dueDate value=\"" +todoDTO.getDueDate()+ "\"><br>");
		out.write( "Contents"+"<input type=\"text\" name= contents value=\"" +todoDTO.getContents()+ "\"><br>");
		out.write("<button type=submit>수정가자</button>");
		out.write("</form>");
		System.out.println(todoDTO);
		
		
		
		
		
		
		
	}

}
