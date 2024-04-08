package test.object;

public class TV {
	//속성 과정에서 선택된 속성은 필드로 선언
	private String producer;
	private String mode1Num;
	private String color;
	private int size;
	private int channel;
	private int volume;
	//setter 메소드 : 필드 값을 설정하는 메소드 set필드명() → setProducer()
	//getter 메소드 : 필드 값을 변환하는 메소드

	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getMode1Num() {
		return mode1Num;
	}
	public void setMode1Num(String mode1Num) {
		this.mode1Num = mode1Num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	// 추상화 과정에서 선택된 기능은 메소드로
	public void powerOff() {
		System.out.println(color +"색상 TV전원을 끄다.");
	}
	public void upChannel() {
		System.out.println("현재 채널은"+ ++channel+"번");
	}
	public void downChannel() {
		System.out.println("현재 채널은"+ --channel+"번");
	}
	public void upvolume() {
		System.out.println("현재 볼륨은"+ ++volume);
	}
	public void downvolume() {
		System.out.println("현재 채널은"+ --volume);
	}
	public void powerOn() {
		System.out.println(color +"색상 TV전원을 키다.");
	}
}
