package chap02;

import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.print(3);
		System.out.print(4);
		
		System.out.println(5);
		System.out.println(); //<br>처럼 걍 엔터 
		System.out.println(6);
		System.out.println("------------------");
		
		String name = "이왕재";
		int age = 34;
		System.out.printf("이름: %s, 나이: %d\n", name, age);
		System.out.println(123);
		/////////////////////
		//입력
		int keyCode;
		
		
		// scanner 연습하려고 주석 처리
//		try {
//			System.out.print("입력하시오 >> ");
//			keyCode = System.in.read();
//			System.out.println("keyCode: " + keyCode);
//			
//			keyCode = System.in.read();
//			System.out.println("keyCode: " + keyCode);
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//이클립스 단축키
		/*
		 * 한줄 지우기 : Ctrl + d
		 * 한줄 복사 : ctrl + Alt + 위 아래 방향키
		 * 한줄 이동 : Alt + 위 아래 방향
		 * 주석 단축키: Ctrl + /
		 * 자동 정렬 : Ctrl + Shift + f
		 * import 자동 : Ctrl + Shift + o
		 */
		Scanner scanner = new Scanner(System.in);
//		엔터까지의 모든 글씨
//		String inputData = scanner.nextLine();
//		System.out.println(inputData);
//		엔터쳤을 때 첫번째 띄어쓰기까지만 
//		inputData = scanner.next();
//		System.out.println(inputData);
		
		// 문제
		// 나이를 입력하고 +1해서 출력
		
		System.out.println("나이를 입력하세요.");
//		String age2 = scanner.nextLine();
//		int age3 = Integer.parseInt(age2);
		
		int age3 = scanner.nextInt();
		System.out.println("내년에" + (age3 + 1) + "살입니다.");
	
		
		
	}

}
