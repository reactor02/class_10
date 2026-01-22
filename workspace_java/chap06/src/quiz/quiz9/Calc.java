package quiz.quiz9;

import java.util.ArrayList;

public class Calc {
	int x;
	int y;
	ArrayList <String> log = new ArrayList<>();
	
//	int calc(int x, int y, String m){
//		return x-y;
//	}
//	int calc(int x, int y, String p){
//		return x+y;
//	}
//	int calc(int x, int y, String m){
//		return x*y;
//	}
//	int calc(int x, int y, String m){
//		return x/y;
//	}
	
	String operation(int x,  String m, int y) {
		String result = null;
		String a = null;
		if(m.equals("-")) {	
			a = String.valueOf(x-y);
		} else if(m.equals("+")) {
			a = String.valueOf(x+y);
		} else if(m.equals("*")) {
			a = String.valueOf(x*y);
		} else if(m.equals("/")) {
			if(0 != y) {
				a = String.valueOf((double)x/y);
			} else {
				System.out.println("0으로 나눌 수 없습니다."); 
			}	
		} 
		result = a;
		log.add(x+ m +y+"="+ (a));
		if(result != null) {
			return result;
		} else {
			return "연산자를 정확히 입력해주세요";
		}
		
	}
	String operation(double x,  String m, int y) {
		if(m.equals("-")) {
			log.add(x+"-"+y+"="+ (x-y));
			return String.valueOf(x-y);
		} else if(m.equals("+")) {
			log.add(x+"+"+y+"="+ (x+y));
			return String.valueOf(x+y);
		} else if(m.equals("*")) {
			log.add(x+"*"+y+"="+ (x*y));
			return String.valueOf(x*y);
		} else if(m.equals("/")) {
			if(0 != y) {
				log.add(x+"/"+y+"="+ ((double)x/y));
				return String.valueOf((double)x/y);
			} else {
				return "0으로 나눌 수 없습니다.";
			}
		} else {	
			return "연산자를 정확히 입력해주세요";
		}
	}
	String operation(double x,  String m, double y) {
		if(m.equals("-")) {
			log.add(x+"-"+y+"="+ (x-y));
			return String.valueOf(x-y);
		} else if(m.equals("+")) {
			log.add(x+"+"+y+"="+ (x+y));
			return String.valueOf(x+y);
		} else if(m.equals("*")) {
			log.add(x+"*"+y+"="+ (x*y));
			return String.valueOf(x*y);
		} else if(m.equals("/")) {
			if(0 != y) {
				log.add(String.valueOf(x+"/"+y+"="+ ((double)x/y)));
				return String.valueOf((double)x/y);
			} else {
				return "0으로 나눌 수 없습니다.";
			}
		} else {	
			return "연산자를 정확히 입력해주세요";
		}
	}
	
	void logcheck() {
		for(int i = 0; i<log.size(); i++) {
			System.out.println((i+1)+"번 연산: "+this.log.get(i));
		}
	}
}
