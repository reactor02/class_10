package sec04.overloading;

public class Calc {
	
	int plus(int a, int b) {
		System.out.println("int int 실행");
		return a+b;
	}
	
	double plus (double a, double b) {
		System.out.println("double double 실행");
		return a+b;
	}
	// double double 같은 타입이라서 overloading 안됨
//	double plus (double x, double y) {
//		System.out.println("double double 실행");
//		return x+y;
//	}
	
	double plus (int a, double b) {
		System.out.println("int double 실행");
		return a+b;
	}
	
	int plus(int x) {
//		return x + x;
		return plus(x,x);
	}
	// 오늘 운동
	String type;
	int min;
	int set;
	
	void fitness(String t, int m, int s) {
		type = t;
		min = m;
		set = s;
	}
	void fitness(String t, int m) {
//		type = t;
//		min = m;
//		set = 5;
		fitness(t, m, 5);
	}
	void fitness(String t) {
		fitness(t, 3, 5);
	}
	
}
