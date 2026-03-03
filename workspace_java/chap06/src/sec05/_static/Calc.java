package sec05._static;

import java.util.Scanner;

public class Calc {
	
	String color;
	
	static double pi = 3.14;
	
	int max_int = Integer.MAX_VALUE;
	
	static int price;
	
	{
		System.out.println("필드에 있는 실행블럭");
	}
	static {
		System.out.println("필드에 있는 static 실행블럭");
//		Scanner s = new Scanner(System.in);
//		price = s.nextInt() +10;
	}
	
	
	Calc(){
		System.out.println("Calc 생성자 실행");
		
		this.price = 10;
		Calc.price = 10;
	}
	
	static void test() {
//		this.color = 10;
		System.out.println("잘 된다");
	}
	
}
