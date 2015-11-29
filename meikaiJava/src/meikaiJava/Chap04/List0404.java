package meikaiJava.Chap04;

import java.util.Scanner;
//正の整数値を0までカウントダウンする
public class List0404 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントダウンを開始します");
		int x;
		do {
			System.out.println("正の整数値:");
			x = stdIn.nextInt();
		} while (x <= 0);
		while(x >= 0){
			System.out.println(x);
			x--;
//			System.out.println("("+x+")");
		}
	}

}
/*
演習4-4 while文終了時にxの値が-1担っていることを確認するプログラムを作成せよ
while文のx--;の次の行コメントアウトを外すと確認できる
*/
