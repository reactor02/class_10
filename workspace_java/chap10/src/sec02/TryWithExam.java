package sec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithExam {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\test.txt");

			// 뭔가 할꺼야
			System.out.println("뭔가함");
			// 하다가 예외 발생할 수 있다

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

		}
		
		// try(){}catch{}는 close() 안 써도 알아서 닫힘
		try(
				FileInputStream fis2 = new FileInputStream("c:\\test.txt");			
		){
			System.out.println("뭔가함");
			System.out.println(fis2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
