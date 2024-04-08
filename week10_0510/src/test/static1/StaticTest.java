package test.static1;

public class StaticTest {
	int nonStc; // 인스턴스 변수
	static int stc; // 클래스
	
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		st1.nonStc = 50;
		st2.nonStc = 100;
		
		st1.stc = 77;
		st2.stc = 700;
		
		System.out.println("st1.nonStc : "+ st1.nonStc);
		System.out.println("st2.nonStc : "+ st2.nonStc);

		System.out.println("st1.stc : "+ st1.stc);
		System.out.println("st2.stc : "+ st2.stc);
		System.out.println("st2.stc : "+ StaticTest.stc);

	}
}
