package sec03;

public class Car {

//	Car(){
//		System.out.println("Car constructor excution");
//	}
	
	//constructor 생략한 경우
	// 즉, 생성자가 하나도 없는 경우
	// 기본 생성자가 자동 완성된다
	// constructor가 있으면 기본 생성자는 안 만들어진다.
//	Car(){ } // 기본 생성자
	
//	String brand = "KIA";
	String brand;
//	Car(){
//		// 보통 생성자는
//		// 필드 값을 초기화하는데 많이 쓴다
//		brand = "KIA";
//	}
//	
//	Car(String b){
//		brand = b;
//	}
	
//	Car(){
//		int b = 6 / 0;
//	}
	
	String model;
	int maxSpeed;
	Car(String b, String m, int mx){
		brand = b;
		model = m;
		maxSpeed = mx;
	}
	// constructor도 mathod라 overloading 가능
	Car(){
//		brand = "현대";
//		model = "그랜저";
//		maxSpeed = 240;
//		
//		Car() // 안됨
		// 다른 오버로딩된 생성자 호출 : this()
		// 무조건 가장 먼저 실행되어야 한다
		this("현대", "그랜저", 240);
	}
	
	
}
