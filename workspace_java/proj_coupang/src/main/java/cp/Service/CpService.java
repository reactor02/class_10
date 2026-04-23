package cp.Service;

import java.util.List;

import cp.DAO.CpDAO;
import cp.DTO.CpDTO;

public class CpService {
	public int join(CpDTO cpDTO) {
		
		CpDAO cpDAO = new CpDAO();
		int a = cpDAO.joinUpdate(cpDTO);
		
		return a;
	}
	
	public List<CpDTO> userSelectAll(){
		CpDAO cpDAO = new CpDAO();
		
		return cpDAO.selectAll();
	}
	
	public CpDTO selectOne(String id) {
		CpDAO cpDAO = new CpDAO();
		return cpDAO.selectOne(id);
	}
	
	public int userUpdate(CpDTO cpdto) {
		CpDAO cpDAO = new CpDAO();
		int a = cpDAO.userUpdate(cpdto);
		return a;
	}
	public int userDelete(CpDTO cpDTO) {
		CpDAO cpDAO = new CpDAO();
		int a = cpDAO.userDelete(cpDTO);
		return a;
	}
}
