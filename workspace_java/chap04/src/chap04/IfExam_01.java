package chap04;

import java.util.Scanner;

public class IfExam_01 {

	public static void main(String[] args) {

		int score = 95;
		
		boolean over90 = score >= 90;
		
		{
			System.out.println("항상 실행되는 실행 블럭");
		}
		if(over90) {
			System.out.println("90이상입니다.");
		}
		// if(over90) System.out.println("90이상입니다."); //한 줄만 있을 때는 {} 생략가능
		
		if(score < 90) {
			System.out.println("90 미만입니다.");
		}
		// 정반대일 경우 !(부정연산자)를 활욯나는 것도 좋다
		if( !(score >= 90) ) {
			System.out.println("90 미만입니다.");
		}
		
		
		if(score >= 90) {
			System.out.println("90이상입니다.");
		} else { //그렇지 않으면
			System.out.println("90 미만입니다.");
		}
		// else가 있으면 무조건 하나는 실행되는 게 보장된다.
		
		//97이면
		// 90이상
		// 95이상
		//92점이면
		// 90이상
		if(score >= 95){
			System.out.println("90이상입니다.");
			System.out.println("95이상입니다.");
		} else if (score >= 90)
			System.out.println( "90이상입니다");
		
		
		if(score >= 90){
			System.out.println("90이상입니다.");
			if (score >=95) 
				System.out.println("95이상입니다.");
		}
		
		if (score >= 90) {
			System.out.println("90이상");
		}
		//이전과 관계없이 부조건 다시 판단
		if (score >= 80 && score < 100) {
			System.out.println("80이상 100이하");
		}
		System.out.println("--------");
		
		
		if (score >= 90) {
			System.out.println("90이상");
//		} else if (score >= 80 && score < 90) {
		//위의 if나 else if가 거짓일 때만 판단한다
		} else if (score >= 80) {
			System.out.println("80이상 90미만");
		} else if (score >= 70) {
			System.out.println("70이상 80미만");
		} else {
			System.out.println("70미만");
		}
		
		//홀짝
		int x = 3;
		if (x%2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		double random1 = Math.random();
		System.out.println(random1);
		
		//	Math.random()
		// 	0.0 <= Math.random() < 1.0
		// 	0.0 ~ 0.999999999
		
		//	0과 1을 구하는(홀짝)
		// 	정교한 방식
		//	0.0 * 2 <= Math.random() * 2 < 1.0 * 2
		// 	0.0 ~ 1.999999999
		//	int로 형변환해서 정수만 남기기
		double rand2 = Math.random();//0 ~ 0.9999
		double temp1 = rand2 * 2;// 0~ 1.99999
		int result = (int) temp1;
		System.out.println("랜덤홀짝");
		if (result == 0) {
			System.out.println("짝수");	
		} else {
			System.out.println("홀짝");
		}
		//	1~6구하기 까지
		// 0*6 <= Math.random() < 1.0 * 0.6
		// int로 바꾸고
		//
		rand2 = Math.random();
		double temp2 = rand2 * 6; // 0 ~ 5.9999999
		int result0 = (int) temp2; // 0~5
		result = result0 + 1; // 1~6
		System.out.println(result);
		
		//5~10까지 구하기
		//0~5 구해서 +5
		
		rand2 = Math.random();
		temp2 = rand2 * 6; // 0 ~ 5.9999999
		result0 = (int) temp2; // 0~5
		result = result0 + 5; // 5~10
		System.out.println(result);
		
		//5~12까지 구하기
		//0~7 구해서 +5
		int min = 5;
		int max = 12;
		rand2 = Math.random();
		temp2 = (int) (rand2 *(max - min + 1)) + min;
		
		//쉬운 방식
		rand2 = Math.random();
		temp2 = rand2 * 100000;
		result0 = (int) temp2;
		result = result % 8 + 1;
		
		//로또 번호
		// 1~45까지 6개의 숫자를 랜덤으로 뽑아서 제출 하시오
		// 단, 중복이 없이 뽑아야한다.
		
		min = 1;
		max = 45;
		double random3 = Math.random();
		int resultLotto = (int) (random3 * (max - min + 1) + 1);
		System.out.println(resultLotto);
		
		min = 1;
		max = 45;
		random3 = Math.random();
		resultLotto = (int) (random3 * (max - min + 1) + 1);
		System.out.println(resultLotto);
		min = 1;
		max = 45;
		random3 = Math.random();
		resultLotto = (int) (random3 * (max - min + 1) + 1);
		System.out.println(resultLotto);
		min = 1;
		max = 45;
		random3 = Math.random();
		resultLotto = (int) (random3 * (max - min + 1) + 1);
		System.out.println(resultLotto);
		min = 1;
		max = 45;
		random3 = Math.random();
		resultLotto = (int) (random3 * (max - min + 1) + 1);
		System.out.println(resultLotto);
		min = 1;
		max = 45;
		random3 = Math.random();
		resultLotto = (int) (random3 * (max - min + 1) + 1);
		System.out.println(resultLotto);
		min = 1;
		max = 45;
		
		
		
		
//		//임의의 수를 입력받아
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		double inputData2 = Double.parseDouble(inputData);
//		//문제1
//		//"양수", 0, "음수" 판단하여 출력
//		if (inputData2 > 0) {
//			System.out.println("양수");
//		}else if (inputData2 == 0) {
//			System.out.println("0");
//		}else if (inputData2 < 0) {
//			System.out.println("음수");
//		}
//		//문제2
//		//홀수인지 짝수인지 판단하여 출력
//		inputData = scanner.nextLine();
//		inputData2 = Integer.parseInt(inputData);
//		if (inputData2 % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//		//문제3
//		//임의의 두 수 x, y를 받습니다.
//		//둘 중에 큰 값을 출력
//		inputData = scanner.nextLine();
//		inputData2 = Double.parseDouble(inputData);
//		String inputData3 = scanner.nextLine();
//		double inputData4 = Double.parseDouble(inputData3);
//		
//		if (inputData2 > inputData4) {
//			System.out.println(inputData2);
//		} else if(inputData2 < inputData4) {
//			System.out.println(inputData4);
//		} else {
//        System.out.printf("%d와 %d, 두 수는 같습니다." inputData2, inputData4);
//    	}
//		//문제4
//		//임의의 money를 입력받아서
//		//7000원 이상이면 "택시타자" 출력
//		//7000~3000 사이면 "버스타자" 출력
//		//3000 미만이면 "걸어가자" 출력
//		inputData = scanner.nextLine();
//		int money = Integer.parseInt(inputData);
//		if (money >= 7000) {
//			System.out.println("택시타자");
//		} else if(money >= 3000) {
//			System.out.println("버스타자");
//		} else if(money < 3000) {
//			System.out.println("걸어가자");
//		}
//		
		//문제5
		// "가위", "바위", "보" 입력 받아서
		//5-1 컴퓨터는 항상 "바위"만 낼 경우
//		inputData = scanner.nextLine();
//		if (inputData.equals("가위")) {
//			System.out.println("졌다");
//		}else if(inputData.equals("바위")) {
//			System.out.println("비겼다");
//		}else if(inputData.equals("보")) {
//			System.out.println("이겼다");
//		}
//		
		
		//5-2 컴퓨터도 random으로 
		//"이겼다", "비겼다", "졌다" 출력
		//랜덤을 쓰고. 123중에 하나가 나오게 한다.
		//123이랑 비교해서 값을 이용해서 가위바위보를 나오게한다.
		//1 == 가위 2 == 바위 3== 보 
//		inputData = scanner.nextLine();
//		int min1 =1;
//		int max1 =3;
//		double game = Math.random();
//		int result4 = (int) game * (max1 - min1 + 1) + min;
//		if (inputData.equals("가위") && result4 == 1) {
//			System.out.println("컴퓨터: 가위");
//			System.out.println("비겼다");
//		}else if (inputData.equals("가위") && result4 == 2) {
//			System.out.println("컴퓨터: 바위");
//			System.out.println("졌다");
//		}else if (inputData.equals("가위") && result4 == 3) {
//			System.out.println("컴퓨터: 보");
//			System.out.println("이겼다");
//		}
//		if (inputData.equals("바위") && result4 == 1) {
//			System.out.println("컴퓨터: 가위");
//			System.out.println("이겼다");
//		}else if (inputData.equals("바위") && result4 == 2) {
//			System.out.println("컴퓨터: 바위");
//			System.out.println("비겼다");
//		}else if (inputData.equals("바위") && result4 == 3) {
//			System.out.println("컴퓨터: 보");
//			System.out.println("졌다"); //여기까지 함.
//		}
//		if (inputData.equals("보") && result4 == 1) {
//			System.out.println("컴퓨터: 가위");
//			System.out.println("졌다");
//		}else if (inputData.equals("보") && result4 == 2) {
//			System.out.println("컴퓨터: 바위");
//			System.out.println("이겼다");
//		}else if (inputData.equals("보") && result4 == 3) {
//			System.out.println("컴퓨터: 보");
//			System.out.println("비겼다");
//		}
		
//		여기까지가 180번 Scanner scanner = new Scanner(System.in); 살려서 쓴 곳임
				
		//문제6
		//임의 세 수 x, y, z를 받아서
		//z가 x~y 사이에 있는지 (포함) 판단
//		Scanner scanner = new Scanner(System.in);
//		String inputData1 = scanner.nextLine();
//		double x1 = Double.parseDouble(inputData1);
//		String inputData2 = scanner.nextLine();
//		Double y1 = Double.parseDouble(inputData2);
//		String inputData3 = scanner.nextLine();
//		Double z1 = Double.parseDouble(inputData3);
//		if (z1 >= x1 && z1 <= y1) {
//			System.out.println("x1 <= z1 <= y1");
//		}else if(z1 >= y1 && z1 <= x1) {
//			System.out.println("y1 <= z1 <= x1");
//		}else {
//			System.out.println("포함 안됩니다");
//		}
		
		//문제7
		//월을 입력 받아서
		//계절 출력
		// 13, -1등 입력하면 "정확히 입력해주세요." 출력
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		if (inputData.equals("1월") || inputData.equals("2월") || inputData.equals("3월")) {
//			System.out.println("봄");
//		}else if (inputData.equals("4월") || inputData.equals("5월") || inputData.equals("6월")) {
//			System.out.println("여름");
//		}else if (inputData.equals("7월") || inputData.equals("8월") || inputData.equals("9월")) {
//			System.out.println("가을");
//		}else if (inputData.equals("10월") || inputData.equals("11월") || inputData.equals("12월")) {
//			System.out.println("겨울");
//		}else {
//			System.out.println("정확히 입력해주세요.");
//		}
		//문제8
		//임의의 수를 입력받아서 다음과 같이 출력
		//예:125	
		//입력한 수는 100보다 크고, 양수이고, 홀수입니다.
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		int num = Integer.parseInt(inputData);
//		int oddEven = num % 2;
//		if (num > 100 && num > 0 && oddEven == 1) {
//			System.out.println("입력한 수는 100보다 크고, 양수이고, 홀수입니다.");
//		}else if (num > 100 && oddEven == 0 ){
//			System.out.println("입력한 수는 100보다 크고, 양수이고, 짝수입니다.");
//		}else if (num <= 100 && num > 0 && oddEven == 1) {
//			System.out.println("입력한 수는 100보다 작고, 양수이고, 홀수입니다.");
//		}else if (num <= 100 && num > 0 && oddEven == 0) {
//			System.out.println("입력한 수는 100보다 작고, 양수이고, 짝수입니다.");
//		}
//		else if (num == 0) {
//			System.out.println("입력한 수는 100보다 작고, 0이고, 짝수입니다.");
//		}else if (num < 0 && oddEven == -1) {
//			System.out.println("입력한 수는 100보다 작고, 음수이고, 홀수입니다.");
//		}else if (num < 0 && oddEven == 0) {
//			System.out.println("입력한 수는 100보다 작고, 음수이고, 짝수입니다.");
//		}
		
		//문제9
		//온도를 입력받아서 다음과 같이 출력
		//예 : -3
		//영하 3도 입니다
		//예 : 5
		//영상 5도 입니다
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		int tem = Integer.parseInt(inputData);
//		if (tem > 0) {
//			System.out.println("영상 " + tem + "도 입니다.");
//		}else if (tem == 0) {
//			System.out.println(tem +"도 입니다");
//		}else {
//			System.out.println("영하 " + tem * -1 + "도 입니다.");
//		}
				
		//응용문제
		//문제10
		//시, 분을 입력 받아서 35분 후의 시, 분을 출력
		// 3, 51을 입력받으면
		//4시 26분 출력
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		int hour = Integer.parseInt(inputData);
//		String inputData2 = scanner.nextLine();
//		int min1 = Integer.parseInt(inputData2);
//		min1 = min1 + 35;
//		if (min1 >= 60 && hour < 24) {
//			min1 = min1 - 60;
//			hour = hour + 1;
//			System.out.println(hour + "시 " + min1 + "분" );
//		}else if (min1 < 60 && hour < 24) {
//			System.out.println(hour + "시 " + min1 + "분");
//			
//		}else if (min1 >= 60 && hour >= 24) {
//			min1 = min1 - 60;
//			hour = hour - 23;
//			System.out.println(hour + "시 " + min1 + "분");
//		}else if (min1 < 60 && hour >= 24) {
//			hour = hour - 24;
//			System.out.println(hour + "시 " + min1 + "분");
//		}
		
		//문제 10을 %를 써서 푼다면
		//hour1 = (hour * 60 + min +35) / 60
		//min1 = (hour * 60 + min + 35) % 60
		//hour1이 24시간 미만은 hour1 +"시" + min1 + "분"
		//hour1이 24시간 이상은 (hour1-24) +"시" +min1 + "분"
		
		
		//문제11
		//두자리 숫자를 입력받아서
		//10의 자리와 1의 자리가 같은지 판단
		// 예 : 77 => 같음, 94 => 다름
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		int num = Integer.parseInt(inputData);
//		int num1 = num % 10;
//		int num10 = (num - num1)/10;
//		if (num10 == num1) {
//			System.out.println("같음");
//		} else {
//			System.out.println("다름");
//		}
		
		//문제 12
		//1~99까지 369게임
		//임의의 수를 받아서 3,6,9 숫자가 있으면 "박수" 출력
		//예 : 33=>박수, 31=>박수, 12=>12, 14=>14
//		int min0 = 1;
//		int max0 = 99;
//		double random22 = Math.random();
//		int random369 = (int) (random22 * (max0 - min0 +1) + min0);
//		int num = random369;
//		int num1 = num % 10;
//		int num10 = (num - num1)/10;
//		if (num1 % 3 == 0 || num10 % 3 == 0) {
//			System.out.println(num);
//			System.out.println("박수");
//		} else {
//			System.out.println(num);
//		}
		
		
		//문제13
		// 사각형의 한쪽 모서리 : x1:10, y1:20
        // 반대편 모서리 : x2:90, y2:100
		//입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가?

//		double x1 = 10;
//		double x2 = 90;
//		double y1 = 20;
//		double y2 = 100;
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		double x3 = Double.parseDouble(inputData);
//		inputData = scanner.nextLine();
//		double y3 = Double.parseDouble(inputData);
//		if ((x3 >= x1 && x3 <= x2) && (y3 >=y1 && y3 <=y2)) {

	}

}
