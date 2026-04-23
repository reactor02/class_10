package cp.DAO;

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

import cp.DTO.CpDTO;

public class CpDAO {
	public int joinUpdate(CpDTO cpDTO) {
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
			String query = " insert into userinfo "; 
			       query +=" (id, password,  phoneNum, name, joinDate ) ";
	    		   query +=" values (?,?,?,?, sysdate )";	   
	    		   

			ps = conn.prepareStatement(query);
			
			ps.setString(1,  cpDTO.getId()); 
			ps.setString(2,  cpDTO.getPassword()); 
			ps.setString(3,  cpDTO.getPhoneNum()); 
			ps.setString(4,  cpDTO.getName());
			
			
			rs = ps.executeUpdate();
			System.out.println("insert userinfo 삽입결과" + rs);
			
			query =" insert into termcheck ";
		       query +=" (id, rterm1, rterm2, rterm3, rterm4, oterm1, oterm2, oterm3, oterm4) ";
		       query +=" values (?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		       ps = conn.prepareStatement(query);   
		       ps.setString(1,  cpDTO.getId());
				ps.setInt(2,  cpDTO.getrTerm1()); 
				ps.setInt(3,  cpDTO.getrTerm2()); 
				ps.setInt(4,  cpDTO.getrTerm3()); 
				ps.setInt(5,  cpDTO.getrTerm4()); 
				ps.setInt(6,  cpDTO.getoTerm1()); 
				ps.setInt(7,  cpDTO.getoTerm2()); 
				ps.setInt(8,  cpDTO.getoTerm3()); 
				ps.setInt(9,  cpDTO.getoTerm4()); 
			
				rs = ps.executeUpdate();
				System.out.println("insert termcheck 삽입결과" + rs);
			
			//4. 결과 활용
//			if(rs.next()) {
//				todoDTO.setTodo_id(rs.getInt("todo_id"));
//				todoDTO.setDuedate(rs.getDate("duedate"));
//				todoDTO.setDone(rs.getInt("done"));
//				todoDTO.setContents(rs.getString("contents"));
//				todoDTO.setCtime(rs.getDate("Ctime"));
//			}
			
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
//				if (rs != 0) {
//					try {
//						rs.close();
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
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
	
	
	public List<CpDTO> selectAll(){
		List<CpDTO> list = new ArrayList();
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			conn = dataFactory.getConnection();
			String query = "select * from userinfo";
			
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				CpDTO cpDTO= new CpDTO();
				String id = rs.getString("id");
				String pw = rs.getString("password");
				String phoneNum = rs.getString("phonenum");
				String name = rs.getString("name");
				Date joinDate = rs.getDate("joindate");
				
				cpDTO.setId(id);
				cpDTO.setPassword(pw);
				cpDTO.setPhoneNum(phoneNum);
				cpDTO.setName(name);
				cpDTO.setJoinDate(joinDate);
				
				list.add(cpDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
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
		}
		return list;
	}
	
	public CpDTO selectOne(String user){
		
		
		CpDTO cpDTO= new CpDTO();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			conn = dataFactory.getConnection();
			String query = " select * from userinfo ";
				   query += " where id = ?";
			
			ps= conn.prepareStatement(query);
			ps.setString(1, user);
				   
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				
				String id = rs.getString("id");
				String pw = rs.getString("password");
				String phoneNum = rs.getString("phonenum");
				String name = rs.getString("name");
				Date joinDate = rs.getDate("joindate");
				
				cpDTO.setId(id);
				cpDTO.setPassword(pw);
				cpDTO.setPhoneNum(phoneNum);
				cpDTO.setName(name);
				cpDTO.setJoinDate(joinDate);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
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
		}
		return cpDTO;
	}
	
	public int userUpdate(CpDTO cpDTO) {
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
			String query = " update userinfo ";
			       query +=" set password=?, phonenum=?, name=? ";
	    		   query +=" where id=? ";
	    		   

			ps = conn.prepareStatement(query);
			
			ps.setString(1,  cpDTO.getPassword()); 
			ps.setString(2,  cpDTO.getPhoneNum()); 
			ps.setString(3,  cpDTO.getName());
			ps.setString(4,  cpDTO.getId()); 
			
			
			rs = ps.executeUpdate();
			System.out.println("insert userinfo 삽입결과" + rs);
			
//			query =" insert into termcheck ";
//		       query +=" (id, rterm1, rterm2, rterm3, rterm4, oterm1, oterm2, oterm3, oterm4) ";
//		       query +=" values (?, ?, ?, ?, ?, ?, ?, ?, ?) ";
//		       ps = conn.prepareStatement(query);   
//		       ps.setString(1,  cpDTO.getId());
//				ps.setInt(2,  cpDTO.getrTerm1()); 
//				ps.setInt(3,  cpDTO.getrTerm2()); 
//				ps.setInt(4,  cpDTO.getrTerm3()); 
//				ps.setInt(5,  cpDTO.getrTerm4()); 
//				ps.setInt(6,  cpDTO.getoTerm1()); 
//				ps.setInt(7,  cpDTO.getoTerm2()); 
//				ps.setInt(8,  cpDTO.getoTerm3()); 
//				ps.setInt(9,  cpDTO.getoTerm4()); 
			
//				rs = ps.executeUpdate();
//				System.out.println("insert termcheck 삽입결과" + rs);
			
			//4. 결과 활용
//			if(rs.next()) {
//				todoDTO.setTodo_id(rs.getInt("todo_id"));
//				todoDTO.setDuedate(rs.getDate("duedate"));
//				todoDTO.setDone(rs.getInt("done"));
//				todoDTO.setContents(rs.getString("contents"));
//				todoDTO.setCtime(rs.getDate("Ctime"));
//			}
			
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
//				if (rs != 0) {
//					try {
//						rs.close();
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
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
	
	public int userDelete(CpDTO cpDTO) {
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
			String query = " delete termcheck ";
					query+= "where id =?";
		
			ps = conn.prepareStatement(query);
			
			ps.setString(1,  cpDTO.getId()); 
			rs = ps.executeUpdate();
			
			
			query = " delete userinfo "; 
		       query +=" where id =?"; 		       
		       ps = conn.prepareStatement(query);
		       ps.setString(1,  cpDTO.getId()); 
			rs = ps.executeUpdate();
			System.out.println("delete 삽입결과" + rs);
			
			
			
			//4. 결과 활용
//			if(rs.next()) {
//				todoDTO.setTodo_id(rs.getInt("todo_id"));
//				todoDTO.setDuedate(rs.getDate("duedate"));
//				todoDTO.setDone(rs.getInt("done"));
//				todoDTO.setContents(rs.getString("contents"));
//				todoDTO.setCtime(rs.getDate("Ctime"));
//			}
			
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
//				if (rs != 0) {
//					try {
//						rs.close();
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
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
