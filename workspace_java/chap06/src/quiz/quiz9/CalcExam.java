package quiz.quiz9;

public class CalcExam {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		System.out.println(calc.operation(4, "+" ,3));
		System.out.println(calc.operation(4, "-" ,3));
		System.out.println(calc.operation(4, "*" ,3));
		System.out.println(calc.operation(4, "/" ,3));
		calc.logcheck();                         
	}
}
