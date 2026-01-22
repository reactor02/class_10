package quiz.quiz10;

public class Tv {
	boolean power;
	int volum;
	int channer;
	
	void turnOn() {
		power = true;
		System.out.println("전원 켜졌습니다");
	}
	void turnOff() {
		power = false;
		System.out.println("전원 꺼졌습니다");
	}
	
	void volumUp() {
		if(power) {
			if(volum >= 10) {
				System.out.println("볼륨 최대는 10입니다"); 
			} else {
				volum++;
				System.out.println("볼륨이" +1+"만큼 증가했습니다");
				System.out.println(volum);
			}
		} else {
			System.out.println("전원을 켜주세요");
		}
		
	}
	void volumDown() {
		if(power) {
			if(volum <= 0) {
				System.out.println("볼륨 최소는 0입니다"); 
			} else {
				volum--;
				System.out.println("볼륨이" + 1 +"만큼 감소했습니다");
				System.out.println(volum);
			}
		} else {
			System.out.println("전원을 켜주세요");
		}
		
	}
	
	int channer(int channer) {
		if(power) {
			this.channer = channer;
			return this.channer;
		} else {
			System.out.println("전원을 켜주세요");
			return this.channer;
		}
		
	}
	
	void status () {
		System.out.println("power: " + power + ", volum: " + volum + ", channer: " + channer);
	}
	
	
}
