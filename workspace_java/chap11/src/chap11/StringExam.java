package chap11;

public class StringExam {

	public static void main(String[] args) {
		System.gc();

		String s1 = "영일이삼사오육칠팔구삼사";

		char c = s1.charAt(1);
		System.out.println(c);
		c = 'c';

		int i1 = s1.indexOf("삼사");
		System.out.println(i1);

		int i2 = s1.indexOf("삼오");
		System.out.println(i2); // 없으면 -1

		int i3 = s1.lastIndexOf("삼사");
		System.out.println(i3);

		String email = "todair@naver.com";
		// 이메일 양식 점검
		// @하나 .하나 있는가?

		if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
			System.out.println("이메일");
		} else {
			System.out.println("이메일아님");
		}

		int index = -1;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				index = i;
				break;
			}
		}

		String s2 = s1.replace("삼사", "34");
		System.out.println(s1);
		System.out.println(s2);
		// replace는 모두 바꿔준다

		String s3 = s1.substring(5, 8);
		System.out.println(s3);

		// 문제 1
		// 아까 email에서 id만 출력
//		email.indexOf('@');
		String aa = email.substring(0, email.indexOf('@'));
		System.out.println(aa);

		// 문제 2
		// 123456-1234567
		// 성별 출력하기
		String adr = "123456-1234567";
//		adr.indexOf('-');
		String bb = adr.substring(adr.indexOf('-') + 1, adr.indexOf('-') + 2);
		System.out.println(bb);
		if (bb.equals("1") || bb.equals("3") || bb.equals("5")) {
			System.out.println("남자입니다");
		} else {
			System.out.println("여자입니다");
		}

		String s4 = "    글 to the 씨   ";
		System.out.println("[" + s4.trim() + "]");

		String menu = "유빈 : 제육덮밥, 심슨 : 짜장, 찬솔 : 짬뽕";

		// regex 정규표현식 약자
		String[] menus = menu.split(", ");
		for (String m : menus) {
			System.out.println(m);
		}

		String url = "blog.naver.com";
		// split의 전달인자는 정규표현식을 사용
		// 단순한 String이 아님에 주의
		// .은 정규 표현식의 예약어
//		String[] urls = url.split(".");
//		String[] urls = url.split("\\.");// .을 표현하는 방법1
		String[] urls = url.split("[.]");// .을 표현하는 방법2

		for (String m : urls) {
			System.out.println(m);
		}

		String str1 = "" + 10;
		String str2 = String.valueOf(10);

		String a = "a";
		a += "b";
		a = a + c;
		// StringBuffer
		// 메모리를 효율적으로 사용한다
		// 스레드에 안전하다(Thread-safe)
		StringBuffer sb = new StringBuffer("a");
		sb.append("b");
		sb.append("c");
		System.out.println(sb);
		String d = sb.toString();

		// StringBuffer보다 쬐끔 빠름
		// 스레드에 안전하지 않다
		StringBuilder sb2 = new StringBuilder("a");
		sb.append("b");
		sb.append("c");

		int vol = -3;
		if (vol < 0) {
			vol = 0;
		}

		vol = Math.max(0, Math.min(10, vol));
		
	}

}
