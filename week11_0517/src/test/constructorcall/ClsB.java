package test.constructorcall;

public class ClsB extends ClsA {
	public ClsB() {
		System.out.println("ClsB의 생성자");
	}
	public ClsB(int a) {
		System.out.println("ClsB의 생성자 (int a):"+ a);
	}

}
