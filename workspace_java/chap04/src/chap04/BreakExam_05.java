package chap04;

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
	}
}
