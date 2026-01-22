package quiz.quiz11;

import java.util.ArrayList;
import java.util.List;

public class LoginExam {
	public static void main(String[] args) {
		Join[] join = new Join[2];
		
		join[0] = new Join("kkk", "kkk");
		join[1] = new Join ("jjj", "jjj");
		
		ArrayList test1 = new ArrayList(join.length);
		test1.add(join[0].id);
		test1.add(join[1].id);
		
		ArrayList test2 = new ArrayList(join.length);
		test2.add(join[0].password);
		test2.add(join[1].password);
		
		
		
		
		
		
	}
}
