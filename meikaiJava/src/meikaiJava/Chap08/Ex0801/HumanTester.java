package meikaiJava.Chap08.Ex0801;

public class HumanTester {
	public static void main(String[] args) {
		Human okinawa = new Human("オキナワ", 177, 57, 17, 13.7);
		System.out.println("名前は"+okinawa.getName());
		System.out.println("身長は"+okinawa.getHeight());
		System.out.println("体重は"+okinawa.getWeight());
		System.out.println("年齢は"+okinawa.getAge());
		System.out.println("体脂肪率は"+okinawa.getFat());
		System.out.println("ダイエットします");
		okinawa.diet();
		System.out.println("体脂肪率は"+okinawa.getFat());
	}
}
