package chap02;

public class TypeCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 10;
		
		//여기서 ()는 형변환 연산자
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		// 여기() 우선 순위 연산자
		int a = 2 * ( 3 + 4);
		
		intValue = 200;
		byteValue = (byte)intValue;
		//정확히는 비트를 2의 보수로 계산한 결과가 나온다.
		//즉 예상하기 힘들다.
		System.out.println(byteValue);
		
		double d1 = 3.14;
		float f1 = (float) d1;
		System.out.println(f1);
		
//		long l1 = (long) 2200000000; 변수가 아닌 숫자는 인트로 먼저 계산되어서 안됨
		
		double d2 = -3.14;
		int il = (int) d2;
		System.out.println(il);
		
		// 작은 것에서 큰 것으로 변환할 때 
		// 형변환 생략 가능
		int i2 = 100;
		long l2 = (long) i2;
		long l3 = i2;
		
		int i3 = 2100000000;
		int i4 = 2100000000;
		int i5 = i3  + i4;
		System.out.println(i5); // i5: -94967296
		
		int i6 = 10;
		long l6 = 4L;
//		int i7 = i6 + l6;
		long l7 = i6 + l6;
		// int는 long으로 자동 형변환이 된다.
		// int + long 연산 시 int가 long이 되고 결과도 long이 된다.
		
		int i7 = 10;
		double d7 = 5.5;
		double d8 = i7 + d7;
		System.out.println("d8: " + d8);
		
		double d9 = 10/ 4;
		
		System.out.println(d9);
		double d10 = 10.0/ 4;
		System.out.println(d10);
//		double d10 = (double) 10 / (double)4;
		double d11 = (double) 10 / 4;
		System.out.println(d11);
		
		int math1 = 10;
		int math2 = 7;
		
		//산술 연산자로 계산을 할 때 byte, short,char은 int로 casting이 됨.
		//연산 결과값에 casting을 줘야지만 int 아래의 타입에 할당 가능.
		byte d123 = (byte) ((byte) math1/ (byte) math2);
	}	

}
