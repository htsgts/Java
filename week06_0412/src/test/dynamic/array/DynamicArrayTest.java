package test.dynamic.array;

public class DynamicArrayTest {

	public static void main(String[] args) {
		int [] num = {3,1,5};
		int [][] arr = new int [3][];
		int cnt =0;
		
		for(int i =0; i< arr.length; i++) {
			arr[i] = new int[num[i]];
			for(int j =0; j< arr[i].length; j++) {
				arr[i][j] = ++cnt;
			}
		}
//		출력
		for(int i =0; i< arr.length; i++) {
			for(int j =0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}


	}

}
