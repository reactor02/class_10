package quiz.quiz6;

import java.util.ArrayList;

public class EmpExam {
	
	public static void main(String[] args) {
		EmpTable etable = new EmpTable();
		Emp emp1 = new Emp(1247, "Kar", "clerk", 1200, 5570 );
		Emp emp2 = new Emp(5570, "Marco", "clerk", 2500, 3333 );
		Emp emp3 = new Emp(3333, "John", "excutive", 8200, 0 );
	
		etable.add(emp1);
		etable.add(emp2);
		etable.add(emp3);
		
		etable.print();
		System.out.println();
		etable.emp2000();
		System.out.println();
		etable.manager("John");
	
	
	}
}
