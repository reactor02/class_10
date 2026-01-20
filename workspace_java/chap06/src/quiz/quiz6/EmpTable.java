package quiz.quiz6;

import java.util.ArrayList;

public class EmpTable {
	
	ArrayList Etable  = new ArrayList(); 
	
	void add(Emp Emp) {
		Etable.add(Emp);
	}
	
	void print(){
		for (int i= 0; i<Etable.size(); i++) {
			( (Emp) Etable.get(i)).info();
		}
	}
	
	void emp2000() {
		for (int i= 0; i<Etable.size(); i++) {
			if(((Emp)Etable.get(i)).salary >= 2000)
			( (Emp) Etable.get(i)).info();
		}
	}
	
	void manager(String name) {
		int a = 0;
		
		boolean flag1 = true;
		boolean flag2 = true;
		for (int i= 0; i<Etable.size(); i++) {
			if(((Emp)Etable.get(i)).name == name) {
			a =  ((Emp) Etable.get(i)).manageNo;
			flag1 =false;
			break;
			}	
		}
		for (int i= 0; i<Etable.size(); i++) {
			if(((Emp)Etable.get(i)).EmpNo == a) {
				System.out.println(((Emp)Etable.get(i)).name);
				break;
			}	
		}	
		if(flag1 == true) {
			System.out.println("잘못된 이름입니다.");
		}
		if(a == 0) {
			System.out.println("상사가 없습니다");
		}
	}	
	
}
