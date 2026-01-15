package chap05;

public class 다차원배열Exam_03 {
	public static void main(String[] args) {
		
		int a0 = 5;
		int a1 = 15;
		int a2 = 34;
		
		//int 변수를 여러개 만듦
		int[] b0 = new int [3];
		b0[0] = a0;
		b0[1] = a1;
		b0[2] = a2;
//		b0[3] = 100;
		
		int[] b1 = new int [3];
		b1[0] = a0 +1;
		b1[1] = a1 +1;
		b1[2] = a2 +1;
		//b0과 b1을 배열로 만들기
		int[][] c0 = new int [2][3];
		c0[0] = b0;
		c0[1] = b1;
		
		System.out.println(c0[0][1] == a1);
		
		System.out.println(c0.length);
		System.out.println(c0[1].length);
//		System.out.println(c0[1][3]); //b1이 c의 범위 벗어나도 되는데 이유는 gpt한테 물어봐야함
		
		int[][]c1 = new int[][] { {1,2,3}, new int[]{4,5,6}};
		int[][] c2 = {
				{1,2,3},
				{4, 5, 6, 7}
		}; //	배열 초기화 선언
		
		//아래의 경우 null 배열
//		int[][] c0 = new int[2][];
//		c0[1] = new int [3];
		
		int[][] arr = new int [2][];
		// 가장 바깥 차원은 있어야 한다
		// heap에 공간은 만들어야 해서
		// 모두 null로 초기화
		// 참조 공간만 만들고 실제 배열은 나중에 만들기
		// 가변(비정형) 배열
		// 공간을 연속으로 잡지 않아서 고성능에서는 불리할 수 있다
		
		System.out.println(c0);
		System.out.println(c0[0]);
		System.out.println(c0[0][0]);
		
		
		
		int k1 = 10;
		int k2 = k1;
		System.out.println(k2);
		k1 = 5;
		System.out.println(k2);
		
		//	얕은 복사(call by reference)
		//	= 기호는 stack의 값(또는 주소)만 복사
		// 값을 변경하는 경우 원본도 바뀐다
		int[] d1 =	{1,2,3};
		int[] d2 = d1;
		
		System.out.println(d2[0]);
		d1[0] = 4;
		System.out.println(d2[0]);
		System.out.println(d2[2]);
		d2[2] = 40;
		System.out.println(d2[2]);
		
		//	깊은 복사(call by value)
		int [] d3 = new int[d1.length];
		for(int i = 0; i < d1.length; i++) {
			d3[i] = d1[i];
		}
		
		//	문제 1
		//	꼭 반복문 쓰기
		//	1~5, 11~15, 101~105를 저장하는 2차원 배열을 만드시오
		//	그리고 거기 말고 다른 반복으로 모두 출력하시오
		
		int[][] num = new int[3][5];
		int[][] num2 = new int[3][5];
//		for(int j=0; j < 6; j++) {
//			num[0][j] = j+1;
//			System.out.println(num[0][0]);
//		}
//	
//		for(int j=1; j < 6; j++) {
//			num[1][j] = j+11;
//			System.out.println(num[0][1]);
//		}
//		
//		for(int j=1; j < 6; j++) {
//			num[2][j] = j+101;
//			System.out.println(num[0][2]);
//		}
//		
		
//		for(int i=0; i< num.length; i++) {
//			if(i == 0 ) {
//				for(int j=0; j < num[i].length; j++) {
//					num[i][j] = j+1;
//				}
//			}
//			if(i == 1 ) {
//				for(int j=0; j < num[i].length; j++) {
//					num[i][j] = j+11;
//				}
//			}
//			if(i == 2 ) {
//				for(int j=0; j < num[i].length; j++) {
//					num[i][j] = j+101;
//				}
//			}
//		}
//		
//		
//		for(int i= 0; i<num.length; i++) {
//			for(int j = 0; j<num[i].length; j++) {
//				num2[i][j] = num[i][j];
//				System.out.println(num2[i][j]);
//			}
//		}

//		//	깜짝퀴즈
//		//	1,2,3,4,5를 넣으시오
//		int[] q1_1 = new int[5];
//		for (int i = 0; i<q1_1.length; i++) {
//			q1_1[i] = i+1;
//			
//		}
//		for (int i = 0; i<q1_1.length; i++) {
//			System.out.println("q1_1["+i+"]: " + q1_1[i]);
//		}
//		
//		// 2. 11~15까지
//		int[] q1_2 =new int[5];
//		for(int j=0; j < q1_2.length; j++) {
//			q1_2[j] = j+11;
//		}
//		// 3. 101~105
//		int[] q1_3 =new int[5];
//		for(int j=0; j < q1_3.length; j++) {
//			q1_3[j] = j+101;
//		}
//		
//		
//		//	4. 2차원 배열 채우시오
//		int[][] q1 = new int[][] {q1_1, q1_2, q1_3};
//		int[][] q1_4 = new int[3][5];
//		q1_4[0] = q1_1;
//		q1_4[1] = q1_2;
//		q1_4[2] = q1_3;
//		
////		for(int i = 0; i< q1_4.length; i++) {
////			for(int j = 0; j< q1_4[i].length; j++) {
////				System.out.println("q1_4["+i+"]["+j+"]" + q1_4[i][j]);
////			}
////	}
//		
////		for(int i = 0; i< q1_4.length; i++) {
////			if(i == 0) {
////				for(int j = 0; j< q1_4[i].length; j++) {
////					q1_4[i][j] = q1_1[j];
////				}
////			}
////			if(i == 1) {
////				for(int j = 0; j< q1_4[i].length; j++) {
////					q1_4[i][j] = q1_2[j];
////				}
////			}
////			if(i == 2) {
////				for(int j = 0; j< q1_4[i].length; j++) {
////					q1_4[i][j] = q1_3[j];
////				}
////			}
////		} // 규칙 찾기 위해서 만든 잔재
//		
//		for(int i = 0; i< q1_4.length; i++) {
//				q1_4[i] = q1[i];
//		}
//		
//		
//		// 2차원 배열 출력하시오
//		for(int i = 0; i< q1_4.length; i++) {
//			for(int j = 0; j< q1_4[i].length; j++) {
//				System.out.println("q1_4["+i+"]["+j+"]: " +q1_4[i][j]);
//			}
//		}
//		
//		for(int i=0; i< num.length; i++) {
//			for(int j = 0; j < 5; j++) {
//				num[i][j] = j+ 10;
//				System.out.println(num[i][j]);
//			}
//		}
//		i = 0 1 + 0
//		i = 1 1 + 10
//		i = 2 1 + 100
		
//		int[][][] ad1 = new int[3][4][5]; 
//		for(int i=0; i < ad1.length; i++) {
//			for(int j=0; j < ad1[i].length; j++) {
//				for(int k=0; k < ad1[i][j].length; k++) {
//					ad1[i][j][k] = k+1;
//				}
//			}
//		}
//		for(int i=0; i < ad1.length; i++) {
//			for(int j=0; j < ad1[i].length; j++) {
//				for(int k=0; k < ad1[i][j].length; k++) {
//					System.out.println("ad1[" +i+ "]["+j+"]["+k+"]: " + ad1[i][j][k]);
//				}
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
