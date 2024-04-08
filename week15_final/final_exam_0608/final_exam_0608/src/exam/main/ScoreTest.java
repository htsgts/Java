package exam.main;

import java.util.Scanner;

import javax.swing.JFrame;

public class ScoreTest extends JFrame  {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		String name;
		String[] ExcStd = new String[3];
		String[] subjects = { "국어", "영어", "수학", "사회", "과학" };
		int max = 0;
		
		//학생 수 입력
		System.out.printf("학생 수를 입력하세요: ");
		num = s.nextInt();
		String[] Student = new String[num];
		
		//학생 이름 입력
		for(int i = 0; i < num;i++) {
			System.out.println("학생 이름을 입력하세요.");
			name = s.next();
			Student[i] = name;
		}

		int[][] scores = new int[num][subjects.length];
		double[] avg = new double [num];
		int[] sum = new int [num];
		
		//과목별로 성적 입력
		System.out.println("과목별 성적을 입력");
		for (int i = 0; i < num; i++) {
			System.out.println(Student[i]+"학생");
		for (int j = 0; j < subjects.length; j++) {
			System.out.print(subjects[j] +":");
			scores[i][j] = s.nextInt();
			sum[i] += scores[i][j];
		}
		avg[i] = sum[i] /(double) subjects.length;
		}
		
		//학생별 성적 출력
		for (int i = 0; i < num; i++) {
			System.out.println(Student[i]+"의 성적");
			for (int j = 0; j < subjects.length; j++) {
				System.out.printf("%s: %d점 ",subjects[j], scores[i][j]);
				}
			System.out.println();
			System.out.printf("합계 : %d점, 평균 : %.2f\n",sum[i],avg[i]);
			System.out.printf("보충수업이 필요한 과목:");
			for (int j = 0; j < subjects.length; j++) {
			if(scores[i][j]<70) {
				System.out.printf(" %s ",subjects[j]);
			}
		}
			System.out.println();	
		}
		
		//순위 정하기
		for(int i=0;i<3;i++) {
			for(int j=0;j<num;j++) {
				if(sum[j]> max) {
				ExcStd[i] = Student[j];
				max = sum[j];
				}
				}
			for(int k=0;k<num;k++) {
				if(sum[k] == max) {
					sum[k] = 0;
				}
			}
			max = 0;
		}
		System.out.println("순위");
		for(int i=0;i<3;i++) {
			
			System.out.print(i+1 +"위: ");
			System.out.println(ExcStd[i]);
		}
		System.out.println();
		s.close();
		new ScoreBoard();
	}
}
