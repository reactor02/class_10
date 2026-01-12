package chap04;

import java.util.Scanner;

public class Pyramid_03_1 {

	public static void main(String[] args) {

		//	1단계
		//	+++++
		
//		for(int i = 1; i<=5; i++) {
//			System.out.print("+");
//		}
		
		//	2단계
		// +_+_+_+_
		
//		for(int i =1; i<=4; i++)
//			System.out.print("+_");
		
		//	3단계
		//	+++++
		//	+++++
		//	+++++
//		for(int i=1; i<=3; i++) {
//			for(int j = 1; j<=6; j++) {
//				System.out.print("+");
//			}
//			System.out.println("");
//		}
		// 4단계
        // 11111
        // 22222
        // 33333
        // 44444
        // 55555
		
//		for(int i=1; i<=5; i++) {
//			for(int j = 1; j<=6; j++) {
//				System.out.print(i);
//			}
//		System.out.println("");
//		}
//		
        
        // 5단계
        // 1
        // 22
        // 333
        // 4444
        // 55555
		
//		for(int i=1; i<=5; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(i);
//				}
//			System.out.println("");
//			}
        
        // 6단계
        // +
        // ++
        // +++
        // ++++
        // +++++
		
//		for(int i=1; i<=5; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("+");
//				if(j == i) {
//					System.out.println("");
//				}
//			}
//		}
        
        // 7단계
        // 11111
        // 2222
        // 333
        // 44
        // 5
		
//		for(int i=5; i>=1; i--) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print((5+1)-i);
//			}
//			System.out.println("");
//		}
		
        
        // 8단계
        // +____
        // ++___
        // +++__
        // ++++_
        // +++++
//		for(int i=1; i<=5; i++) {
//			for(int j = 1; j<=i ; j++) {
//				System.out.print("+");
//			}
//			for(int j = 4; j >= i; j--) {
//				System.out.print("-");
//			}
//			System.out.println("");		
//		}
        // 9단계
        // ____+
        // ___++
        // __+++
        // _++++
        // +++++
//		for(int i=1; i<=5; i++) {
//			for(int j = 4; j >= i; j--) {
//				System.out.print("-");
//			}
//			for(int j = 1; j<=i ; j++) {
//				System.out.print("+");
//			}
//			System.out.println("");
//		}
		
        
        // 10단계
        // ____+
        // ___+++
        // __+++++
        // _+++++++
        // +++++++++
		
//		int n = 5;
//		for(int i=1; i<=n; i++) {
//			for(int j = n-1; j >= i; j--) {
//				System.out.print("-");
//			}
//			for(int j = 1; j<= 2 * i -1 ; j++) {
//				System.out.print("+");
//			}
//			System.out.println("");
//		}
        
        // 11단계
        // ____+____
        // ___+++___
        // __+++++__
        // _+++++++_
        // +++++++++
		
//		int n = 5;
//		for(int i=1; i<=n; i++) {
//			for(int j = n-1; j >= i; j--) {
//				System.out.print("-");
//			}
//			for(int j = 1; j<= 2 * i -1 ; j++) {
//				System.out.print("+");
//			}
//			for(int j = n-1; j >= i; j--) {
//				System.out.print("-");
//			}	
//			System.out.println("");
//		}
        
        // 12단계
        // 입력 받은 줄 수 대로 출력
        
//		Scanner scan = new Scanner(System.in);
//		String num = scan.nextLine();
//		int n =	Integer.parseInt(num);
//		for(int i=1; i<=n; i++) {
//			for(int j = n-1; j >= i; j--) {
//				System.out.print("-");
//			}
//			for(int k = 1; k<= (2 * i) -1 ; k++) {
//				System.out.print("+");
//			}
//			for(int j = n-1; j >= i; j--) {
//				System.out.print("-");
//			}	
//			System.out.println("");
//		}
			
		
	}

}
