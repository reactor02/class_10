package sec02;

public class LoveException extends Exception{
	
	LoveException(){
		System.out.println("LoveExecption constructed");
	}
	
	LoveException(String message){
		super(message);
		System.out.println("LoveExecption(String) constructed");
	}
	
	
}
