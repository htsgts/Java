package test.protected1;

import test.other.Parent;

public class Child extends Parent{
	public void modifierTest() {
//패키지가 다른 부모클래스일 경우 : protected도 접근 가능
		addr = "서울시 구로구 독산동";
//		name = "박유한"; name은 접근 불가
	}

}
