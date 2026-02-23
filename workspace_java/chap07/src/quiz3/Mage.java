package quiz3;

public class Mage extends Character {
	
	Mage(){
		this.name = "mage";
		this.hp = 1000;
		this.ap = 11;
		this.dp = 5;
		this.weapon = 4;
		this.armor = 2;
	}
	
	
	int attack(){
		System.out.println(weapon + ap + ((int) (Math.random()* 10)) + "피해 마법공격");
		return weapon + ap + ((int) (Math.random()* 10));
	}
	
}
