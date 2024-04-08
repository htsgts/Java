package test.overriding;

public class Bomb extends Weapon {
	@Override
	public void fire() {
		System.out.println("펑펑펑");
		super.fire();
	}

}
