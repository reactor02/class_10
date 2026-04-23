package emp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpService {
	EmpDAO empDAO = new EmpDAO();
	
	public Map getListEmp(EmpDTO empDTO) {
		
		int size = empDTO.getSize();
		int page = empDTO.getPage();
		
		int start =0, end= 0;
		
		end= page * size;
		start= end -(size -1);
		
		empDTO.setSize(size);
		empDTO.setPage(page);
		empDTO.setStart(start);
		empDTO.setEnd(end);
		
		
		List list = empDAO.selectAllEmp(empDTO);
		int totalCount = empDAO.selectTotal(empDTO);
		
		Map map =new HashMap();
		map.put("list", list);
		map.put("totalCount", totalCount);
		
		return map;
	}
}
