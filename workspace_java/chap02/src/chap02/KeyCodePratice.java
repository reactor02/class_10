package chap02;

import java.util.Scanner;

public class KeyCodePratice {
	
	public static void main(String[] args) {
		int keyCode;
		
//		try {
//			System.out.println("숫자를 입력하세요.");
//			keyCode = System.in.read();
//			System.out.print(keyCode);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//		Scanner scanner = new Scanner(System.in);
//		String inputData = scanner.nextLine();
//		System.out.println(inputData);
//		inputData = scanner.next();
		
		// 문제
		// 나이를 입력하고 +1해서 출력
		
		System.out.println("나이를 입력해주세요");
		Scanner age = new Scanner(System.in);
		String inputData = age.nextLine();
		int age2 = Integer.parseInt(inputData);
		System.out.println(age2 + 1);
		
		int x = 212;
		double y = x / (double) 10;
		double z = x / 10.0; 
		
		System.out.println(y);
		System.out.println(z);
	}
}
