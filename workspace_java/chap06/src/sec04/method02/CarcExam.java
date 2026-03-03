package sec04.method02;

public class CarcExam {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		calc.powerOn();
		int a = calc.plus(5, 7);
		System.out.println(a);
		
		// 호출할 때 이름과 전달 인자를 꼭 맞춰야 실행된다.
//		calc.plus();
		
		int i = 4;
		a = calc.plus(i, 8);
		double b = calc.divide(7, 0);
		System.out.println(b);
		
	}

}
