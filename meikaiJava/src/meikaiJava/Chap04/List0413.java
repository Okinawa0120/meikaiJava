package meikaiJava.Chap04;

import java.util.Scanner;
//読み込んだ整数値の約数を求めるプログラム
public class List0413 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値");
		int n = stdIn.nextInt();
//		int x = 0;
		for (int i = 1; i < n; i++){
			if (n % i == 0){				
				System.out.println(i);
//				x++;
			}
		}
//		System.out.println("約数は"+x+"個です");
	}
}
/*
演習4-17
約数を表示した後に約数の個数を表示するように
List4-13を書き換えたプログラムを作成せよ
コメントアウトされた部分が演習で追加した文
*/