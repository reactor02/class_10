package quiz3;

public class Mage extends Character {
	
	Mage(){
		this.name = "mage";
		this.hp = 100;
		this.ap = 11;
		this.dp = 5;
		this.weapon = 4;
		this.armor = 2;
	}
	
	
	int attack(){
		int a =this.weapon + this.ap + ((int) (Math.random()* 10));
		System.out.println("마법사가 " + a + "피해 마법공격");
		return a;
	}
	
}
