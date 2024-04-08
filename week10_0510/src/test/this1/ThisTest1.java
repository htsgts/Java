package test.this1;

public class ThisTest1 {
	private double num;
	public void power(double num) {
		this.num = num * num;
		System.out.println(num + "의 제곱은 " + this.num+ "이다.");
	}
	
	public static void main(String[] args) {
		ThisTest1 t = new ThisTest1();
		int num = 7;
		t.power(num);	
	}
}
