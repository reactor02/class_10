package sec06._package.pakc3;

import sec06._package.pakc1.Edu;
import sec06._package.pakc2.Access2;

public class AccessExam3 {


	public static void main(String[] args) {
	
	// public이 아니라서 생성 못함
//	new Access1(); 
		Access2 a2 = new Access2();
		new Edu();
		
//		a2.d1 = 10;
		a2.p1 = 100;
		
//		a2.d();
		a2.p();
		
//		a2.hp = 10;
	}
	

}
