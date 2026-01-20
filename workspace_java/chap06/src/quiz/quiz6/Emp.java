package quiz.quiz6;

public class Emp {
	int EmpNo;
	String name;
	String job;
	int salary;
	int manageNo;
	
	Emp(int EmpNo, String name, String job, int salary, int manageNo) {
		this.EmpNo = EmpNo;
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.manageNo = manageNo;
	}
	
	void info(){
		System.out.println("사원번호: "+EmpNo);
		System.out.println("사원이름: "+name);
		System.out.println("직책: "+job);
		System.out.println("연봉: "+salary);
		System.out.println("상사번호: "+manageNo);
	}
	
	
}
