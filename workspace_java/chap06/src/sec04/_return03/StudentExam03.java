package sec04._return03;

public class StudentExam03 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "John";
		s1.age  = 15;
		
		s1.name = null;
		s1.age  = -25;
		
		s1.setName("중국");
		String name = s1.getName();
		System.out.println("이름"+ name);
		
		
	}

}
