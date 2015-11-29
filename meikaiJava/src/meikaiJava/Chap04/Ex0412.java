package meikaiJava.Chap04;

import java.util.Scanner;
//0から読み込んだ正の整数値までカウントアップするプログラム
public class Ex0412 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントアップを開始します");
		int x;
		do {
			System.out.println("正の整数値:");
			x = stdIn.nextInt();
		} while (x <= 0);
		for(int i = 0;i <= x;i++){
			System.out.println(i);
		}
	}

}
