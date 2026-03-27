package empService;

import java.util.List;

import empDAO.EmpDAO;

public class EmpService {
	
	public List selectAll() {
		EmpDAO empDAO= new EmpDAO();
		List aa = empDAO.selectAll();
		return aa;
	}
}
