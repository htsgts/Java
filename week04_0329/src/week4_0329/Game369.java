package week4_0329;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		int num;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력:");
		num = s.nextInt();
		
		if(num>100) 
			System.out.println("369게임은 100이하의 숫자로 운영됩니다.");
		else if((num % 10 == 3) || (num % 10 == 6) || (num % 10 == 9))
				System.out.println("박수 짝!");
		else
			System.out.println(num);
		s.close();
	}

}
