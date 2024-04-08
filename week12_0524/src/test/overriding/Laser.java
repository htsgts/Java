package test.overriding;

public class Laser extends Weapon {
	@Override
	public void fire() {
		System.out.println("지지직");
	}

}
