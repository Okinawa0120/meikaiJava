package meikaiJava.Chap03;

import java.util.Scanner;
//二つの整数値を読み込み大きい方の値を表示するプログラム
public class Ex0309 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		System.out.println("大きい方の値は"+(a>b ? a:b)+"です");
	}

}
