package test.inheritance;

public class RunSub {

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.name = "이유한";
		sub.age = 21;
		sub.schoolName = "유한대학교";
		sub.addr = "서울시 구로구 항동";
		sub.phoneNumber = "010-1234-5678";
		
		System.out.println("성명 : " + sub.name);
		System.out.println("나이 : " + sub.age);
		System.out.println("학교 : " + sub.schoolName);
		System.out.println("주소 : " + sub.addr);
		System.out.println("전화번호 : " + sub.phoneNumber);
	}

}
