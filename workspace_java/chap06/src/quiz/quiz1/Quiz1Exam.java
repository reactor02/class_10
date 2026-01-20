package quiz.quiz1;

public class Quiz1Exam {

	public static void main(String[] args) {
		
		Quiz1 sing1 = new Quiz1("Good GoodBye", "화사", "Good Goodbye", "가사1", 30);
		Quiz1 sing2 = new Quiz1("사랑하게 될 거야", "한로로", "이상비행", "가사2", 60);
		
		sing1.information();
		sing2.information();
		
//		String [][] a = new String[2][5];
//		for(int i = 0; i<sing1.array().length; i++) {
//			a[0][i] = sing1.array()[i]; 
//		}
//		for(int i = 0; i<sing2.array().length; i++) {
//			a[1][i] = sing2.array()[i]; 
//		}
//		
//		for (int i = 0; i<a.length; i++) {
//			for (int j = 0; j<a[i].length; j++) {
//				System.out.println(i + ","+ j + ","+ a[i][j]);
//			}
//		}
		
	}

}
