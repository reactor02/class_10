package quiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kakao extends OAuth {
	
	@Override
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
	@Override
	boolean login() {
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		String pw = scanner.nextLine();
		if(check(id, pw)) {
			System.out.println("카카오 로그인 성공");
			return true;
		} else{
			System.out.println("카카오 로그인 실패");
			return false;
		}
	}
}
