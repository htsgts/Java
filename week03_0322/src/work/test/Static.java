package work.test;
public class Static {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		int max = 0;

		//max = n1 > n2 ? n1 : n2;
		
		if(n1>n2) {
			max = n1;
		}
		else {
			max = n2;
		}
		
		System.out.println("n1은 " + n1 + ", n2는 " + n2 + "입니다.");
		System.out.println("n1 과 n2 중 큰 수는 " + max + "입니다.");
		System.out.printf("%d과(와) %d중에 더 큰 수는 %d입니다.", n1, n2, max);

	}
}
