package meikaiJava.Chap09.Ex0902;
//日付クラス(第3版)の全てのコンストラクタの働きを確認するプログラム
public class DayTester {
	public static void main(String[] args) {
		Day x = new Day();
		Day tommorow = new Day(2016);
		Day mayDay = new Day(1886, 5);
		Day today = new Day(2015,12,31);
		Day todayCopy = new Day(today);
		
		System.out.println("x(引数なし):"+x.toString());
		System.out.println("tommorow(引数1つ):"+tommorow.toString());
		System.out.println("mayDay(引数2つ):"+mayDay.toString());
		System.out.println("today(引数3つ):"+today.toString());
		System.out.println("todayCopy(引数インスタンス):"+todayCopy.toString());
	}

}
