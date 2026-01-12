package chap04;

import java.util.Scanner;

public class WhileExam_04 {

	public static void main(String[] args) {

		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 0:종료");
//		int menu = 1;
//		if(menu == 1) {
//			System.out.println("커피 드릴게요");
//		} else if (menu == 2) {
//			System.out.println("차 드릴게요");
//		} else if (menu == 0) {
//			System.out.println("종료합니다");
//		} else {
//			System.out.println("다시 입력해주세요");
//		}
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 0:종료");
		System.out.println("-------");
//		Scanner scan = new Scanner(System.in);
//		menu = scan.nextInt();
//		menu = -1;
//		while(menu != 0) {
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1:커피, 2:차, 0:종료");
//			Scanner scan = new Scanner(System.in);
//			menu = scan.nextInt();
//			
//			if(menu == 1) {
//				System.out.println("커피 드릴게요");
//			} else if (menu == 2) {
//				System.out.println("차 드릴게요");
//			} else if (menu == 0) {
//				System.out.println("종료합니다");
//			} else {
//				System.out.println("다시 입력해주세요");
//			}
//		}
		
//		int menu2 = -1;
//		do {
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1:커피, 2:차, 0:종료");
//			Scanner scan = new Scanner(System.in);
//			menu2 = scan.nextInt();
//			
//			if(menu2 == 1) {
//				System.out.println("커피 드릴게요");
//			} else if (menu2 == 2) {
//				System.out.println("차 드릴게요");
//			} else if (menu2 == 0) {
//				System.out.println("종료합니다");
//			} else {
//				System.out.println("다시 입력해주세요");
//			}
//		} while (menu2 != 0);
		
//		for(;menu != 0;) {
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1:커피, 2:차, 0:종료");
//			Scanner scan = new Scanner(System.in);
//			menu = scan.nextInt();
//			
//			if(menu == 1) {
//				System.out.println("커피 드릴게요");
//			} else if (menu == 2) {
//				System.out.println("차 드릴게요");
//			} else if (menu == 0) {
//				System.out.println("종료합니다");
//			} else {
//				System.out.println("다시 입력해주세요");
//			}
//		}

//		예금액이  마이너스 안돼
// 		1234 이외에 메뉴 들어오면 제대로 입력하세요
//		출금액이 음수 불가, 잔고 초과 불가
		int balance = 0;
		int menu = -1;
		
		while(menu != 4) {
			System.out.println("------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			int a = 0;
			if (menu ==1) {
				System.out.println("선택> 1");
				Scanner scan1 = new Scanner(System.in);
				String can = scan1.nextLine();
				a = Integer.parseInt(can);
				while (a < 0) {
					System.out.println("다시 입력해주세요");
					can = scan1.nextLine();
					a = Integer.parseInt(can);	
				}
				System.out.println(a);
				balance += a;
				System.out.println("총예금액" + balance);
			}
			if (menu ==2) {
				System.out.println("선택> 2");
				a = -1;
				while (balance < a || a < 0) {
					Scanner scan1 = new Scanner(System.in);
					String can = scan1.nextLine();
					a = Integer.parseInt(can);
					System.out.println("다시 입력해주세요");
				}
				balance -= a;
				System.out.println("출금액:" + a);
				System.out.println(balance);
			}
			if (menu ==3) {
				System.out.println("선택> 3");
				System.out.println(balance);
			}
			if (menu ==4) {
				System.out.println("선택> 4");
				System.out.println("프로그램 종료");
				break;
			}
			if (menu != 1 && menu != 2 && menu != 3 && menu != 4) {
				System.out.println("다시 선택하세요.");
			}
		}
		
		
	}
	
}
