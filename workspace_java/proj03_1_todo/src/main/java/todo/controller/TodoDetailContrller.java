package todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/detail")
public class TodoDetailContrller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Connection conn = null ;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			System.out.println("/todo doGet 실행!!");
			// 요청의 한글 깨짐 방지
			request.setCharacterEncoding("utf-8");
			// 응답의 한글 깨짐 방지
			response.setContentType("text/html; charset=utf-8;");
			// DB에서 모든 목록 가져오기
			// "todo_id" 받아서 출력하세요

			
			
			String todo_id = request.getParameter("todo_id");
			System.out.println("todo_id : " + todo_id);
			
			int nTodo_id = Integer.parseInt(todo_id);
			// nTodo_id를 service --> DAO 까지 보낼꺼임
			
			TodoService todoService = new TodoService();
			TodoDTO todoDTO = todoService.getTodo(nTodo_id);
			
			System.out.println(todoDTO);
			
			PrintWriter out = response.getWriter();
			out.println("<a href=../todo>" +"목록으로"+ "</a>");
//			out.println("<a href=/proj03_1_todo/todo>" +"목록으로"+ "</a>");
			out.write(" <br>todo_id: " + todoDTO.getTodo_id());
			out.write(" <br>dueDate: " + todoDTO.getDueDate());
			out.write(" <br>done: " + todoDTO.getDone());
			out.write(" <br>contents: " + todoDTO.getContents());
			out.write(" <br>cTime: " + todoDTO.getCtime());
			out.write(" <hr>");
			out.write(" <a href=http://localhost:8080/proj03_1_todo/todo/modify?todo_id=" +todoDTO.getTodo_id() +"> " +"수정페이지로 이동"+ "</a><br>");
			out.write(" <form method=post action=delete>");
			out.write(" <input type=hidden name=todo_id value= "+todo_id+">");
			out.write(" <input type=submit value =삭제>");
			out.write(" </form>");
//			out.write("<a href=http://localhost:8080/proj03_1_todo/todo/delete?todo_id=" +todoDTO.getTodo_id() +">"+"삭제"+ "</a><br>");
			
//			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
