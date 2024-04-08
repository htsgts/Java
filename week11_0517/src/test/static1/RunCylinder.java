package test.static1;

public class RunCylinder {
	public static void printCylinder(Cylinder cylinder) {
		System.out.println("-----------------------------");
		System.out.printf("원기둥의 반지름: %d ㎝\n",cylinder.getR());
		System.out.printf("원기둥의 높이: %d ㎝\n",cylinder.getH());
		System.out.printf("원기둥의 부피: %.2f ㎠\n",cylinder.getVolume());
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(7,15);
		Cylinder c2 = new Cylinder(15,25);
		c1.calcVolume();
		c1.print();
		c2.calcVolume();
		c2.print();
	}
}
