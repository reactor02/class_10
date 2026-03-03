package quiz.quiz1;

public class Quiz1 {
	
	String title;
	String name;
	String album;
	String lilycs;
	int time;
	
	Quiz1(String title, String name, String album, String lilycs, int time ){
		this.title = title;
		this.name = name;
		this.album = album;
		this.lilycs = lilycs;
		this.time = time;
	}
	
	void information() {
		System.out.println("제목: " + this.title);
		System.out.println("가수이름: "+ this.name);
		System.out.println("앨범명: "+this.album);
		System.out.println("가사: "+this.lilycs);
		System.out.println("시간: "+this.time);
	}
	
	//배열에 넣어봄.
	//array() 안에서 생성자를 호출해서 배열에 값을 넣음
	//array()를 외부에서 호출해서 String[][] 하나씩 넣고 싶음
	
//	String[] array(){
//		String[] a = new String[5];
//		a[0] = this.title;
//		a[1] = this.name;
//		a[2] = this.album; 
//		a[3] = this.lilycs;
//		a[4] = String.valueOf(this.time);
//		return a;
//	}
	
}
