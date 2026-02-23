package sec01.override;

public class Exam {
	public static void main(String[] args) {
		Calc calc=	new Calc();
		System.out.println(calc.areaCircle(10));
			
			
		Computer com = new Computer();
		double a = com.areaCircle(10);
		System.out.println(a);
		
		System.out.println(com.plus(1, 2));
	}
			
}
