package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpService {
	
	public List<EmpDTO> getEmpList();
	
	public EmpDTO getEmpOne() ;
	public Map getEmpOneMap() ;
	public EmpDTO getEmpno(int empno);
	public List getEname(String ename);
	public List getJob(String job);
	public List getJobEname(EmpDTO empdto);
	public int insertEmp2(EmpDTO empdto);
	public int updateEmp2(EmpDTO empdto);
	public int deleteEmp2(int empno);
	public List<EmpDTO> search(EmpDTO empdto);
	public List<EmpDTO> choice(EmpDTO empdto);
}
