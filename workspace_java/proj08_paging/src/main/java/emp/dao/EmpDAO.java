package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.dto.EmpDTO;

public class EmpDAO {

	private Connection getConn() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();

			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			conn = dataFactory.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		return conn;

	}
	public List selectOneEmp() {

		List<EmpDTO> list = new ArrayList();

		try (Connection conn = getConn(); PreparedStatement ps = conn.prepareStatement("select * from emp where id=?");) {
			ps.setInt(1, 7788);
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					EmpDTO empdto = new EmpDTO();
					empdto.setEmpno(rs.getInt("empno"));
					System.out.println(empdto.getEmpno());
					
					empdto.setEname(rs.getString("ename"));
					empdto.setJob(rs.getString("job"));
					empdto.setMgr(rs.getInt("mgr"));
					empdto.setHireDate(rs.getDate("hiredate"));
					empdto.setSal(rs.getInt("sal"));
					empdto.setComm(rs.getInt("comm"));
					empdto.setDeptNO(rs.getInt("deptno"));

					list.add(empdto);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("DAO의 list.size() :" +list.size());
		return list;
	}

	public int selectTotal(EmpDTO empDTO) {

		List<EmpDTO> list = new ArrayList();
		int totalCount = 0;
		try (Connection conn = getConn(); 
//		PreparedStatement ps = conn.prepareStatement(" SELECT * from(SELECT rownum AS rnum,e.* from( SELECT emp.* FROM emp"
//				+ " ORDER BY HIREDATE ) e) e "
//				+ " WHERE rnum BETWEEN ? AND ? ");
				
				PreparedStatement ps = new LoggableStatement(conn, "SELECT count(*) cnt FROM emp ")
				) {
			
			
			System.out.println(((LoggableStatement)ps).getQueryString());
			
			try (ResultSet rs = ps.executeQuery();) {
				if (rs.next()) {
					EmpDTO empdto = new EmpDTO();
					totalCount = rs.getInt("cnt"); 
					

					

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("DAO의 list.size() :" +list.size());
		return totalCount;
	}
	
	public List selectAllEmp(EmpDTO empDTO) {

		List<EmpDTO> list = new ArrayList();

		try (Connection conn = getConn(); 
//		PreparedStatement ps = conn.prepareStatement(" SELECT * from(SELECT rownum AS rnum,e.* from( SELECT emp.* FROM emp"
//				+ " ORDER BY HIREDATE ) e) e "
//				+ " WHERE rnum BETWEEN ? AND ? ");
				
				PreparedStatement ps = new LoggableStatement(conn, " SELECT * from(SELECT rownum AS rnum,e.* from( SELECT emp.* FROM emp"
						+ " ORDER BY HIREDATE ) e) e "
						+ " WHERE rnum BETWEEN ? AND ? ")
				) {
			ps.setInt(1, empDTO.getStart());
			ps.setInt(2, empDTO.getEnd());
			
			System.out.println(((LoggableStatement)ps).getQueryString());
			
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					EmpDTO empdto = new EmpDTO();
					empdto.setEmpno(rs.getInt("empno"));
					System.out.println(empdto.getEmpno());
					
					empdto.setEname(rs.getString("ename"));
					empdto.setJob(rs.getString("job"));
					empdto.setMgr(rs.getInt("mgr"));
					empdto.setHireDate(rs.getDate("hiredate"));
					empdto.setSal(rs.getInt("sal"));
					empdto.setComm(rs.getInt("comm"));
					empdto.setDeptNO(rs.getInt("deptno"));

					list.add(empdto);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("DAO의 list.size() :" +list.size());
		return list;
	}
	
}
