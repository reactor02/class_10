package sec02;

public class CarExam {
	
	static int a = 10;

	public static void main(String[] args) {
		
		// Car 클래스를 생성해서 myCar 변수에 담아주세요
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		myCar.company = "쉐보레";
		System.out.println(myCar.company);
		
		System.out.println(myCar.speed);
		myCar.speed = 170;
		System.out.println(myCar.speed);
		
		Car mycar2 = new Car();
		System.out.println(mycar2.company);
		
		System.out.println("a: " + a);
	}

}
