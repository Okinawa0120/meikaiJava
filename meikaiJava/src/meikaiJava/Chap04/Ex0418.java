package meikaiJava.Chap04;

import java.util.Scanner;
//1から読み込んだ値までの2上を表示するプログラム
public class Ex0418 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値:");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++){
			System.out.println(i+"の2乗は"+(i*i));
		}
	}

}
