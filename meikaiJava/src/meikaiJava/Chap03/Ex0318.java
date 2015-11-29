package meikaiJava.Chap03;

import java.util.Scanner;
//1から12の整数を読み込みそれに対応する季節を表示するプログラム
public class Ex0318 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("1から12の整数:");
		int a = stdIn.nextInt();
		switch (a) {
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		}
	}

}
