package meikaiJava.Chap08.Ex0802;
//自動車クラスにフィールドやメソッドを自由に追加せよ
class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double mileage;
	
	Car(String name, int width, int height, int length, double fuel, double mileage) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.mileage = mileage;
		x = y = 0.0;
	}

	double getX() { return x; }
	double getY() { return y; }
	double getFuel() { return fuel; }

	void putSpec() {
		System.out.println("名前:" + name);
		System.out.println("車幅:" + width  + "mm");
		System.out.println("車高:" + height + "mm");
		System.out.println("車長:" + length + "mm");
		System.out.println("燃費:" + mileage + "km/L");
	}

	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);

		if (dist/mileage > fuel){
			return false;
		} else {
			fuel -= dist/mileage;
			x += dx;
			y += dy;
			return true;
		}
	}
}
