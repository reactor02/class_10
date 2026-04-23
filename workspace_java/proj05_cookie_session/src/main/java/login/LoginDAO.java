package login;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.EmpDTO;


public class LoginDAO {
	
	
	public EmpDTO getSelectMember(EmpDTO empDTO) {
		EmpDTO resultDTO = null;
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
			String query = "select * from emp ";
					query += " where empno=? and ename = ?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, empDTO.getEmpno())	;	
			ps.setString(2, empDTO.getEname())	;	
			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();
			
			
			// 결과 활용
			if (rs.next()) {
				resultDTO = new EmpDTO();
				resultDTO.setJob(rs.getString("job"));
				 
				
				
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
		
		return resultDTO;
	}
}
