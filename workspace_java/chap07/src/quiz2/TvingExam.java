package quiz2;

public class TvingExam {
	
	public static void main(String[] args) {
		Tving tving= new Tving();
		Naver naver = new Naver();
		Kakao kakao = new Kakao();
		
		naver.signOut("33", "dk");
		naver.signOut("33", "dk");
		naver.signOut("32", "d2");
		
		tving.TvingLogin(naver);
		
		
	}
	
}
