package meikaiJava.Chap09.Ex0904;

import meikaiJava.Chap09.Ex0902.Day;
import meikaiJava.Chap09.Ex0904.Human;

public class HumanTester {
	public static void main(String[] args) {
		Day birthday = new Day(1998, 3, 18);
		Human okinawa = new Human("オキナワ", 177, 57, 17, 13.7,birthday);
		System.out.println(okinawa.toString());
		System.out.println("ダイエットします");
		okinawa.diet();
		System.out.println("体脂肪率は"+okinawa.getFat());
	}
}