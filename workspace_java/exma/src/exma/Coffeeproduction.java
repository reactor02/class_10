package exma;

import java.util.Scanner;

public class Coffeeproduction {
	
	public static void main(String[] args) {
		Coffee[] coffee = new Coffee[5];
		coffee[0] = new Coffee("아메리카노", 300);
		coffee[1] = new Coffee("아메커피", 400);
		coffee[2] = new Coffee("카푸치노", 500);
		coffee[3] = new Coffee("카페라떼", 600);
		coffee[4] = new Coffee("에스프레소", 700);
		
		boolean flag = false;
		boolean flag1 = true;
		
		
		
		
		
		
		while(true) {
			flag1 = true;
			System.out.println("1.커피 종류 선택 2.선택 내용 확인 0.종료");
			Scanner scan = new Scanner(System.in);
			int inputData = scan.nextInt();
			if(inputData == 1) {
				while(flag1) {
					System.out.println("커피를 골라주세요");
					Coffee.callList();
					Scanner scan1 = new Scanner(System.in);
					int coffeeChoice = scan1.nextInt();
					System.out.println("몇 잔 주문하시겠습니까?");
					int qty = scan1.nextInt();
					coffee[coffeeChoice - 1].count = qty;   
					Coffee.callBucket(coffee[coffeeChoice - 1]);
					System.out.println("필수옵션을 골라주세요");
					System.out.println("Cuholder 1.추가 2.추가 안함 3.처음으로 돌아가기");
					Scanner scan2 = new Scanner(System.in);
					int cupholder = scan2.nextInt();
					if(cupholder == 1) {
						coffee[coffeeChoice-1].cupholderAdd();
					}else if (cupholder == 3) {
						continue;
					}
					else {
						coffee[coffeeChoice-1].cupholderNo();
					}
					System.out.println("Milk 1.추가 2. 추가 안함 3.처음으로 돌아가기");
					int milk = scan1.nextInt();
					if(cupholder == 1) {
						coffee[coffeeChoice-1].MilkAdd();
					}else if (cupholder == 3) {
						continue;
					}
					else {
						coffee[coffeeChoice-1].MilkNo();
					}
					System.out.println("1.Hot 2.Ice 3.처음으로 돌아가기 ");
					int tempreture = scan1.nextInt();
					if(cupholder == 1) {
						coffee[coffeeChoice-1].hot();
					}else if (cupholder == 3) {
						continue;
					}
					else{
						coffee[coffeeChoice-1].ice();
					}
					
					System.out.println("추가옵션을 선택하시겠습니까?");
					System.out.println("1.추가옵션  2.끝내기 3.처음으로 돌아가기");
					int a = scan2.nextInt();
					if(a == 1) {
						flag = true;
					}else if (cupholder == 3) {
						continue;
					}
					else {
						System.out.println("선택을 종료합니다");
					}
					if(flag) {
						Coffee.shotPrice ();
						System.out.println("Syrup 1.추가 2. 추가 안함 3.처음으로 돌아가기");
						a = scan2.nextInt();
						if(a == 1) {
							coffee[coffeeChoice-1].SyrupAdd();
						}else if (a == 3) {
							continue;
						}
						else {
							coffee[coffeeChoice-1].SyrupNo();
						}
						Coffee.syrupPrice();
						System.out.println("Shot 1.추가 2. 추가 안함 3.처음으로 돌아가기");
						a = scan2.nextInt();
						if(a == 1) {
							coffee[coffeeChoice-1].ShotAdd();
						}else if (a == 3) {
							continue;
						}
						else {
							coffee[coffeeChoice-1].ShotNo();
						}
						flag = true;
					}
					flag1=false;
					coffee[coffeeChoice - 1].callBucket(coffee[coffeeChoice-1]);
				}
				
				
			}else if(inputData == 2) {
				Coffee.callBucketList();
				
			}else if(inputData == 0) {
				System.out.println("커피 생산을 종료합니다");
				break;
			}
		}
	System.out.println("총 금액: " + Coffee.getTotalPrice() + "원");
		
		
	}
}
