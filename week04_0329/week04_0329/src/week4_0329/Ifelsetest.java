package week4_0329;

import java.util.Scanner;

public class Ifelsetest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("성명 : ");
		String name = s.nextLine();
		System.out.print("점수 : ");
		int score = s.nextInt();
		
		if(score>=90) {
			System.out.println(score +"점이므로 우수한 성적입니다.");
		}
		else {
			System.out.println(score + " 점입니다. 조금 더 분발하세요.");
		}
			System.out.printf("%s님의 성적은 %d점 입니다.",name,score);
		s.close();
	}

}
