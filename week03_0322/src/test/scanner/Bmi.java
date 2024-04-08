package test.scanner;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double weight,height,result;
		System.out.print("키를 입력하세요: ");
		height = s.nextDouble();
		
		System.out.print("몸무게를 입력하세요: ");
		weight = s.nextDouble();
		
		result = weight / Math.pow(height/100,2) ;
		
		System.out.println("당신의 키는 " + height + "입니다.");
		System.out.println("당신의 몸무게는 " + weight + "입니다.");
		System.out.printf("당신의 BMI 지수는 %.2f (㎏/㎡)입니다." ,result);
		s.close();
	}
}