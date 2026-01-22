package quiz.quiz8;

import java.util.Scanner;

public class UpDown {
	int num;
	int inputNum;
	int count;
	UpDown(){
		this.num = (int)(Math.random()*10 + 1);
		System.out.println("숫자를 1~10까지 입력해주세요");
	}
	
	void check() {
		count = 0;
		do {
			System.out.println(this.num);//랜덤숫자 확인용. 실게임에서는 주석처리해야함
			System.out.println("숫자를 골라주세요");
			Scanner scan = new Scanner(System.in);
			this.inputNum = scan.nextInt();
			if(this.num > this.inputNum ) {
				System.out.println("Up");
			}else if(this.num < this.inputNum) {
				System.out.println("Down");
			}else {
				System.out.println("정답입니다");
			}
			count++;
		} while(this.num != this.inputNum);
	}
	
	void count() {
		System.out.println(count +"번만에 맞췄습니다");
	}
	
}
