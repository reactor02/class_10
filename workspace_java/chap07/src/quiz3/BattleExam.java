package quiz3;

public class BattleExam {

	public static void main(String[] args) {
		Mage m = new Mage();
		Warriwor w = new Warriwor();
		Battle battle = new Battle();
		
		System.out.println("승자" + battle.battle(m, w));
	}

}
