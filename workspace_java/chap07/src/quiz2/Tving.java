package quiz2;

public class Tving {
	
	void TvingLogin(OAuth aa) {
		if(aa.login()) {
			System.out.println("Tving 메인 페이지 표시");
		} else {
			System.out.println("로그인 실패. 로그인 페이지로 이동중");
		}
	}
}
