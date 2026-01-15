package chap05;

import java.util.Scanner;

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
//		num = 0; // 위에 썼으니 초기화 필요
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
//		int fail = 0;
//		boolean flag = false;
//		for(int i = 0; i < player.length; i++) {	
//			for(int j = 0; j < goalIn.length; j++) {
//				if(player[i] == goalIn[j]) {
//					break;
//				}
//				if(goalIn[j] == goalIn[goalIn.length - 1]) {
//					fail = player[i];
//					flag = true;
//				}
//			}
//			if(flag == true) {
//				break;
//			}
//		}
//		System.out.println(fail);
		
        
        // 문제6
        // {3, 4, 7, 5, 1, 4, 6}
        // 여기서 가장 큰 수 찾기
		// 두 수를 비교한다.
		// 더 큰 수가 나오면 반복을 멈추고 더 큰 수를 저장
		// 저장한 수와 다음 수를 비교하며 이를 반복한다
		// 첫번째랑 나머지 비교. 이후 큰 값을 저장.
		// 이후 큰 값과 다른 값을 비교.
//		int[] array = new int[] {3, 4, 7, 5, 1, 4, 6};
//		int max = 0;
//		boolean flag = false;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array.length; j++) {
//				if(array[i] < array[j]) {
//					max = array[j];
//					for(int k = 0; k < array.length; k++) {
//						if(max < array[k]) {
//							break;
//						}else if (array[k] == array[array.length - 1]) {
//							flag = true;
//						}
//					}
//					
//				}
//				if(flag == true) {
//					break;
//				}
//			}
//		}
//		System.out.println(max);
		// i에 3이 들어 있고. 이걸 전부 비교하면 된다.
//		int[] array = new int[] {3, 4, 7, 5, 1, 4, 6};
//		int max = 0; //최대값
//		int j = 0;
//		int k = 0;
//		for(int i = 0; i < array.length; i++) {//비교할 값1
//			for(
//					j = 0; j < array.length; j++) {//비교할 값2
//				if(array[i] < array[j]) {
//					max = array[j]; //	인덱스 j가 인덱스i보다 더 클 시 max에 넣고 break
//					break;
//				}
//			}
//			for(int k=j + 1;k<array.length; k++ ) {
//				if(max < array[k]) {//max이 다른 값보다 작으면 max 0으로 초기화
//					max = 0;
//					break;
//				}
//			}
//			if(max > 0) {//max이 0보다 크다면 max보다 큰 수가 없으므로 반복 break
//				break;
//			}
//		}
//	System.out.println(max);// 최대값 출력
	//	단점 
	//	양의 정수만 비교 가능
	// 	음의 정수까지 계산하려면 배열의 변수가 가진 최소값을 알고 있어야한다
