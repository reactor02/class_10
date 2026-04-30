package kr.or.human3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Coffee55Exam {
	
	static int a1 = 3000;
	static int a2 = 4000;
	static int a3 = 5000;
	
	static int b1 = 6100;
	static int b2 = 7400;
	static int b3 = 8300;

	
	Coffee55Exam(){
		List list = new ArrayList();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
	}
	
	@RequestMapping("/coffee")
	public void coffee() {
		
	}
	
	@RequestMapping("/aa")
	public ModelAndView ajax(
			
			
			@RequestParam
			Map map
			
//			String coffeeSelect1,
//			String number1,
//			String coffeeSelect2,
//			String number2
			
			) {
		
		if(map.get("price1") !=null || map.get("price2" ) !=null) {
			map.remove("price1");
			map.remove("price2");
		}
		
		
		ModelAndView mav = new ModelAndView("/coffee");

		
		
		if(map.get("coffeeSelect1").equals("a1") ) {
			map.put("price1", this.a1);
		}else if((map.get("coffeeSelect1").equals("a2"))) {
			map.put("price1", this.a2);
		}else if((map.get("coffeeSelect1").equals("a3"))) {
			map.put("price1", this.a3);
		}
		
		if(map.get("coffeeSelect2").equals("b1") ) {
			map.put("price2", this.b1);
		}else if((map.get("coffeeSelect2").equals("b2"))) {
			map.put("price2", this.b2);
		}else if((map.get("coffeeSelect2").equals("b3"))) {
			map.put("price2", this.b3);
		}
		
		
		System.out.println("tt : "+ map.get("price1"));
		mav.addObject("map",map);
		
		
		
		return mav;
	}
	
	
	@RequestMapping("/aa23")
	@ResponseBody
	public Map ajax2(
			
			
			@RequestParam
			Map map) {
			

		
		return map;
	}
	
	
}
