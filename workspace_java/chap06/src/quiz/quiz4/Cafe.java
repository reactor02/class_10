package quiz.quiz4;

public class Cafe {
	// 카페 창업
	// 상호, 필요자본금, 메뉴1, 메뉴2
	// 생성할 때 상호와 필요자본금을 꼭 입력해야 생성되도록
	// 그리고 생성과 동시에 메뉴1에는 "아아", 메뉴2는 "따아"
	
	String name;
	int capital;
	String menu1;
	String menu2;
	
	Cafe(String name, int capital){
		this.name = name;
		this.capital =capital;
		this.menu1 = "아아";
		this.menu2 = "따아";
	}
	
}
