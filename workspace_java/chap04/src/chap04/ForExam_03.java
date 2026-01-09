package chap04;

import java.util.Scanner;

public class ForExam_03 {
	public static void main(String[] args) {
		
		int sum =  0;
		
//		for(int i=1; i <= 100; i = i + 1) {
		int i=0;
//		for(i=1; i <= 100; i++) {
		i = 1;
//		for(;;) {} for문의 기본형식. ;;만 있어도 
		for(; i <= 100; i++) {
			sum = sum + i;
//			sum += 1
		}
		System.out.println(sum);
		System.out.println(i);
		
		//깜짝 퀴즈 1~10까지 출력
		for (int j = 1; j <= 10; j++) {
			System.out.println(i);
		}
		
		// 1+1+1+1+1
		// 1씩 더하는 걸 5번 하고싶다.
		int sum1 = 0;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		sum1 = sum1 +1;
		
		//시작 값 
		//종료 조건
		int sum2 = 0;
		for (int j= 1; j<=5; j++) {
			sum2 = sum2 +1;
		}
		System.out.println(sum2);
		
		//1~5까지 합을 구하기
		sum = 0;
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		
		sum = 0;
		int k = 1;
		sum = sum + k; // k == 1
		k++;
		sum = sum + k; // k ==2
		k++;
		sum = sum + k; // k == 3
		k++;
		sum = sum + k; // k == 4
		k++;
		sum = sum + k; // k == 5
		
//		for(k=1; k <= 5;) {
//			sum = sum + k;
//			k++;
//		}
		for(k=1; k <= 5; k++) {
			sum = sum + k;
		}
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기
		 * 		Ctrl + c, v 했을 때 바뀌지 않는 것 찾기
		 * 
		 * 2. 반복되지 않는 것의
		 * 		2-1. 규칙(패턴) 찾기
		 * 		2-2. 변수로 바꿔서 더 이상 바뀌지 않게 만들기
		 * 
		 * 3. 시작값 파악
		 * 4. 종료조건 파악
		 */
		
		//깜짝퀴즈
		//구구단 2단 출력
		// 2x1 = 2
		// 2x2 = 4
//		int num = 2;
//		
//		for( int i1 = 1; i1<=9; i1++ ) {
//			System.out.println(num +"x" + i1 +" = " +( num * i1));
//		}
//		
//		// 10부터 1까지  출력
//		
//		for (i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
//		
//		// 10부터 2까지 짝수만 출력
//		
//		for (i = 10; i >= 2; i -= 2) {
//			System.out.println("짝수 : " + i);
//		}
//		
//		// --- 꼭 풀 수 있어야 함 ---
//        // 문제1
//        // 1~5까지 출력하되 홀수인지 짝수인지 같이 출력
//        // 예) 1:홀수
//        //     2:짝수
//		
//		for (i = 1 ; i <= 5; i++) {
//			System.out.print(i);
//			if(i % 2 != 0) {
//				
//				System.out.println(":홀수");
//			}else {
//				
//				System.out.println(":짝수");
//			}
//		}
//        
//        // 문제2
//        // 1~100까지 홀수의 합과 개수
//		sum = 0;
//		int a = 0;
//        for (i = 1 ; i <= 100; i++) {
//        	if(i % 2 == 1) {
//        		a++;
//        		sum +=i;
//        	}
//        }
//        System.out.println(a);
//        System.out.println(sum);
//	
//		
//        // 문제3
//        // 1 ~ 입력 받은 수 까지 더하기
//        
//        Scanner scan = new Scanner(System.in);
//        String inputData = scan.nextLine();
//        a = Integer.parseInt(inputData);
//        sum = 0;
//        for (i = 1; i <= a; i++) {
//        	sum +=i;
//        }
////        System.out.println(i);
////        System.out.println(a);
//        System.out.println(sum);
//        
//        // --- 조금 난이도 있는 ---
//        // 문제4
//        // 1~10까지 3개씩 옆으로 찍
//        //    1  2  3
//        //    4  5  6 
//        //    7  8  9
//        //    10
//        for (i=1; i <= 10; i++) {
//        	if (i % 3 == 0) {
//        		System.out.println(i);
////        		System.out.println(i + "\n");
//        	}else if (i == 10){
//        		System.out.print(i);
//        	}
//        	
//        	else {
//        		System.out.print(i + ",");
//        	}
//        } 
//        System.out.println();
//        // --- 2중 for문 ---
//        // 문제5
//        // 구구단 모든 단 출력
//        // 2 x 1 = 2
//        
//		for (i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}
		// 문제2
        // 구구단 단마다 옆으로 출력
        // 2x1=2 2x2=4...
//		for (i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(j == 9) {
//					System.out.println(i + " x " + j + " = " + (i * j));
//				}else {
//					System.out.print(i + " x " + j + " = " + (i * j) +  "\t" );
//				}
//				
//			}
//		}
		
        
        // 문제3
        // 구구단 3단씩 옆으로 출력
        // 2x1=2 3x1=3 4x1=4
        // 2x2=4 3x2=6 4x2=8
        // 2x3=6...
		//System.out.println(i + " x " + j + " = " + (i * j));
//		for (i=2; i<=9; i += 3) {
//			for(int j=1; j<=9; j++) {
//			System.out.print(i + " x " + j + " = " + (i * j) +  "\t" );
//			System.out.print(i +1 + " x " + j + " = " + ((i + 1) * j) +  "\t" );
//			System.out.println(i +2 + " x " + j + " = " + ((i + 2) * j));
//			}
//		
//		}
		
		
        // 문제4
        // 주사위 2개를 굴려서
        // 나올 수 있는 모든 조합 출력
        // [1,1] [1,2] [6,6]
        
		int dice = 6;
		for(int i2 = 1; i2 <=6; i2++) {
			for(int j = 1; j <=6; j++) {
				if(j == dice) {
					System.out.println("[" + i2 +"," + j + "]");
				}else {
				System.out.print("[" + i2 +"," + j + "]");
				}
			}
		}
		
        // 문제5
        // 주사위 2개를 굴려서
        // 합 별로 출력
        // 합2 : [1,1]
        // 합3 : [1,2] [2,1]
		// 합4 : 1,3 1,3 2,2 
//		int dice = 6;
//		for (i = 2; i <= dice + dice ; i++) {
//			System.out.print("합"+ i +":");
//			for (int j = 1; j <= 6; j++) {
//				for (int t = 1; t <=6; t++) {
//					if (i == j + t)
//						System.out.print("[" + j +"," + t + "]");
//					
//					else if (j+t == dice + dice) {
//					System.out.println();
//					}
//				}
//					
//			}
//		}
        
        // 문제6
        // 주사위 2개를 굴려서 나올 조합에서
        // 중복 없이 출력
        // 예: [1,2] [2,1] 중복이라서 [1,2]
		//  [i, t] [t, i] 에서 하나를 제거해야한다. 
		//  11 12 13 14 15 16 
		// 	22 23 24 25 26
		//  33 34 35 36
		//  44 45 46
				
//		int dice = 6;
//			for (int j = 1; j <= 6; j++) {
//				System.out.println();
//				for (int t = 1; t <=6; t++) {
//					if (j <= t)
//						System.out.print("[" + j +"," + t + "]");				
//			}
//		}
		
	}

}
