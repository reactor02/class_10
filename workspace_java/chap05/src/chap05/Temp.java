package chap05;

public class Temp {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int[][] a = new int[][]{ {90, 85, 70}, {88, 92, 80}, {75, 60, 95} };
		int[][] max = new int[][] {{90}};
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if (a[i][j] > max[0][0]){
					max[0][0] = a[i][j];
					x = i;
					y = j;
					System.out.println(max[0][0]);
				}
			}	
		}
		System.out.println(max[0][0]);
		System.out.println(x);
		System.out.println(y);
			
	}

}
