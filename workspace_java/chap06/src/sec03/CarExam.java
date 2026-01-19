package sec03;

public class CarExam {

	public static void main(String[] args) {
		
//		new Car();
		Car c3 = null;
		try {
			// constructor가 실행되어야 실제 생성이 된다
			c3 = new Car();
		}catch (Exception e) {
			System.out.println("new Car()에서 예외발생");
		}
		System.out.println(c3);
	}

}
