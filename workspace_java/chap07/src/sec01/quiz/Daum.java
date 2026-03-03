package sec01.quiz;

public class Daum extends Login {
	
	Daum(String id, String pw){
		super(id, pw);
	}

	
	@Override
	void login(String id, String pw){
		if(loginCheck(id, pw)) {
			System.out.println("다음 로그인 성공");
		} else if(!(loginCheck(id, pw))) {
			System.out.println("다음 로그인 실패");
		}
	}
}
