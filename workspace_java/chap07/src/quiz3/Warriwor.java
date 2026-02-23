package quiz3;

public class Warriwor extends Character {
	
	Warriwor() {
		this.name = "warriwor";
		this.hp = 1000;
		this.ap = 6;
		this.dp = 10;
		this.weapon = 10;
		this.armor = 5;
	}
	
	
	int attack(){
		System.out.println(this.weapon + this.ap + ((int) (Math.random()* 10)) + "피해 물리공격");
		return this.weapon + this.ap + ((int) (Math.random()* 10));
	}
	
}
