package sec06._package.pakc1;

public class Access1 {

	Access1 (){
		System.out.println("Access1 constructor excution");
	}
}

// 다른 패키지에서 안 보이는 class
class Access3 {
	// 다른 패키지에서 사용할 기회도 없다
	public Access3() {
		
	}
}