package kr.or.human3;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuizController {
	
	@GetMapping(value = "quiz/cafe.do")
	public String cafe() {
		return "coffe";
	}
	@RequestMapping(value = "quiz/cafe", method=RequestMethod.POST)
	public ModelAndView order(
			HttpServletRequest req, 
			HttpServletResponse res,
			Model model,
			String menu, int count) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		System.out.println("quiz/cafe 실행");
		
		int price = -1;
		
		if("americano".equals(menu)) {
			price=2000;
		}else if("cider".equals(menu)) {price=3000;
		}else if("latte".equals(menu)) {price=3001;
		}else if("peppermint".equals(menu)) {price=6000;
		}		
//		switch(menu) {
//		case "아메리카노":
//			break;
//		case "얼박사":
//			break;
//		case "라떼":
//			break;
//		case "페퍼민트":
//			break;
//		}
		req.setAttribute("menu", menu);
		model.addAttribute("price", price);
		ModelAndView mav = new ModelAndView();
		mav.addObject("count", count);
		return mav;
		
	}
	
	@RequestMapping(value = "quiz/cafe2", method=RequestMethod.POST)
	@ResponseBody
	public String order2(HttpServletRequest req, HttpServletResponse res,Model model,
			@RequestBody Map map) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		System.out.println("quiz/cafe 실행");
		
		String menu = (String)map.get("menu");
		int count = Integer.parseInt((String)map.get("count"));
		
		int price = -1;
		if("americano".equals(menu)) {
			price=2000;
		}else if("cider".equals(menu)) {price=3000;
		}else if("latte".equals(menu)) {price=3001;
		}else if("peppermint".equals(menu)) {price=6000;
		}		
		////////////////////////
		Map resultMap = new HashMap();
		resultMap.put("menu", menu);
		resultMap.put("count", count );
		resultMap.put("price", price);
		
		return "";
		
	}
	
	@RequestMapping(value = "quiz/cafe3", method= {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public String order3(HttpServletRequest req, HttpServletResponse res,Model model,
//			@RequestParam Map map
			@ModelAttribute
			QuizCafeDTO dto
			) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		System.out.println("quiz/cafe 실행");
		System.out.println("dto" + dto);
		
		
		return "cafe";
		
	}
	
	@RequestMapping(value = "quiz/cafe4", method= {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public String order4(HttpServletRequest req, HttpServletResponse res,Model model,
//			@RequestParam Map map
			@RequestBody
//			List<Map> list
			List<QuizCafeDTO> dto
			) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		System.out.println("quiz/cafe 실행");
		System.out.println("dto" + dto);
		
		
		return "cafe";
		
	}
	
}
