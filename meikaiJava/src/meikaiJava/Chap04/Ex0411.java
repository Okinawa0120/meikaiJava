package meikaiJava.Chap04;

import java.util.Scanner;
//正の整数値を0までカウントダウンするプログラム(ただしループにはforを使用する)
public class Ex0411 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントダウンを開始します");
		int x;
		do {
			System.out.println("正の整数値:");
			x = stdIn.nextInt();
		} while (x <= 0);
		for(;x >= 0;x--){
			System.out.println(x);
		}
	}

}
