package test.abstract1;

public class Tank extends Weapon {

	@Override
	public void fire() {
		System.out.println("펑펑펑");
	}
	public void forward() {
		System.out.println("Tank forward....");
	}

}
