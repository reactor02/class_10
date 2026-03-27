package cp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import cp.DTO.CpDTO;

public class CpDAO {
	public int join(CpDTO cpDTO) {
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
			String query = " insert into userinfo values "; 
			       query +=" ( )" ;
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, .getTodo_id()); 
			//3. 실행 밑 결과 확보
			rs = ps.executeUpdate();
			System.out.println("insert 삽입결과" + rs);
			
			
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
