package sec01;

public class Tv extends Display implements RemoteControl , OTT {

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
		
	}
	int vol;
	@Override
	public void setVolume(int vol) {
		if(vol > RemoteControl.MAX_VOLUME) {
			vol = RemoteControl.MAX_VOLUME;
		} else if(vol < RemoteControl.MIN_VOLUM) {
			vol = RemoteControl.MIN_VOLUM;
		}
		
		this.vol = vol;
		
		System.out.println("TV 볼륨 변경" + this.vol);
		
	}

	@Override
	public void netflix() {
		System.out.println("netflix 시청");
		
	}
	
}
