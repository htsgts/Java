package test.for1;

import java.util.Scanner;

public class ForSumNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int n;
		int sum;
		int num;

		while (true) {
			System.out.print("수를 입력:");
			num = s.nextInt();

			sum = 0;
			for (n = 1; n <= num; n++) {
				sum += n;
			}
			System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
			System.out.print("계속 하시겠습니까?(y/n):");
			String end = s2.nextLine();
			if(end.equals("n"))
				break;
		}
		s.close();
		s2.close();
	}
}