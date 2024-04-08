package test.object;

public class RunCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setR(5);
		c2.setR(15);
		
		c1.calcCircum();
		c1.calcArea();
		
		c2.calcCircum();
		c2.calcArea();
		
		printCircle(c1);
		printCircle(c2);
		
	}
	
	public static void printCircle(Circle c) {
		System.out.println("==============================================");
		System.out.printf("* 반지름이 %dcm인 원의 둘레: %.3fcm\n", c.getR(),c.getCircum());
		System.out.printf("* 반지름이 %dcm인 원의 면적: %.3fcm\n", c.getR(),c.getArea());
	}

}
