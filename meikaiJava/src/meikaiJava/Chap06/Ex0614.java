package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
/*
1~12月の英語表記を入力させる英単語学習プログラム
出題する月の値は乱数で生成する.
利用者が望む限り何度でも繰り返せる
同じ月を連続して出題しない
 */
public class Ex0614 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
			};
		System.out.println("英語の月名を入力してください");
		System.out.println("ただし一文字目のみ大文字とします");
		int m,month=0,before;
		String ans;
		do{
			before = month;
			do{
				month = rand.nextInt(12);
			}while(before==month);
			System.out.print((month+1)+"月:");
			ans = stdIn.next();
			if(ans.equals(monthString[month])){
				System.out.println("正解です");
			}else{
				System.out.println("違います");
				System.out.println("正解は"+monthString[month]+"です");
			}
			System.out.print("もう一度するなら1を入力");
			m = stdIn.nextInt();
		}while(m==1);
	}

}
