package chap02;

public class VarTypeExam {

	public static void main(String[] args) {
		
		byte b1;
		b1 = 127;
		System.out.println("b1: " + b1);
//		b1 = 128;
		
		char c1 = 65;
		System.out.println("c1: " + c1);
		char c2 = 65 + 2;
		System.out.println("c2: " + c2);
		char c3 = 'B';
		System.out.println("c3 - c1: " + (c3 - c1));
		
		//L또는 l을 붙이면 명시적인 long
		long l1 = 22000000000L;
		long l2 = 31;
		
		String s1 = "이 왕 재";
		System.out.println("s1: " + s1);
		
		String s2 = "이 \"왕 재";
		System.out.println("s2: " + s2);
		String s3 = "\\이 \t왕 \n재";
		System.out.println(s3);
		
		System.out.println("글씨" + 3);
		System.out.println("글씨" + 3 + 2); //글씨 32가 출력된다
		System.out.println("글씨" + (3 + 2)); //글씨 5가 출력된다
		System.out.println(3 + 2 + "글씨"); //5 글씨가 출력된다
		
		float f1 = 3.14f;
		System.out.println("f1: " + f1);
		double d1 =3.14;
		System.out.println(d1);
		
		float f2 = 0.1234567890123f;
		System.out.println("f2: " + f2);
		//float의 정밀도 : 소수점 7자리
		
		double d2 = 0.123456789012345678901234567890;
		System.out.println("d2: " + d2);
		//double의 정밀도 : 소수점 16자리
		
		double d3 = 5e3;
		System.out.println("d3: " + d3);
		
		boolean stop = true;
		boolean start = false;
		System.out.println("stop: " + stop);
		// 문제1 
		// 내 나이를 저장합니다
		
		int age = 35;
		System.out.println(age);
		
		// 문제2
		// 운전 면허가 있다 없다.
		
		boolean license_true = true;
		System.out.println(license_true);
		boolean license_false = false;
		System.out.println(license_false);
		
		//문제3
		//우리 집에 있는 스마트폰의 개수
		
		int NumberOfsmartphone = 1;
		System.out.println(NumberOfsmartphone);
		
		//문제4
		//내 이름
		
		String name = "이왕재";
		System.out.println(name);
				
		//문제 5
		// 1평은 3.3 제곱미터입니다.
		// 5평이 몇 제곱인지 계산해서 저장
		
		double unitSqure = 3.3;
		unitSqure = unitSqure * 5;
		System.out.println(unitSqure);
		
		//	문제6
		//	1-1 : 두 변수 x, y에 각각 숫자를 넣고
		//	출력 결과 : "3 > 4 결과는 false 입니다."
		
		int x = 3;
		int y = 4;
		boolean z = x > y;
		System.out.println(z);
		System.out.println(x + " > " + y + " 결과는 " + z + " 입니다.");
		
		//	6-2: x, y의 값을 바꿔서 정답이 나오는지  출력
		x = 4;
		y = 3;
		z = x > y;
		System.out.println(x + " > " + y + " 결과는 " + z + " 입니다.");
		// 문제 7
		/*
		 * 숫자 149
		 * --------
		 * 출력결과
		 * --------
		 * "백의 자리 : 1"
		 * "십의 자리 : 4"
		 * "일의 자리 : 9"
		 *
		 */
		int num = 149;
		
		int n100 = num/100;
		System.out.println(n100);
		int n10 = num/10 - num/100 * 10;
		System.out.println(n10);
		int n1 = num/1 - num/10 *10;
		System.out.println(n1);
		
		System.out.println("백의 자리: " + n100);
		System.out.println("십의 자리: " + n10);
		System.out.println("일의 자리: " + n1);
		
		//문제 8
		//회식비 43000원
		//참석인원 4명
		//인당 얼마?
		//8-1 : 디테일하게 원단위까지
		int cost = 43000;
		int people = 4;
		int pay1 = cost/people;
		System.out.println(pay1 + "원");
		//8-2 : 만원 단위까지만 받습니다.
		int pay2 = pay1/10000 * 10000 ;
		System.out.println(pay2 + "원");
		//8-3 : 주최자는 얼마를 내야하는가?
		int pay3 = cost/10000 * 10000 - pay2 * 3 + (cost/1000 - cost/10000 * 10) *1000;
		System.out.println(pay3 + "원");
		pay3 = cost - pay2 * (people - 1);
		System.out.println(pay3 + "원");
		
		//문제 9
		String left = "오예스";
		String right = "사탕";
		
		String t1 = left;
		String t2 = right;
		
		left = t2;
		right = t1;
		
		System.out.println("left: " + left);
		System.out.println("right: " + right);
		
		left = "오예스";
		right = "사탕";
		
		t1 = left;
		left = right;
		right =t1;
		
		System.out.println("left: " + left);
		System.out.println("right: " + right);		
		//뭔가 하기
		
		// 문제 7
				/*
				 * 숫자 149
				 * --------
				 * 출력결과
				 * --------
				 * "백의 자리 : 1"
				 * "십의 자리 : 4"
				 * "일의 자리 : 9"
				 *
				 */
		
	
	}

}
