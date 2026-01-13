package chap05;

public class ArrayExam_02 {
	public static void main(String[] args) {
		/*
		 * 	배열 array
		 * 	
		 * 	한 번에 여러 변수를 만드는 방법
		 * 	같은 타입만 선언할  수 있음
		 * 	생성할 때 전체 크기를 지정해줘야 함
		 * 	생성된 여러 변수들은 index로 관리한다
		 * 	index는 0번 부터 시작 
		 */
		
		//	선언방법
		int[] a1; // java 스타일
		int a3[]; // c언어 스타일
		
		//	배열 변수는 reference type이라서 null을 넣을 수 있다.
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 81;
		int score_2 = 70;
		
		/*
		 *	첫번째 [] : int[]
		 * 		int만으로 구성된 array variable type
		 * 	두번째 []: new int[30]
		 * 		배열의 크기. 즉, 한 번에 만들 변수의 개수
		 * 	세번째 []: score[0]
		 * 		만들어진 변수 중에서 몇 번째인가?
		 * 		index는 0부터 시작한다
		 * 	배열을 선언하는 첫번째 방법
		 */
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 85;
//		score[2] = null;
		
		System.out.println("score[0]: " + score[0]);
		//ArrayIndexOutOfBoundsException
		//	길이가 30이라서 0~29까지 가능한데 30은 범위를 벗어났다
//		score[50] = 2;
		
		String[] str =new String[3];
		System.out.println(str[0]);
		System.out.println(score[5]);
		
		//	배열 생성 후 기본값
		//	0, false, null로 초기화 됨
		
		//	배열을 선언하는 2번째 방법
		// 	null 값을 모두 알고 있는 경우
		int[] i1 = new int[] {90,85,70};
		System.out.println(i1[1]);
		
		// 	선언과 초기화를 따로 할 수 있다
		int[] i2 =	null;
		i2 = new int[] {90,85,70};
		
		// 	배열을 선언하는 3번째 방법
		// 	선언과 동시에 초기화하는 경우만 사용가능
		// 	new int[]를 생략할 수 있다
		int[] i3 = {90, 85, 70};
//		i3 = {90, 85, 70};
		
		int sum = 0;
//		sum = sum + i3[0];
//		sum = sum + i3[1];
		
//		for(int i=0; i<=2)
		for(int i=0; i<3; i++) {
			sum = sum + i3[i];
			
		}
		System.out.println("sum: " + sum);
		System.out.println("sum: " + (sum/3.0));
		
		System.out.println("배열의 길이: " + i3.length);
		
		sum = 0;//	앞에 누적된 거 초기화
		for(int i=0; i<i3.length; i++) {
			sum = sum + i3[i];		
		}
		
		//	5개 변수를 한 번에 만들기
		//	5개 크기의 int 배열 만들기
		int[] a5 = new int[5];
		//첫번째 변수에 1 넣기
		a5[0] = 1;
		//두번째 변수에 2 넣기
		a5[1] = 2;
		
		//	문제1
		//	첫번째 반복문에서 
		//		10개의 변수에 1~10 값 담기
		//	두 번째 반복문에서 모든 값을 순서대로 출력
		int[] a = new int[10];
		for(int i=0; i<a.length; i++) {
			a[i]=i+1;
		}
		for(int j=0;j<a.length;j++) {
				System.out.println(a[j]);		
		}
		
//		a.length =4; 변경불가
		
		// 혹시 몰라서 출력
		System.out.println(args);
		if(args != null) {
			//args의 개수 출력
			//args의 모든 내용 출력
			System.out.println(args.length);
			for(int i = 0; i< args.length; i++) {
				System.out.println(args[i]);
			}
		}
		
		
		// 문제2
        // 7, 12, 8을 순서대로 저장한 배열이 있을 때
        // 다른 배열에도 7, 12, 8으로 저장되게 복사
        // 단 b = a 안됨
		
//		int[] array1 = new int[] {7, 12, 8};
//		int[] array2 = new int[array1.length];
//		for(int i=0; i<array1.length; i++) {
//			array2[i] = array1[i];
//			System.out.println(array2[i]);
//		}
        // 문제3
        // 7, 12, 8을 순서대로 저장한 배열이 있을 때
        // 다른 배열에 거꾸로 8, 12, 7로 저장되게
//		for(int i=0; i<array1.length; i++) {
//			array2[i] = array1[array1.length -1 - i];
//			System.out.println(array2[i]);
//		}
        // 문제4
        // {3, 4, 7, 5, 1, 4, 6}
        // 4-1. 배열에서 홀수의 개수 구하기
//        int num = 0;
//		int array3[] = new int[] {3, 4, 7, 5, 1, 4, 6};
//		for(int i = 0; i < array3.length; i++) {
//			if (array3[i] % 2 == 1 ) {
//				num++;
//			}
//		}
//		System.out.println(num);
		// 4-2. 4보다 큰 수의 개수 구하기
//		num = 0;
//		for(int i = 0; i < array3.length; i++) {
//			if (array3[i] > 4 ) {
//				num++;
//			}
//		}
//		System.out.println(num);
		
        // --- 응용(멘탈챙겨) ---
        // 문제5
        /*
         * 마라톤에 5명의 선수가 참여했음
         * 선수들은 1번부터 5번까지 등번호가 있음
         * 대회가 끝났을 때 완주하지 못한 선수를 찾으시오
         * 완주 목록 {2, 4, 5, 1} 
         */
		
//		int[] player = new int[] {1, 2, 3, 4, 5};
//		int[] goalIn = new int[] {2, 4, 5, 1};
//		int i= 0;
//		boolean flag = false;
//		for(i = 0; i < player.length; i++) {
//		
//			for(int j = 0; j < goalIn.length; j++) {
//				if(player[i] == goalIn[j]) {
//					break;
//				}
//				if(goalIn[j] == goalIn[goalIn.length - 1]) {
//					flag = true;
//				}
//			}
//			if(flag == true) {
//				break;
//			}
//		}
//		System.out.println(player[i]);
		
        
        // 문제6
        // {3, 4, 7, 5, 1, 4, 6}
        // 여기서 가장 큰 수 찾기
		// 두 수를 비교한다.
		// 더 큰 수가 나오면 반복을 멈추고 더 큰 수를 저장
		// 저장한 수와 다음 수를 비교하며 이를 반복한다
		// 첫번째랑 나머지 비교. 이후 큰 값을 저장.
		// 이후 큰 값과 다른 값을 비교.
//		int[] array = new int[] {3, 4, 7, 5, 1, 4, 6};
//		int big = 0;
//		boolean flag = false;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array.length; j++) {
//				if(array[i] < array[j]) {
//					big = array[j];
//					for(int k = 0; k < array.length; k++) {
//						if(big < array[k]) {
//							break;
//						}else if (array[k] == array[array.length - 1]) {
//							flag = true;
//						}
//				}
//					
//				}
//				if(flag == true) {
//					break;
//				}
//			}
//		}
//		System.out.println(big);
		// i에 3이 들어 있고. 이걸 전부 비교하면 된다.
		int[] array = new int[] {3, 4, 7, 5, 1, 4, 6};
		int big = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		boolean flag = false;
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array.length; j++) {
				if(array[i] < array[j]) {
					big = array[i];
					break;
				}
			}
			big = array[i];
			for(k=i;k<array.length; k++ ) {
				if(big < array[k]) {
					big = 0;
				}
			}
			if(big > 0) {
				break;
			}
		}
	System.out.println(big);
	}
}