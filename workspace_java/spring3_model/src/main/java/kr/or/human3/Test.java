package kr.or.human3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	
	@RequestMapping("/result")
	@ResponseBody
	public Map<String, Object> gogo(
			@RequestBody TestDTO dto		
	) {
		double total = dto.getEng() +dto.getKor() + dto.getMath();
		double avg = total/3;
		String name = dto.getName();
		String grade;
		if (avg >= 90) grade = "A";
		else if (avg >= 80) grade = "B";
		else if (avg >= 70) grade = "C";
		else if (avg >= 60) grade = "D";
		else grade = "F";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("total", total);
		map.put("avg", avg);
		map.put("grade", grade);
		return map;
	}
	
}