//		int[] array = new int[] {3, 4, 7, 5, 1, 4, 6};
//		int max = q6[0]; 
//		boolean flag = false;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array.length; j++) {
//				if(array[j] > max) {//	max가 조건문에 들어가 있어 max보다 큰 수가 조건에 부합할 수 없음
//					max = array[j]; //	max보다 더 큰 수가 들어가다가 max가 최대값에 도달 시 if문은 항상 false이므로 max에 최대값이 할당된 상태로 반복문 종료
//				}
//			}
//		}
//		System.out.println(max);
		
		// 문제7
        // {3, 4, 7, 5, 1, 4, 6}
        // 여기서 두번째 큰 수 찾기
        
		int[] array = new int[] {3, 4, 7, 5, 1, 4, 6};
		int[] array2 = new int[array.length-1];
		int max = array[0];
		int max2 = array[0];
		boolean flag = false;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] > max) {//	max가 조건문에 들어가 있어 max보다 큰 수가 조건에 부합할 수 없음
					max = array[j]; //	max보다 더 큰 수가 들어가다가 max가 최대값에 도달 시 if문은 항상 false이므로 max에 최대값이 할당된 상태로 반복문 종료
				}
			}
		}
		//최대값은 발견
		// 최대값 보다 작은 수 하나를 찾고, 다른 수보다는 큰 수를 찾아야한다.
		// max와 본인을 제외한 나머지수< a < max
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] != max) {
					if(array[j] > max2) {
						max2 = array[j];
					}
				}
			}
		}
		System.out.println("두번째:" + max2);	
		
				
        // 문제8
        // 오른쪽으로 한칸 씩 밀기 
        // 왼쪽은 0으로 채우기
        // 예: 
        // 1라운드: {3, 4, 7, 5, 1, 4, 6}
        // 2라운드: {0, 3, 4, 7, 5, 1, 4}
        // 3라운드: {0, 0, 3, 4, 7, 5, 1}
		// 배열의 왼쪽의 수는 0으로 바꾸기만 하면된다.
		// 배열의 오른쪽 수를 이전 배열에서 가져와서 길이의 n-1로 채워나가면 된다.
		int[] ar = new int[]{3, 4, 7, 5, 1, 4, 6};
		int[] temp = new int[7];
		for(int i=0; i<ar.length; i++) {
			temp[i] = ar[i];
		}
		for(int i=0; i<ar.length+1; i++) {
			for (int j=0; j<ar.length ; j++) {
				if(i>j) {
					ar[j] = 0;
				} 
				else {
					ar[j] = temp[j-i];
					
				}
			}
		}
		
		
			
	
	
		
        
		/*
		 * i=0 ar[j] = ar[j]
		 * i=1 0 ar[j] = ar[j]
		 */
		
		
        // 문제9
        // 오른쪽으로 한칸 씩 밀기
        // 맨 끝 값은 맨 처음으로 보내기
        // 예: 
        // 1라운드: {3, 4, 7, 5, 1, 4, 6}
        // 2라운드: {6, 3, 4, 7, 5, 1, 4}
        // 3라운드: {4, 6, 3, 4, 7, 5, 1}
		// 이번에는 오른쪽 끝의 수를 맨 처음으로 가져와야한다. temp로 swap기법 써야할 것 같은데
		ar = new int[]{3, 4, 7, 5, 1, 4, 6};
		temp = new int[7];
		for(int i=0; i<ar.length; i++) {
			temp[i] = ar[ar.length - 1 - i];
		}
		
		
		//temp[6]부터 하나씩 줄어들어야 한다
		// i = 3 j = 6 5 4 3
		// i = 4 j = 6 5 4
		// i = 5 j = 6 5
		// i = 6 j = 6
		// i = 7 j =
		//0 10 210 3210 
		for(int i=0; i<ar.length; i++) {
			for (int j=0; j<temp.length ; j++) {
				if(i>j) {
					ar[j] = temp[i-j-1];
				} 
				else {
					ar[j] = temp[temp.length+i-j-1];
				}
				System.out.print(+ar[j]+",");
			}
			System.out.println();
		}
		
        // 문제10
        // 임시비밀번호 8자리
        // 10-1 : 숫자만
        // 숫자는 0에서 9까지가 필요함
		// mathrandom으로 0~ 9.99 만들고 int로 변환
		// mathrandom으로 얻은 값을 배열에 하나씩 넣기 반복문임
//		int[] pass = new int[8] ;
//		for(int i=0; i <pass.length; i++) {
//			double rand = Math.random();
//			int randValue = (int) (rand * 10);
//			System.out.println(randValue);
//			pass[i] = randValue;
//		}
//		for (int i=0; i <pass.length; i++) {
//			System.out.println("값이다" + pass[i]);
//					
//		}
		// 10-2 : 소문자만
		// 97~122 아스키코드로 소문자 생성
//		int min= 97;
//		int maximum = 122;
//		int[] passNum = new int[maximum -min +1] ;
//		for(int i=0; i <pass.length; i++) {
//			double rand = Math.random();
//			char randValue = (char) (rand *(maximum -min +1)+min );
//			System.out.println(randValue);
//			pass[i] = randValue;
//		}
        // 10-3 : 숫자2개 이상, 대/소문자 각 1개 이상
		// 숫자 2개 만들고, 대소문자 각 한 개씩 만들고. 나머지는 무작위로 만든다
		// 무작위로 만들고. 무작위 위치에 끼워넣는다면?
