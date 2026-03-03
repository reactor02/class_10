package quiz.quiz7;

public class Fan {
	boolean power;// false 꺼짐, true 켜짐
	int wind;// 0 약풍, 1강풍

	void turnOn() {
		this.power = true;
		System.out.println("전원이 켜졌습니다");
	}
	void turnOff() {
		this.power = false;
		System.out.println("전원이 꺼졌습니다");
	}
	void strong() {
		if(this.power == true) {
			this.wind = 1;
			System.out.println("강풍");
		} else {
			System.out.println("전원을 켜주세요.");
		}
		
	}
	void weak() {
		if(this.power == true) {
			this.wind = 0;
			System.out.println("약풍");
		} else {
			System.out.println("전원을 켜주세요.");
		}
	}
}
