package test.scanner;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1,s2,s3,s4,s5;
		System.out.print("성명을 입력하세요. : ");
		s1 = s.nextLine();
		System.out.print("주소를 입력하세요. : ");
		s2 = s.nextLine();
		System.out.print("좋아하는 사람 3인을 입력하세요.(한줄로 입력) : ");
		s3 = s.next();
		s4 = s.next();
		s5 = s.next();
		
		System.out.println("당신의 성명은 " + s1 + "입니다.");
		System.out.println("당신의 주소는 " + s2 + "입니다.");
		System.out.printf("당신이 좋아하는 3인은 %s, %s, %s입니다." ,s3,s4,s5);
		s.close();
		
	}
}