//		int[] pass = new int[2] ;
//		for(int i=0; i <pass.length; i++) {
//			double rand = Math.random();
//			int randValue = (int) (rand * 10);
//			System.out.println(randValue);
//			pass[i] = randValue;
//		}
//		for (int i=0; i <pass.length; i++) {
//			System.out.println("값이다" + pass[i]);
//					
//		}
//		int min= 97;
//		int maximum = 122;
//		int[] passLower = new int[1] ;
//		for(int i=0; i <passLower.length; i++) {
//			double rand = Math.random();
//			char randValue = (char) (rand *(maximum -min +1)+min );
//			System.out.println(randValue);
//			passLower[i] = randValue;
//		} 
//		 min= 65;
//		 maximum = 90;
//		int[] passUpper = new int[1] ;
//		for(int i=0; i <passUpper.length; i++) {
//			double rand = Math.random();
//			char randValue = (char) (rand *(maximum -min +1)+min );
//			System.out.println(randValue);
//			passUpper[i] = randValue;
//		}
//		int [][][] collect = new int[][][] {{pass}, {passLower}, {passUpper}};
		// pass가 두개, passLower 1개, passUpper 1개 를 포함한 8자리 비밀번호
		int[] password =new int[8];
		for(int i=0; i<password.length; i++) {
			double rand1 = Math.random(); //숫자
			int randValue1 = (int) (rand1 * 10);
			int min= 97; //소문자
			int maximum = 122;
			double rand2 = Math.random();
			char randValue2 = (char) (rand2 *(maximum -min +1)+min );
			min= 65; //대문자
			maximum = 90;
			double rand3 = Math.random();
			char randValue3 = (char) (rand3 *(maximum -min +1)+min );
			double rand4 = Math.random();
			int Condition = (int) (rand1 * 2);
			if (i < 2) {//숫자
				password[i] = randValue1;
			}else if(i < 3) {//소문자
				password[i] = randValue2;
			}else if(i <4) {//대문자
				password[i] = randValue3;
			}else {// 숫자, 소문자, 대문자 랜덤
				if(Condition == 0) {
					password[i] = randValue1;
				}
				if(Condition == 1) {
					password[i] = randValue2;
				}
				if(Condition == 2) {
					password[i] = randValue3;
				}
			}			
		}
		for(int i=0; i<password.length; i++) {
			if(password[i]>10) {
				char a12 = (char) password[i];
				System.out.print(a12);
			}else {
				System.out.print(password[i]);
			}
			
		}
		System.out.println();
		
		
		
        
        // 문제11
        // 자리가 10개 있는 소극장의 예약 시스템
        // 자리 번호는 1~10번까지 번호의 자리가 있습니다
        // 메뉴 : "1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료"
        // 조건1 : 예약이 가능하다면 "n번 자리 예약 되었습니다"
        // 조건2 : 예약이 되어있다면 "이미 예약 되어 있습니다"
		
		boolean[] seat = new boolean[10] ;
		int count = 0;
		
