package test.for1;

public class ForTest1 {

	public static void main(String[] args) {
		for(int i =0;i < 100; i++) {
			System.out.print(i + 1 + "\t");
			if(i % 10 ==  9) {
				System.out.println();
			}
		}

	}
}