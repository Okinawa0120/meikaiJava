package meikaiJava.Chap09.Ex0903;

import meikaiJava.Chap09.Ex0902.Day;

public class AccounTester {
	public static void main(String[] args) {
		Day open = new Day(2015, 12, 31);
		Account myaccount = new Account("普通預金", "0120444444", 500, open);
		System.out.println(myaccount.toString());
	}
}
