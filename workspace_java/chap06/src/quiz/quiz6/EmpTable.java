package quiz.quiz6;

import java.util.ArrayList;

public class EmpTable {
	
	ArrayList<Emp> Etable  = new ArrayList(); 
	
	void join(Emp emp) {
		Etable.add(emp);
		
	}
	
	void print(){
		for (int i= 0; i<Etable.size(); i++) {
			(  Etable.get(i)).info();
		}
	}
	
	void emp2000() {
		for (int i= 0; i<Etable.size(); i++) {
			if((Etable.get(i)).salary >= 2000)
			( Etable.get(i)).info();
		}
	}
	
	void manager(String name) {
		int mgr = 0;
		
		boolean flag1 = true;
		for (int i= 0; i<Etable.size(); i++) {
			if(Etable.get(i).name == name) {
			mgr =  ( Etable.get(i)).manageNo;
			flag1 =false;
			break;
			}	
		}
		for (int i= 0; i<Etable.size(); i++) {
			if((Etable.get(i)).EmpNo == mgr) {
				System.out.println((Etable.get(i)).name);
				break;
			}	
		}	
		if(flag1 == true) {
			System.out.println("잘못된 이름입니다.");
		}else if (flag1 == false && mgr == 0) {
				System.out.println("상사가 없습니다");
		}
	}	
	
}
