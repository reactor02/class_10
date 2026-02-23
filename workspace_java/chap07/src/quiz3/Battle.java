package quiz3;

public class Battle {
	
	String battle(Character p1, Character p2){
		int a1 = p1.attack();
		int d1 = p1.defence();
		int a2 = p2.attack();
		int d2 = p2.defence();
		
		while(true) {
			p2.hp -= a1 - d2;
			System.out.println(p2.name + "의 체력이"+p2.hp + "의 체력이 남았다");
			if(p2.hp <=0) {
				break;
			}
			p1.hp -= a2 - d1;	
			System.out.println(p1.name + "의 체력이"+p1.hp + "의 체력이 남았다");
			if(p1.hp <=0) {
				break;
			}
		}
		if(p2.hp <= 0) {
			return p1.name;
		}else{
			return p2.name;
		}
		
	}
}
