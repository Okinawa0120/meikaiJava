package meikaiJava.Chap08.Ex0802;

public class CarTester {
	public static void main(String[] args) {
		Car vitz  = new Car("ビッツ", 1660, 1500, 3640, 40.0, 26.5);
		Car march = new Car("マーチ", 1660, 1525, 3695, 41.0, 26);

		vitz.putSpec();
		System.out.println();
		march.putSpec();
		System.out.println("100km走ります");
		vitz.move(100, 0);
		march.move(100, 0);
		System.out.println("ビッツの燃料はあと"+vitz.getFuel()+ "リットルです");
		System.out.println("マーチの燃料はあと"+march.getFuel()+ "リットルです");
	}
}
