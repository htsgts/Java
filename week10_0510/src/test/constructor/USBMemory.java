package test.constructor;

public class USBMemory {
	private int capacity;
	private String color;
	
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println("USB 용량 : "+ capacity +"GB, 색상 : "+color);
	}
	public void writeMemory() {
		printInfo();
		System.out.println("USB Memory에 데이터를 저장한다.");
	}
	public void readMemory() {
		printInfo();
		System.out.println("USB Memory에 데이터를 읽는다.");
	}
}
