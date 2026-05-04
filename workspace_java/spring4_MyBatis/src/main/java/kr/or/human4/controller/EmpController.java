package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EmpController {
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/gogo")
	public String gogo() {
		System.out.println("/gogo 실행");	
		return "empgogo";
	}
	
	@RequestMapping("/list")
	public String list (Model model) {
		System.out.println("/list 실행");
		
		List<EmpDTO> list = empService.getEmpList();
		System.out.println(list);
		model.addAttribute("list",list);
		
		return "emp";
	}
	
	@RequestMapping("/one")
	public String one(Model model) {
		System.out.println("/one 실행");
		EmpDTO dto = empService.getEmpOne();
		
		model.addAttribute("dto", dto);
		
		return "emp";
	}
	
	@RequestMapping("/onemap")
	public String oneMap(Model model) {
		System.out.println("/onemap 실행");
		Map map = empService.getEmpOneMap();
		
		model.addAttribute("map", map);
		
		
		return "emp";
	}
	
	@RequestMapping("/one2")
	@ResponseBody
	public EmpDTO one2() {
		System.out.println("/one 실행");
		EmpDTO dto = empService.getEmpOne();

		return dto;
	}
	
	@RequestMapping("/getEmpno")
	public String getEmpno(Model model,@RequestParam int empno) {
		
		EmpDTO empDTO = empService.getEmpno(empno);
		
		
		model.addAttribute("empno", empno);
		model.addAttribute("empDTO", empDTO);

		return "result";
	}
	
	
//	 boolean isDebug =false;
	int debugLevel = 1;
	
	@RequestMapping("/getEname")
	public String getEname(Model model,@RequestParam String ename) {
		
		List list = empService.getEname(ename);
		
//		if(isDebug) {
//			System.out.println(ename);
//		}
		if(debugLevel > 3) {
			System.out.println(ename);
		}
		
		logger.info("getEname");
		logger.warn("warn: ename:"+ ename);
		logger.error("error: ename:"+ ename);
		
		
		model.addAttribute("ename", ename);
		model.addAttribute("list", list);

		return "result";
	}
	
	@RequestMapping("/getJob")
	public String getJob(Model model,@RequestParam String job) {
		
		List list = empService.getJob(job);
		
		
		logger.info("getEname");
		logger.warn("warn: ename:"+ job);
		logger.error("error: ename:"+ job);
		
		
		model.addAttribute("job", job);
		model.addAttribute("list1", list);

		return "result";
	}
	
	@RequestMapping("/getJobEname")
	public String getJobEname(Model model,@ModelAttribute("empdto") EmpDTO empdto) {
		
	
		
		List list = empService.getJobEname(empdto);
		
		
		
		model.addAttribute("list2", list);

		return "result";
	}
	
	
	@RequestMapping("/join.do")
	public String join() {
		return "join";
	}
	
	
	
	@RequestMapping("/joinEmp2")
	public String joinEmp2(Model model,@ModelAttribute("empdto") EmpDTO empdto) {
		System.out.println(empdto);
		
		logger.info("empDTO : "+ empdto);
		int a = empService.insertEmp2(empdto);
		
		if(a <1) {
			model.addAttribute("msg", "가입 안됨");
		}
		
		List list; 
		
		model.addAttribute(empdto);

		return "redirect: list";
	}
	
	@RequestMapping("/updateEmp2")
	public String updateEmp2(Model model,@ModelAttribute EmpDTO empdto) {
		System.out.println(empdto);
		
		logger.info("empDTO : "+ empdto);
		int a = empService.updateEmp2(empdto);
		
		if(a <1) {
			model.addAttribute("msg", "수정 안됨");
		}
		
		 
		
		model.addAttribute(empdto);

		return "redirect: detail";
	}
	
	@RequestMapping("/deleteEmp2")
	public String deleteEmp2(Model model,@RequestParam int empno) {
		System.out.println(empno);
		
		logger.info("empno : "+ empno);
		int a = empService.deleteEmp2(empno);
		
		if(a <1) {
			model.addAttribute("msg", "삭제 안됨");
		}
		
		 
		
		

		return "redirect: list";
	}
	
	@RequestMapping("/detail")
public String detail(Model model,int empno) {
		
		EmpDTO empDTO = empService.getEmpno(empno);
		
		
		
		model.addAttribute("empDTO", empDTO);
		
		return "detail";
	}
	
	@RequestMapping("/update")
	public String update(Model model) {
		System.out.println("/one 실행");
		EmpDTO dto = empService.getEmpOne();
		
		model.addAttribute("dto", dto);
		
		return "update";
	}
	
	
	
	
	
	@RequestMapping("/search")
	public String search (Model model, EmpDTO empDTO) {
		System.out.println("/search 실행");
		model.addAttribute("EmpDTO", empDTO);
		List<EmpDTO> list = empService.search(empDTO);
		System.out.println(list);
		model.addAttribute("list",list);
		
		return "emp";
	}
	
	@RequestMapping("/choice")
	public String choice (Model model, EmpDTO empDTO) {
		System.out.println("/choice 실행");
		System.out.println("empDTO" + empDTO);
		model.addAttribute("EmpDTO", empDTO);
		List<EmpDTO> list = empService.choice(empDTO);
		System.out.println(list);
		model.addAttribute("list",list);
		
		return "emp";
	}


	@RequestMapping("/mapper")
	public String mapper(Model model) {
		List<EmpDTO> list = empService.selectMapper();
		
		model.addAttribute("list", list);
		return "emp";
		
	}
}







