package sec02;

import java.io.IOException;

public class ThrowsExam {
	public static void main(String[] args) {
		
			
		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		try {
			test2(12);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			if(e.getMessage().equals("화남")) {
				System.out.println("함 올라간다");
			}else if(e.getMessage().equals("덜 화남")) {
				System.out.println("함 참아본다");
			}
		}
		
		
		try {
			test3(11);
		} catch (LoveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void test() throws ClassNotFoundException, IOException {
			Class.forName("sec02.ThrowsExam");
		
	}
	
	static void test2(int vol) throws IOException {
		if(vol > 10) {
			throw new IOException("화남");
		} else if (vol > 7) {
			throw new IOException("덜 화남");
		}
	}
	
	static void test3(int vol) throws LoveException {
		if(vol > 10) {
			throw new LoveException("화남");
		} else if (vol > 7) {
			throw new LoveException("덜 화남");
		}
	}
	
	
}
