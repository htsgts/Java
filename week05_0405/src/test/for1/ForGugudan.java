package test.for1;

public class ForGugudan {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int result = i * j;
				System.out.printf("%dX%d=%d \t", j, i, result);
			}
			System.out.println();
		}
	}

}