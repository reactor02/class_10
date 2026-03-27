package todo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import todo.DTO.TodoAddDTO;
import todo.DTO.TodoDTO;

// DAO : Data Access Object
public class TodoDAO {
	
	// todo table의 모든 항목을 돌려주는 method
	// method name : selectAll
	// 전달인자 : 없음
	// return type : List
	public List<TodoDTO> selectAll () {
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// JDNI 방식
			// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속(그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();
			// SQL 준비
			String query = "select * from todo";
			ps = conn.prepareStatement(query);

			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();
			
			
			// 결과 활용
			while (rs.next()) {
				int todo_id = rs.getInt("todo_id");
				Date duedate = rs.getDate("duedate");
				int done = rs.getInt("done");
				String contents = rs.getString("contents");
				Date ctime = rs.getDate("ctime");
				
				
				
//				Map map = new HashMap();
//				map.put("todo_id", todo_id);
//				map.put("duedate", duedate);
//				map.put("done", done);
//				map.put("contents", contents);
//				map.put("ctime", ctime);
//				
//				list.add(map);
				
				TodoDTO todoDTO = new TodoDTO();
				todoDTO.setTodo_id(todo_id);
				todoDTO.setDueDate(duedate);
				todoDTO.setDone(done);
				todoDTO.setContents(contents);
				todoDTO.setCtime(ctime);
				
				list.add(todoDTO);
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// JNDI 방식
			// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다

		}
		
		return list;
	}
	
