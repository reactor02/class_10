package sec01;

public class ExtendsExam {
	
	String name ="Child의 name";

	public static void main(String[] args) {
		
		Child child = new Child();
		System.out.println("------------");
		child.printName();
//		 Child를 통해서 부모인 Parent 필드에 접근가능
		System.out.println("child.name" + child.name);
//		 Child를 통해서 부모인 Parent 메소드에 접근가능
		String n = child.getName();
		System.out.println("child.getName() :" + n);
		
	
		
	}
	

}
