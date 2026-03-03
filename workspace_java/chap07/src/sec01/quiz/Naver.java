package sec01.quiz;

public class Naver extends Login {
	
	Naver(String id, String pw){
		super(id, pw);
	}
	
	@Override
	void login(String id, String pw){
		if(loginCheck(id, pw)) {
			System.out.println("네이버 로그인 성공");
		} else if(!(loginCheck(id, pw)) ) {
			System.out.println("네이버 로그인 실패");
		}
	}

}
