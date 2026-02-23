package sec01.override;

public class Computer extends Calc {
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer의 areaCircle excution");
		return Math.PI * r * r;
	}
	
	@Override
	public int plus (int x, int y) {
		System.out.println("Computer의 plus excution");
		int result = super.plus(x, y);
		return result;
	}
}
