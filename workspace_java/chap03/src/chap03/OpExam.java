package chap03;

public class OpExam {

	public static void main(String[] args) {
		
		int x = 10;
		
		x++;
		System.out.println("x: " + x);
		
		x = 10;
		x = x + 1;
		//나한테 +1 해서 다시 나한테 저장할 때 줄여쓰는 형태
		x += 1; // 위와 같은 코드
		x++; // 위랑 같은 코드. 단, +1만 가능
		
		x = 10;
		++x;
		System.out.println("++x : " + x);
		
		x = 10;
		x--;
		--x;
		System.out.println("x: " + x);
		
		x = 10;
		int z = ++x;
		System.out.println("z: " + z);
		System.out.println("x: " + x);
		
		x = 10;
		z = x++;
		System.out.println("z: " + z);
		System.out.println("x: " + x);
		
		x= 10;
		System.out.println("x++: " + x++ + " x:" + x);
		
		x = 10;
		z = x++ + ++x;
		//10 + 12
		System.out.println(z);
		
		x = 1;
		z = x++ - --x *x++ - x--;
		// 0 1 
		// x : 1
		//1
		// x: 2
		//1
		// x:1
		// 
		// z = -2
		// x=1
		System.out.println(z);
		System.out.println(x);
		//나누기 할 때 0으로 나누지 않도록 조심
		int b = 10;
//		int c = b/0;
		double d = 7.3;
		double e = d/0;
		System.out.println(e);
		
		//나머지
		int f = 10 % 3;
		System.out.println(f);
		// 특징이 0부터 ~ 나머지 하는 숫자보다 하나 작은 것만 나온다
		
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
		
		//나머지 이용해서 풀어보시오
		int n = 149;
		int n1 = n % 10;
		int n10 = (n % 100 - n1)/10;
		int n100 = (n - n % 100)/100;
		
		System.out.println(n100);
		System.out.println(n10);
		System.out.println(n1);
		
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.0 == 0.1f);
		//소수점은 근사치로 저장된다
		//그나마 같은 타입으로 변환해서 비교하면 수월하다
		
		String s1 = "s1";
		String s2 = "s2";
		System.out.println(s1.equals(s2));
		//글씨는 무조건 equlas()로 비교한다.
		System.out.println("asdf".equals(s1));
		
		int c1 = 22;
		int c2 = 4;
		System.out.println("몫: " + c1/c2);
		System.out.println("나머지 : " + c1%c2 );
		
		//문제1
		//난 돈이 10000원 있습니다.
		//1.  4500원 짜리 쌍화차를 최대 몇 잔 마실 수 있는가?
		//2. 그리고 남는 돈은?
		
		int money = 10000;
		int tea = 4500;
		
		int number = money / tea;
		int change = money % tea;
		
		System.out.println(number);
		System.out.println(change);
		
		//문제 2
		//올영에서 꿀홍차가 8000원인데 
		//15% 세일! 그렇다면 가격은?
		
		int honeyTea = 8000;
		double sale = honeyTea * 0.15;
		double total = honeyTea - sale;
		int totalInt = (int) total;
		
		System.out.println(total);
		System.out.println(totalInt);
		
		//문제3-0
		//1234를 1200만 남기시오
		int number1 = 1234;
		number1 = number1 / 100 * 100;
		System.out.println(number1);
		
		//문제 3
		double v1 = 1000;
		double v2 = 794.0;
		// v1 / v2를 소수점 3째자리까지 출력해라.
		double total2 = v1 / v2;
		total2 = total2 * 1000;
		double total3 = (int) total2/ (double) 1000;
		
		System.out.println(total2);
		System.out.println(total3);
//		double total4 = (double) total3 / 1000;
//		System.out.println(total4);
		
		//문제 4
		//17000원이 있을 때
		//5천원 몇장
		//1천원 몇장
		
		int x1 = 17000;
		int y1 = 5000;
		int z1 = 1000;
		
		int solution1 = x1/y1;
		int solution2 = x1 % y1 / z1;
		
		System.out.println(solution1);
		System.out.println(solution2);
		
		
		
		int temp = 5;
		int temp2 = (++temp) + temp++;
		System.out.println(temp2);
				
	}

}
