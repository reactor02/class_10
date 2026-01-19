package sec04.method02;

public class Calc {
	//메소드 선언
	void powerOn(){
		int a;
		a = 10;
		
		System.out.println("전원을 켭니다");
	}
	
	
	
	
	int plus(int x, int y) {
		System.out.println("x : " + x);
		System.out.println("y : "+ y);
		
		int result = x+y;
//		return "sdfsf"; 스트링은 타입불일치, int로 자동형변환 안됨
		return result;
	}
	
	/**
	 * javadoc 주석
	 * 두 정수를 입력 받아서
	 * 나누기의 결과를
	 * double로 return 하는 메소드
	 * 단! y가 0일 때는 
	 * 			"0으로 나눌 수 없다고 출력하고
	 * 			0을 return
	 * 
	 * 메소드명:divide
	 * 전달인자:int x, int y
	 * return type: double
	 * 
	 * 
	 * @param int x, int y
	 * @return double
	 * @author tt@naver.com
	 */
	double divide(int x, int y) {
//		if (y == 0 ) {
//			System.out.println("x: " + x);
//			System.out.println("y: " + y);
//			System.out.println("0으로 나눌 수 없다");
//			double zero = 0;
//			return zero;
//		} 
//		return (double) x/y;
		
		double result = 0;
		if (y == 0 ) {
			result = 0;
			System.out.println("0으로 나눌 수 없다");
		} else {
			result = (double)x/y;
		}
		return result;
		
	}
	
}
