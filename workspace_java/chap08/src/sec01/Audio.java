package sec01;

public class Audio extends Display implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다");
		
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
		System.out.println("audio 볼륨 변경" + this.vol);
	}

}
