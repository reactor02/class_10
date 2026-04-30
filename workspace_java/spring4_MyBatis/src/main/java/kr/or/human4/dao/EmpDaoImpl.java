package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human4.dto.EmpDTO;


@Repository
public class EmpDaoImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectAllEmp() {
		List<EmpDTO> resultList = null;
		
		resultList = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("dao : resultList" +resultList );
		
		return resultList;
	}
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO empDTO = null;
		
		empDTO = sqlSession.selectOne("mapper.emp.selectOneEmp");
				System.out.println("dao : empDTO" +empDTO );

		return empDTO;
	}
	@Override
	public Map selectOneEmpMap() {
		Map map = null;
		
		map = sqlSession.selectOne("mapper.emp.selectOneEmpMap");
		System.out.println("dao : map" +map );
		
		return map;
	}
	@Override
	public EmpDTO selectEmpno(int empno) {
		EmpDTO empDTO = null;
		
		empDTO = sqlSession.selectOne("mapper.emp.selectEmpno", empno);
		System.out.println("dao : empDTO" +empDTO );
		
		return empDTO;
	}
	
	@Override
	public List<EmpDTO> selectEname(String ename) {
		List<EmpDTO> list = null;
		
		list = sqlSession.selectList("mapper.emp.selectEname", ename);
		System.out.println("dao : empDTO" +list );
		
		return list;
	}
	
	@Override
	public List<EmpDTO> selectJob(String ename) {
		List<EmpDTO> list = null;
		
		list = sqlSession.selectList("mapper.emp.selectJob", ename);
		System.out.println("dao : empDTO" +list );
		
		return list;
	}
	
	@Override
	public List<EmpDTO> selectJobEname(EmpDTO empdto) {
		List<EmpDTO> list = null;
		
		list = sqlSession.selectList("mapper.emp.selectJobEname", empdto);
		System.out.println("dao : empDTO" +list );
		
		return list;
	}
	
	@Override
	public int insertEmp2(EmpDTO empdto) {
		int result = -1;
		
		result = sqlSession.insert("mapper.emp.insertEmp2", empdto );
		System.out.println("insertEmp2 : empDTO" +result );
		
		return result;
	}
	
	@Override
	public int updateEmp2(EmpDTO empdto) {
		int result = -1;
		result = sqlSession.update("mapper.emp.updateEmp2", empdto );
		
		return result;
	}
	
	@Override	
	public int deleteEmp2(int empno) {
		int result = -1;
		result = sqlSession.delete("mapper.emp.deleteEmp2", empno );
		
		return result= -1;
	}
	
	// dept와 emp 정보를 받아서 
	// 1. seq_dept를 확보하고
	// 2. dept insert하고
	// 4. emp insert하기
	public int insertDeptEmp(EmpDTO dto) {
		int result = 0;
		
		///////////////////// selectKey등으로 사라지는 구역
		// insert 하기 전에 seq_dept2 확보하기
		int seq_dept2 = sqlSession.selectOne("mapper.emp.getSeqDept2");
		
		System.out.println("seq_dept2: " + seq_dept2);
		
		//dto에 저장하기
		dto.setDeptno(seq_dept2);
		/////////////////////
		
		// insert에 직접 넣기
		result += sqlSession.insert("mapper.emp.insertDept2, dto");
		result += sqlSession.insert("mapper.emp.insertEmp2, dto");
		
		return result;
	}
	
	@Override
	public List<EmpDTO> search(EmpDTO dto) {
		List<EmpDTO> resultList = null;
		
//		resultList = sqlSession.selectList("mapper.emp.dynamic.selectEmp2", dto);
		resultList = sqlSession.selectList("mapper.emp.dynamic.select2Emp2", dto);
		System.out.println("dao : resultList" +resultList );
		
		return resultList;
	}
	
	@Override
	public List<EmpDTO> choice(EmpDTO dto) {
		List<EmpDTO> resultList = null;
		
//		resultList = sqlSession.selectList("mapper.emp.dynamic.selectEmp2", dto);
		resultList = sqlSession.selectList("mapper.emp.dynamic.foreach", dto);
		System.out.println("dao : resultList" +resultList );
		
		return resultList;
	}

	
	
}
