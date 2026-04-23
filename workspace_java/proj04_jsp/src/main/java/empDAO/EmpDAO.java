package empDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import empDTO.EmpDTO;

public class EmpDAO {
	public List select() {
		List list = new ArrayList();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			Context ctx = new InitialContext();
			
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			conn = dataFactory.getConnection();
			
			String query = "select * from emp";
			ps = conn.prepareStatement(query);

			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				EmpDTO empdto =new EmpDTO();
				empdto.setEmpno(rs.getInt("empno"));
				empdto.setEname(rs.getString("ename"));
				empdto.setJob(rs.getString("job"));
				empdto.setMgr(rs.getInt("mgr"));
				empdto.setHireDate(rs.getDate("hiredate"));
				empdto.setSal(rs.getInt("sal"));
				empdto.setComm(rs.getInt("comm"));
				empdto.setDeptNO(rs.getInt("deptno"));
				
				list.add(empdto);
				
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

	public List selectAll() {
		List list = new ArrayList();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			Context ctx = new InitialContext();
			
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			conn = dataFactory.getConnection();
			
			String query = "select * from emp";
			ps = conn.prepareStatement(query);

			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				EmpDTO empdto =new EmpDTO();
				empdto.setEmpno(rs.getInt("empno"));
				empdto.setEname(rs.getString("ename"));
				empdto.setJob(rs.getString("job"));
				empdto.setMgr(rs.getInt("mgr"));
				empdto.setHireDate(rs.getDate("hiredate"));
				empdto.setSal(rs.getInt("sal"));
				empdto.setComm(rs.getInt("comm"));
				empdto.setDeptNO(rs.getInt("deptno"));
				
				list.add(empdto);
				
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

}
