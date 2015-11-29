package meikaiJava.Chap04;

import java.util.Scanner;
//入力された月の季節を表示
public class List0401 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int retry;

		do {
			int month;
//			do{
				System.out.print("季節を求めます.\n何月ですか:");
				month = stdIn.nextInt();
//			}while((month<0)||(month>12));

			if (month >= 3 && month <= 5){
				System.out.println("春");
			}else if (month >= 6 && month <= 8){
				System.out.println("夏");
			}else if (month >= 9 && month <= 11){
				System.out.println("秋");
			}else if (month == 12 || month == 1 || month == 2){
				System.out.println("冬");
			}
			System.out.print("もう一度?");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
/*
演習4-19 List4-1を修正して1~12以外の値を入力された時
再入力させるプログラムを作成せよ
コメントアウトされたdo文が演習で追記した文
*/