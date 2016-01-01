package id;

import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.util.GregorianCalendar;

public class DateId {
	private static int counter;

	private int id;

	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);

		System.out.printf("今日は%04d年%02d月%02d日です\n", y, m, d);
		counter = y * 1000000 + m * 10000 + d * 100;
	}

	public DateId() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
}
