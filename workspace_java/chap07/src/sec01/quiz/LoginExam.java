package sec01.quiz;

public class LoginExam {
	public static void main(String[] args) {
		Daum daum = new Daum("ww", "55");
		daum.login("ww", "55"); 
		daum.login("w4", "45"); 
		
		Naver naver = new Naver("23", "as");
		naver.login("23", "as");
		naver.login("11", "as");
	}
	
	
	
	
	
}
