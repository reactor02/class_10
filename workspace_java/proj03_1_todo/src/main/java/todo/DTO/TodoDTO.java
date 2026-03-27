package todo.DTO;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

// DTO : Data Transfer Object
// VO : Value Object
public class TodoDTO {
	
	/*
	 * Map map = new HashMap();
				map.put("todo_id", todo_id);
				map.put("duedate", duedate);
				map.put("done", done);
				map.put("contents", contents);
				map.put("ctime", ctime);
				
				list.add(map);
	 * 
	 * 
	 */
	
	private int todo_id = -1;
	private Date duedate;
	private int done;
	private String contents;
	private Date ctime;
	public int getTodo_id() {
		return todo_id;
	}
	public void setTodo_id(int todo_id) {
		this.todo_id = todo_id;
	}
	public Date getDueDate() {
		return duedate;
	}
	public void setDueDate(Date duedate) {
		this.duedate = duedate;
	}
	public int getDone() {
		return done;
	}
	public void setDone(int done) {
		this.done = done;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	
	@Override
	public String toString() {
		return "TodoDTO [todo_id=" + todo_id + ", duedate=" + duedate + ", done=" + done + ", contents=" + contents
				+ ", ctime=" + ctime + "]";
	}
	
	
}
