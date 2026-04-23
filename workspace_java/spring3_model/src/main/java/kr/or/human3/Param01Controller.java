package kr.or.human3;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Param01Controller {
	@RequestMapping("/join.do")
//	public void joinForm(HttpServletRequest request, HttpServletResponse response) {
		public void joinForm(HttpServletRequest request, HttpServletResponse response) {
		// jsp로 포워드
		System.out.println("메소드 실행");
		// 들어왔다
		////////////////////////////
		// 404: 나가지 못했다
		try {
//			request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response);
			request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("join2.do")
	public ModelAndView joinForm2() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("join");
		
		return mav;
		
	}
	
	@RequestMapping("join3.do")
	public ModelAndView joinForm3() {
		
		ModelAndView mav = new ModelAndView("join");
		
		
		return mav;
		
	}
	
	@RequestMapping("join4.do")
	public String joinForm4() {
		
		return "join";
		
	}
	
	// 주소와 jsp명이 같을 때
	@RequestMapping("/join")
	public void joinForm5() {
		System.out.println("/join5실행");
		
	}
	//sendRedirect
	@RequestMapping("join6.do")
	public String joinForm6() {
		
		return "redirect:join.do";
		
	}
	
	@RequestMapping("join7.do")
	public String joinForm7() {
		
		return "forward:join.do";
		
	}
	
	@RequestMapping("join1")
	public void join1(HttpServletRequest request) {
		
		String id =request.getParameter("id");
		System.out.println("id : " + id);	
	}
	
	// @RequestParam
	
	@RequestMapping("/join2")
	public String join2(
			// String id =request.getParameter("id");
			// 위와 동일
			// 기본적으로 필수값, 그래서 없으면 400 bad Request 코드 발생
			// required = true가 기본값
			@RequestParam("id") String id,
			
			@RequestParam(value = "email", required =false)
			String email,
			
			@RequestParam(value = "pw", required =true)
			String pw,
			// required = false
			//@RequestParam(value = "tel", required =false)
			// 파라메터 key와 변수명이 같다면 @RequestParam 생략 가능
			// required=false에 주의
			// 그래서 없으면 null
			String tel,
			String a, String b, 
			// int는 null이 안되서  500 에러
			int age
//			Integer age
	) {
		System.out.println("/join2 실행");
		System.out.println("join2 id :" + id);
		System.out.println("email :" + email);
		System.out.println("pw :" + pw);
		System.out.println("tel :" + tel);
		System.out.println("age : " + age);
		
		return "join";
	}
	
	@RequestMapping("/join3")
//	public String join3(String id, String pw, String tel) {
	public String join3(
		// 전달인자를 key, value로 정리합니다
		@RequestParam
		Map map
		
		//@RequestParam에 DTO는 안된다
//		@RequestParam
//		MemberDTO memberDTO
			
	) {
		
		System.out.println("map : " + map);
//		System.out.println("memberDTO : " + memberDTO);
		
		return "join";
	}
	
	
	@RequestMapping("/join4")
//	public String join3(String id, String pw, String tel) {
	public String join4(
		
		@ModelAttribute
		MemberDTO memberDTO
			
	) {
		System.out.println( memberDTO);
		
		return "join";
	}
	
	@RequestMapping("/signup1")
	public ModelAndView signup1(
			HttpServletRequest request, 
			String id
	) {
		ModelAndView mav = new ModelAndView("result");
		
		request.setAttribute("id", id);
		
		return mav;
	}
	
	
	@RequestMapping("/signup2")
	public ModelAndView signup2(
			HttpServletRequest request, 
			String id
	) {
		ModelAndView mav = new ModelAndView("result");
		System.out.println("/signup2 : 실행");
//		request.setAttribute("id", id);
		mav.addObject("id", id);
		
		return mav;
	}
	
	@RequestMapping("/signup3")
	public ModelAndView signup3(
			// parameter에서 꺼내서 
			// DTO의 setter를 이용하여 자동으로 넣어줌
			@ModelAttribute
			MemberDTO dto1,
			
			// 심지어 다음줄의 코드까지 해줌
			// mav.addObject("memberDTO3", dto2);
			@ModelAttribute("MemberDTO3")
			MemberDTO dto2,
			
			// ModelAttribute 생략 가능
			// 생략하면 타입(클래스) 앞글자를 소문자로 한 key로
			// 모델에 넣어줌
//			@ModelAttribute("memberDTO3")
			MemberDTO dto3
	) {
		ModelAndView mav = new ModelAndView("result");
		System.out.println("/signup3 : 실행");
		System.out.println("dto1 : " + dto1);

		
		mav.addObject("dto1", dto1);
//		mav.addObject("memberDTO3", dto2);
		
		return mav;
	}
	
	@RequestMapping("/signup4")
	public ModelAndView signup4(MemberDTO dto1, String id) {
		System.out.println("/signup4 : 실행");
		
		System.out.println(dto1);
		System.out.println(id);
		
		ModelAndView mav = new ModelAndView("result");
		
		
		mav.addObject("dto1", dto1);
//		mav.addObject("memberDTO3", dto2);
		
		return mav;
	}
	
	
}
