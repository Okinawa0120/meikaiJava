package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
/*
曜日の英語表記を入力させる英単語学習プログラム
出題する曜日は乱数で生成する.
利用者が望む限り何度でも繰り返せる
同じ曜日を連続して出題しない
 */
public class Ex0615 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayStringe = {
				"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
			};
		String[] dayStringj = {
				"日","月","火","水","木","金","土"
			};
		System.out.println("英語の曜日名を入力してください");
		System.out.println("ただし一文字目のみ大文字とします");
		int m,day=0,before;
		String ans;
		do{
			before = day;
			do{
				day = rand.nextInt(7);
			}while(before==day);
			System.out.print(dayStringj[day]+"曜日:");
			ans = stdIn.next();
			if(ans.equals(dayStringe[day])){
				System.out.println("正解です");
			}else{
				System.out.println("違います");
				System.out.println("正解は"+dayStringe[day]+"です");
			}
			System.out.print("もう一度するなら1を入力");
			m = stdIn.nextInt();
		}while(m==1);
	}

}