//		while(true) {
//			System.out.println("1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료");
//			Scanner scan = new Scanner(System.in);
//			int inputData = scan.nextInt();
//			if(inputData == 1) {
//				while(true) {
//					System.out.println("좌석을 골라주세요");
//					scan = new Scanner(System.in);
//					int inputData2 = scan.nextInt();
//					if(inputData2 >= seat.length) {
//						System.out.println("없는 좌석입니다");
//					}else if(seat[inputData2] == false) {
//						System.out.println(inputData2 +"번 자리 예약 되었습니다");
//						seat[inputData2] = true;
//						break;
//					}else {
//						System.out.println("이미 예약 되어 있습니다");
//					}
//				}
//			}else if(inputData == 2) {
//				for(int i = 0; i<seat.length; i++) {
//					if(seat[i] == true) {
//						System.out.println(i+"번 좌석은 예약되어있습니다.");
//					}else {
//						System.out.println(i+"번 좌석은 비어있습니다.");
//					}
//					
//				}
//			}else if(inputData == 3) {
//				for (int i=0; i<seat.length; i++) {
//					if(seat[i] == false) {
//						count +=1;
//					}
//				}
//				System.out.println("잔여 좌석의 수는 "+count+"개 입니다");
//				count = 0;
//				
//			}else if(inputData == 0) {
//				System.out.println("시스템을 종료합니다");
//				break;
//			}else {
//				System.out.println("다시 입력해주세요");
//			}
//			
//			
//		}
		
        
        // 문제12
        // 로또 번호 6개 배열에 저장
        // 단, 중복 없이!
		// 로또번호 45개다. 
		// Math.random() 으로 해야하는데
		// 만약 중복이 있으면 랜덤을 다시 돌려야함. 이전 값은 건드릴 필요없음
		// 배열에 숫자가 추가될 때마다 하나씩 비교해서 == 같은 것이 없다면 내려가면 됨. 아니면 브레이크
		
//        for(int i = 0; i <lottoNum.length; i++) {
//        	double random1 = Math.random();
//    		int lotto = (int) (random1 *(max - min + 1) + min);
//    		lottoNum[i] = lotto;
//    		temp[i] = lotto;
//        }
//        for(int i = 0; i <lottoNum.length; i++) {
//        	for(int j = i+1; j<temp.length;) {
//            	if(lottoNum[i] == temp[i] ) {
//            		flag = false;
//            	}
//            }
//        }
		max = 45;
		int min = 1;
        int[] lottoNum = new int[6];
        temp = new int[6];
        boolean flag1 = true;
        while(flag1) {// flag가 true인동안 계속 로또 번호 생성
        	flag1 = false;// 탈출용 코드
        	for(int i = 0; i <lottoNum.length; i++) {
            	double random1 = Math.random();
        		int lotto = (int) (random1 *(max - min + 1) + min);//무작위 로또번호 생성
        		lottoNum[i] = lotto;//똑같은 값 할당
        		temp[i] = lotto;//똑같은 값 할당
            }
            for(int i = 0; i <lottoNum.length; i++) {//로또값 반복
            	for(int j = i+1; j<temp.length; j++) {//임시로 만든 temp 반복
                	if(lottoNum[i] == temp[j] ) {//lotto 값이랑 temp가 같으면 브레이크
                		flag1 = true;
                		System.out.println("중복");              	
                	}
                }
            }
    
        }
        
        
        
        	
        
		
		
		
		
        // 문제13
        // 주차장에 
        // 0: 주차되어있음
        // 1: 비어있음
        /*
         * {
         *         {0, 0, 0, 0},    // 1층
         *         {0, 0, 0, 1},    // 2층
         *         {1, 0, 1, 0},
         *         {1, 0, 1, 1},
         *         {1, 1, 1, 1},
         * }
         */
        // 13-1 : 2층에 주차된 차량 수 출력
		count = 0;
		int[][] park = {{0, 0, 0, 0},    // 1층
		                  {0, 0, 0, 1},    // 2층
		                  {1, 0, 1, 0},
		                  {1, 0, 1, 1},
		                  {1, 1, 1, 1}};
		for(int i = 0; i< park[1].length; i++) {
			if(park[1][i] == 0) {
				count +=1;
			}
		}
		System.out.println(count);	
		
		count = 0;
        // 13-2 : 전체 남은 자리 수 출력
		for(int i = 0; i< park.length; i++) {//층수 
			for (int j = 0; j< park[i].length; j++) {// 주차자리
				if(park[i][j] == 1) {
					count +=1;
				}
			}
		}
		System.out.println("전체 남은 자리수:"+count);
		
		
		
		
	}
}