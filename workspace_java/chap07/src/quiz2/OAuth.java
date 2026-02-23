package quiz2;

import java.util.Scanner;

public class OAuth {
	String id;
	String pw;
	
	
	// 회원가입
	boolean signOut(String id, String pw) {
		if(id == null || pw == null) {
			System.out.println("잘못된 아이디 또는 비밀번호입니다");
			return false;
		} else {
			if(!(this.id == null && this.pw == null)) {
				if(!this.id.equals(id)) {
					this.id = id;
				} else {
					return false;
				}
				
				this.pw = pw;
				System.out.println("회원가입 완료");
				return true;
			} else {return false;}
			
		}
		
	}
	
	//회원 체크
	boolean check(String id, String pw) {	
			return this.id.equals(id) && this.pw.equals(pw);
		
	}
	
	// 로그인
	boolean login() {
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		String pw = scanner.nextLine();
		return check(id, pw);
	}
	
}
