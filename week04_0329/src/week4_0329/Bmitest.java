package week4_0329;

import java.util.Scanner;

public class Bmitest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("키: ");
		double height = s.nextDouble();
		System.out.print("몸무게 : ");
		double weight = s.nextDouble();
		
		double bmi = weight / Math.pow(height/100, 2);
		
		System.out.printf("당신의 키는 %.3fcm이고, 몸무게는 %.3fkg입니다. 따라서 BMI는 %.3f입니다. ",height,weight,bmi);
		if(bmi>=25) {
			System.out.println("비만입니다.");
		}
		else if(bmi >=23) {
			System.out.println("과체중입니다.");
		}
		else if(bmi >=18.5) {
			System.out.println("정상입니다.");
		}
		else  {
			System.out.println("저체중입니다.");
		}
			
		s.close();
	}

}
