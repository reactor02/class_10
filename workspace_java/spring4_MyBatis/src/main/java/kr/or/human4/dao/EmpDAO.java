package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpDAO {
	
	
	public List<EmpDTO> selectAllEmp() ;
	public EmpDTO selectOneEmp();
	public Map selectOneEmpMap();
	public EmpDTO selectEmpno(int empno);
	public List selectEname(String ename);
	public List selectJob(String job);
	public List selectJobEname(EmpDTO empdto);
	public int insertEmp2(EmpDTO empdto);
	public int updateEmp2(EmpDTO empdto);

	public int deleteEmp2(int empno);
	public List<EmpDTO> search(EmpDTO empdto);
	public List<EmpDTO> choice(EmpDTO empdto);
}
