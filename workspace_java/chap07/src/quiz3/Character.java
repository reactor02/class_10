package quiz3;

public class Character {

	String name;
	int hp;
	int ap;
	int dp;
	int weapon;
	int armor;
	
	int attack(){
		return weapon + ap + ((int) Math.random()* 10);
	}
	
	int defence() {
		System.out.println(armor + dp + " 방어력으로 피해를 경감했다");
		return armor + dp;
	}
	
	
	
}
