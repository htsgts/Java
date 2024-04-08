package test.constructorcall;

public class ClsC extends ClsB {
	public ClsC() {
		System.out.println("ClsC의 생성자");
	}
	public ClsC(int a) {
		super(10);
		System.out.println("ClsC의 생성자 (int a):"+ a);
	}


}
