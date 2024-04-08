package test.abstract1;

public class RunWeapon {

	public static void main(String[] args) {
		//Weapon w = new Weapon();
		Soldier s = new Soldier();
		Tank t = new Tank();
		
		s.reload();
		s.fire();
		s.walk();
		
		t.reload();
		t.fire();
		t.forward();


	}

}