	// todo table의 한줄만 돌려주는 method
		// method name : selectOne
		// 전달인자 : int todo_id
		// return type : TodoDTO
		public TodoDTO selectOne(int todo_id) {
			TodoDTO todoDTO = new TodoDTO();
			
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				//1. DB접속 준비
				Context ctx = new InitialContext();
				// DataSource : 커넥션 풀 관리자
				DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				// DB 접속(그런데 이제 커넥션 풀로)
				conn = dataFactory.getConnection();
				
				//2. SQL 준비
//				String query = "select * from todo where todo_id =" + todo_id;
				String query = "select * from todo where todo_id =?";
				ps = conn.prepareStatement(query);
				ps.setInt(1, todo_id); //null 에러 안남.
				//3. 실행 밑 결과 확보
				rs = ps.executeQuery();
				//4. 결과 활용
				if(rs.next()) {
					todoDTO.setTodo_id(rs.getInt("todo_id"));
					todoDTO.setDueDate(rs.getDate("duedate"));
					todoDTO.setDone(rs.getInt("done"));
					todoDTO.setContents(rs.getString("contents"));
					todoDTO.setCtime(rs.getDate("Ctime"));
				}
				
				
				}catch (Exception e) {
					// TODO: handle exception
				}finally {
					if (rs != null) {
						try {
							rs.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (ps != null) {
						try {
							ps.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// JNDI 방식
					// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다

				}
				
				return todoDTO;
			}
		
		public List<TodoDTO> select(TodoDTO todoDTO) {
			List<TodoDTO> list = new ArrayList();
			
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				//1. DB접속 준비
				Context ctx = new InitialContext();
				// DataSource : 커넥션 풀 관리자
				DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				// DB 접속(그런데 이제 커넥션 풀로)
				conn = dataFactory.getConnection();
				
				String query = "select * from todo";
				if(todoDTO.getTodo_id() == -1) {
					// 모두검색
				} else {
					// where 검색
					query += " where todo_id = ? " ;
				}
				
				//2. SQL 준비
//				String query = "select * from todo where todo_id =" + todo_id;
				ps = conn.prepareStatement(query);
				
				if(todoDTO.getTodo_id() != -1) {
					
					ps.setInt(1, todoDTO.getTodo_id()); //null 에러 안남.
				}
				//3. 실행 밑 결과 확보
				rs = ps.executeQuery();
				//4. 결과 활용
				if(rs.next()) {
					todoDTO.setTodo_id(rs.getInt("todo_id"));
					todoDTO.setDueDate(rs.getDate("duedate"));
					todoDTO.setDone(rs.getInt("done"));
					todoDTO.setContents(rs.getString("contents"));
					todoDTO.setCtime(rs.getDate("Ctime"));
				}
				
				
				}catch (Exception e) {
					// TODO: handle exception
				}finally {
					if (rs != null) {
						try {
							rs.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (ps != null) {
						try {
							ps.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// JNDI 방식
					// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다

				}
				
				return list;
			}
		
		
		public int addOne(TodoAddDTO DTO) {
			
			
			Connection conn = null;
			PreparedStatement ps = null;
			int rs = -1;
			try {
				//1. DB접속 준비
				Context ctx = new InitialContext();
				// DataSource : 커넥션 풀 관리자
				DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				// DB 접속(그런데 이제 커넥션 풀로)
				conn = dataFactory.getConnection();
				
				//2. SQL 준비
//				String query = "select * from todo where todo_id =" + todo_id;
				String query = " INSERT INTO todo "; 
				       query +=" VALUES (seq_todo.nextval, NULL, 0, ?, sysdate)";
				ps = conn.prepareStatement(query);
				ps.setString(1, DTO.getContents()); //null 에러 안남.
				//3. 실행 밑 결과 확보
				rs = ps.executeUpdate();
				System.out.println("insert 삽입결과" + rs);
				
				
				//4. 결과 활용
//				if(rs.next()) {
//					todoDTO.setTodo_id(rs.getInt("todo_id"));
//					todoDTO.setDuedate(rs.getDate("duedate"));
//					todoDTO.setDone(rs.getInt("done"));
//					todoDTO.setContents(rs.getString("contents"));
//					todoDTO.setCtime(rs.getDate("Ctime"));
//				}
				
				
				}catch (Exception e) {
					// TODO: handle exception
				}finally {
//					if (rs != 0) {
//						try {
//							rs.close();
//						} catch (SQLException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//					}
					if (ps != null) {
						try {
							ps.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// JNDI 방식
					// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다

				}
				
				return rs;
			}
		
public int updateTodo(TodoDTO dto) {
			
			
			Connection conn = null;
			PreparedStatement ps = null;
			int rs = -1;
			try {
				//1. DB접속 준비
				Context ctx = new InitialContext();
				// DataSource : 커넥션 풀 관리자
				DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				// DB 접속(그런데 이제 커넥션 풀로)
				conn = dataFactory.getConnection();
				
				//2. SQL 준비
				String query = " update todo "; 
				       query +=" set done= ?, duedate= ?, contents= ? ";
				       query +=" where todo_id = ?" ;
				ps = conn.prepareStatement(query);
				ps.setInt(1, dto.getDone()); 
				ps.setDate(2, dto.getDueDate()); 
				ps.setString(3, dto.getContents()); 
				ps.setInt(4, dto.getTodo_id()); 
				//3. 실행 밑 결과 확보
				rs = ps.executeUpdate();
				System.out.println("insert 삽입결과" + rs);
				
				
				//4. 결과 활용
//				if(rs.next()) {
//					todoDTO.setTodo_id(rs.getInt("todo_id"));
//					todoDTO.setDuedate(rs.getDate("duedate"));
//					todoDTO.setDone(rs.getInt("done"));
//					todoDTO.setContents(rs.getString("contents"));
//					todoDTO.setCtime(rs.getDate("Ctime"));
//				}
				
				
				}catch (Exception e) {
					// TODO: handle exception
				}finally {
//					if (rs != 0) {
//						try {
//							rs.close();
//						} catch (SQLException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//					}
					if (ps != null) {
						try {
							ps.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// JNDI 방식
					// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다

				}
				
				return rs;
			}
public int deleteTodo(TodoDTO dto) {
	
	
	Connection conn = null;
	PreparedStatement ps = null;
	int rs = -1;
	try {
		//1. DB접속 준비
		Context ctx = new InitialContext();
		// DataSource : 커넥션 풀 관리자
		DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
		// DB 접속(그런데 이제 커넥션 풀로)
		conn = dataFactory.getConnection();
		
		//2. SQL 준비
		String query = " delete todo "; 
		       query +=" where todo_id = ?" ;
		ps = conn.prepareStatement(query);
		
		ps.setInt(1, dto.getTodo_id()); 
		//3. 실행 밑 결과 확보
		rs = ps.executeUpdate();
		System.out.println("insert 삽입결과" + rs);
		
		
		//4. 결과 활용
//		if(rs.next()) {
//			todoDTO.setTodo_id(rs.getInt("todo_id"));
//			todoDTO.setDuedate(rs.getDate("duedate"));
//			todoDTO.setDone(rs.getInt("done"));
//			todoDTO.setContents(rs.getString("contents"));
//			todoDTO.setCtime(rs.getDate("Ctime"));
//		}
		
		
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
//			if (rs != 0) {
//				try {
//					rs.close();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// JNDI 방식
			// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다

		}
		
		return rs;
	}
}
