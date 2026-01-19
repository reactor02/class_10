package sec04._return03;

public class Calc {

	// 두 int를 받아서 
	// 더한 결과를 int로 돌려주는 method
	int plus (int a, int b) {
		return a+b;
	}
	
	// 두 int를 받아서 
	// 평균을 double을 돌려주는 method
	double avg(int x, int y) {
//		int sum = x + y;
		int sum = plus(x,y);
		double result = (double) sum/2;
		return result;
	}
	
	void execute(int j1, int j2) {
		double result = avg (j1, j2);
		System.out.print(j1+","+j2+" 실행결과: " + result);
	}
}
