package sec03._abstract;
// abstract final class 같이 못씀
public abstract class Animal {
	
	
	
	void breathe() {
		System.out.println("숨쉬어 숨쉬어");
	}
	
//	abstract void sound() {} 실행블록 있으면 안됨
	//	추상메소드
	// 실행블럭이 있으면 안됨
	// 나는 구현하지 않고 자식에게 구현을 떠넘김
	abstract void sound();
	
	String kind;
	Animal(){
		System.out.println("Animal 생성자 실행");
	}
	
	
}
