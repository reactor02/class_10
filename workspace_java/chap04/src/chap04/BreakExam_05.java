package chap04;

import java.util.Scanner;

public class BreakExam_05 {
	public static void main(String[] args) {
		int count = 0;
		while(true) {
			int num = (int) (Math.random()* 6) + 1;
			System.out.println("주사위:" + num);
			if(num == 6) {
				System.out.println(count);
				break;
			}
			count++ ;
		}
		
		
		//	총 다섯 명이 순차적으로 주사위를 던져서
		//	각자 6이 나올 때까지. 6이 나오면 다음사람
		for(int i=1;i <=5; i++) {
			while(true) {
				int num = (int) (Math.random()* 6) + 1;
				System.out.println(i + "주사위:" + num);
				if(num == 6) {
					break; //while 소속이라서 while만 중단
				}
			}
		}
		
		
		// 총 4층의 주차건물이 있음
		// 각 층에는 10대의 자리가 있음
		// 내 차는 1층 첫번째부터 17번째에 있음
		int count2 = 0;
		boolean flag = false;
		for(int i=1; i<=4; i++) {
			for(int j = 1; j<=10; j++) {
				count2++;
				System.out.println(i +"," + j);
				if(count2 == 17) {
					System.out.println("!!!!!!!");
					flag = true;
					break;
				}
			}
			if(flag == true) {
				break;
			}
		}
		
		for (int i =1; i <= 10; i++) {
			if(i%2 ==1 ) {
				continue;
			}
			System.out.println(i);
		}

//		예금액이  마이너스 안돼
// 		1234 이외에 메뉴 들어오면 제대로 입력하세요
//		출금액이 음수 불가, 잔고 초과 불가
		int balance = 0;//잔액
		while(true) {// 은행 프로그램 while반복문
			System.out.println("------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			int a = 0;//입금액, 출금액 변수
			if (menu ==1) {//예금
				System.out.println("선택> 1");
				do 	{Scanner scan1 = new Scanner(System.in);//예금액 입력
				String can = scan1.nextLine();
				a = Integer.parseInt(can);
				if (a<0) {// 예금액 음수일 때만 출력
					System.out.println("다시 입력해주세요");
					}
				} while (a < 0); //예금액 음수 검사시 음수면 반복				
				System.out.println(a);
				balance += a; //잔액에 에금액 플러스
				System.out.println("총예금액" + balance);
			}
			if (menu ==2) {//출금
				System.out.println("선택> 2");
				a = -1; //while문에 넣기 위해 a값 -1 대입
				while (balance < a || a < 0) { //잔액보다 출금액이 많거나 or 출금액이 음수일 때 반복
					Scanner scan1 = new Scanner(System.in);
					String can = scan1.nextLine();
					a = Integer.parseInt(can);
					System.out.println("다시 입력해주세요");
				}
				balance -= a;
				System.out.println("출금액:" + a);
				System.out.println(balance);
			}
			if (menu ==3) {//잔액
				System.out.println("선택> 3");
				System.out.println(balance);
			}
			if (menu ==4) {//종료
				System.out.println("선택> 4");
				System.out.println("프로그램 종료");
				break;//while문 무한반복 탈출
			}
			if (menu != 1 && menu != 2 && menu != 3 && menu != 4) {//입력이 1,2,3,4와 다 다르면 다르면 출력
				System.out.println("다시 선택하세요.");
			}
		}
	}
}
