package quiz3;

public class Warriwor extends Character {
	
	Warriwor() {
		this.name = "warriwor";
		this.hp = 100;
		this.ap = 6;
		this.dp = 10;
		this.weapon = 10;
		this.armor = 5;
	}
	
	
	int attack(){
		int a =this.weapon + this.ap + ((int) (Math.random()* 10));
		System.out.println("전사가 " + a + "피해 물리공격");
		return a;
	}
	
}
