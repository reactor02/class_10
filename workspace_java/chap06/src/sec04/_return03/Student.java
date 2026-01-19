package sec04._return03;

public class Student {

	String name;
	int age;
	
	// setter
	// 필드 값을 수정하는 용도의 method
	// method name : set + field name(첫글자는 대문자)
	// argument : field type (only one)
	// return type : void
	
	// method name : setName
	// argument : String
	// return type : void
	void setName (String n) {
		if(name != null) {
			name = n;
		}
		
	}
	
	// getter
	// method name: get + field name (첫글자는 대문자)
	// argument : 없음
	// return type : field type
	
	String getName() {
		return name;
	}
	
}
