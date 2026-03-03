package quiz.quiz6;

import java.util.ArrayList;

public class EmpExam {
	
	public static void main(String[] args) {
		EmpTable etable = new EmpTable();
		Emp[] emp = new Emp[3]; 
		emp[0] = new Emp(1247, "Kar", "clerk", 1200, 5570 );
		emp[1] = new Emp(5570, "Marco", "clerk", 2500, 3333 );
		emp[2] = new Emp(3333, "John", "excutive", 8200, 0 );
	
		etable.join(emp[0]);
		etable.join(emp[1]);
		etable.join(emp[2]);
		
		etable.print();
		System.out.println();
		etable.emp2000();
		System.out.println();
		etable.manager("Marco");
	
	
	}
}
