package sec01.quiz;

public class Login {
	private String id;
	private String password;
	
	Login(String id, String password){
		
		if(id == null) {
			this.id = "아이디 없음";
		} else {
			this.id = id;
		}
		if(id == null) {
			this.password = "비밀번호 없음";
		} else {
			this.password = password;
		}
			
	}
	
	void login(String id, String pw){
		System.out.println("실행됨");
		if(this.loginCheck(id, pw)) {
			System.out.println("로그인 성공");
		} else if(!(this.loginCheck(id, pw))) {
			System.out.println("로그인 실패");
		} 
	}
	
	
	boolean loginCheck(String id, String pw) {
		if(this.id.equals(id) && this.password.equals(pw)) {
			return true;
		} else {
			return false;
		
		}
	}
}
