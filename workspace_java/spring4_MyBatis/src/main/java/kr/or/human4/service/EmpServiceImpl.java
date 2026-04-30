package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human4.dao.EmpDAO;
import kr.or.human4.dto.EmpDTO;


@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	

	
	@Override
	public List<EmpDTO> getEmpList() {
		List<EmpDTO> result = empDAO.selectAllEmp();
		return result;
	}
	
	@Override
	public EmpDTO getEmpOne() {
		EmpDTO result = empDAO.selectOneEmp();
		return result;
	}
	
	@Override
	public Map getEmpOneMap() {
		Map result = empDAO.selectOneEmpMap();
		return result;
	}
	
	@Override
	public EmpDTO getEmpno(int empno) {
		EmpDTO result = empDAO.selectEmpno(empno);
		return result;
	}
	
	@Override
	public List getEname(String ename) {
		
		return empDAO.selectEname(ename);
	}
	
	@Override
	public List getJob(String job) {
		
		return empDAO.selectJob(job);
	}
	
	@Override
	public List getJobEname(EmpDTO empdto) {
		
		return empDAO.selectJobEname(empdto);
	}
	@Override
	public int insertEmp2(EmpDTO empdto) {
		
		return empDAO.insertEmp2(empdto);
	}
	
	@Override
	public int updateEmp2(EmpDTO empdto) {
		return empDAO.updateEmp2(empdto);
	}
	
	@Override
	public int deleteEmp2(int empno) {
		return empDAO.deleteEmp2(empno);
	}
	
	@Override
	public List<EmpDTO> search(EmpDTO empdto) {
		return empDAO.search(empdto);
	}
	@Override
	public List<EmpDTO> choice(EmpDTO empdto) {
		return empDAO.choice(empdto);
	}
	
}
