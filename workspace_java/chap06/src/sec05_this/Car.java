package sec05_this;

public class Car {
	
	String model;
	
	Car(){
		
	}
	
	void setModel(String model){
//		int a =10;
//		a = a;
//		model = model;
		
		// new된 나를 뜻한다
		this.model = model;
	}
	
	Car(String model){
		this.model = model;
	}
	
}
