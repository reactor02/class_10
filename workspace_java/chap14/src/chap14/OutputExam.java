package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {

		String path = "C:\\tmp";
		String fileName = "secret.txt";

//		String fullFileName = path +"\\"+ fileName;
		String fullFileName = path + System.getProperty("file.separator") + fileName;

		OutputStream os = null;

		try {
			// stream open
			os = new FileOutputStream(fullFileName);

			// file에 쓸 data
			String data = "엔터는\n123\nhellow2";
			byte[] datas = data.getBytes();

			// 쓰기(덮어쓰기)
			os.write(datas, 0, datas.length);

			// 버퍼에 남은 데이터 모두 출력
			os.flush();

			// stream close
//			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
	
	void saveTxt(String data) {
		// try-with-resource
		// close()를 자동으로 해줌
		
		String path = "C:\\tmp";
		String fileName = "secret.txt";

//		String fullFileName = path +"\\"+ fileName;
		String fullFileName = path + System.getProperty("file.separator") + fileName;

		
		try(OutputStream os = new FileOutputStream(fullFileName);){
			
			byte[] datas = data.getBytes();

			// 쓰기(덮어쓰기)
			os.write(datas, 0, datas.length);

			// 버퍼에 남은 데이터 모두 출력
			os.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
