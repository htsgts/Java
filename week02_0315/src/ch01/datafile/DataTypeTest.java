package ch01.datafile;

public class DataTypeTest {

	public static void main(String[] args) {
		// 숫자형 : 정수형 (byte, short, int, long)
		byte b = 127;
		b = -128;
		short s = 5000;
		s = b;
		int i = 10000000;
		i = s;
		long l = 1000000000;
		l = i;
		i = (int)l;
//		숫자형 : 실수형(float, double)	
		float f = 7.53f;
		f = 200;
		f = l;
		double d = 56.77;
		d = i;
		d = 900;
		d = f;
//		논리형 : (true, false)
		boolean bb = true;
		bb = b==s;
//		문자형 : char		
		char c = 65;
		System.out.println(c);
		System.out.println(c+2);
		c = 'b';
		System.out.println(c);
		System.out.println(c+2);
		System.out.println((char)(c+2));
	}

}
