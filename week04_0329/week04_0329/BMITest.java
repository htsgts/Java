package test.scanner;

import java.util.Scanner;

public class BMITest {

	public static void main(String[] args) {
		System.out.println("======= BMI(Body Mass Index) =======\n");
		Scanner s = new Scanner(System.in);
		double weight, height, bmi;
		System.out.print("* 체중입력(㎏): ");
		weight = s.nextDouble();
		
		System.out.print("* 키입력(㎝): ");
		height = s.nextDouble();
		
		bmi = weight / Math.pow(height/100, 2);
		
		System.out.printf("* 당신의 BMI 지수는 %.2f ㎏/㎡입니다.", bmi);
		
		s.close();
	}

}
