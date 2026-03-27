package todo.service;

import java.util.List;

import todo.DAO.TodoDAO;
import todo.DTO.TodoAddDTO;
import todo.DTO.TodoDTO;

public class TodoService {
	
	public List getList() {
		// TodoDAO에 있는 selectAll을 호출하고
		// 그 리스트를 return 해주세요
		TodoDAO dao = new TodoDAO();
		List list = dao.selectAll();
		
		return list;
	}
	public TodoDTO getTodo(int todo_id) {
		TodoDAO dao = new TodoDAO();
		TodoDTO todoDTO = dao.selectOne(todo_id);
		return todoDTO;
	}
	
	public int addTodo(TodoAddDTO DTO) {
		TodoDAO dao = new TodoDAO();
		int a= dao.addOne(DTO);
		return a;
	} 	
	
	public void updateTodo(TodoDTO dto) {
		TodoDAO dao2 = new TodoDAO();
		dao2.updateTodo(dto);
		
	}
	
	public int deleteTodo(TodoDTO dto) {
		TodoDAO dao2 = new TodoDAO();
		int a = dao2.deleteTodo(dto);
		return a;
	}
}
