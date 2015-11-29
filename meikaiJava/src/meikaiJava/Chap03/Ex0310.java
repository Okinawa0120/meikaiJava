package meikaiJava.Chap03;

import java.util.Scanner;
//二つの整数値を読み込み2値の差を表示するプログラム
public class Ex0310 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		System.out.println("2値の差は"+(a>b ? a-b:b-a)+"です");
	}

}
