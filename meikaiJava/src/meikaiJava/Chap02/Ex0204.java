package meikaiJava.Chap02;

import java.util.Scanner;

//キーボードから読み込んだ値に10を加えた値と減じた値を表示するプログラム
public class Ex0204 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.println("10を加えた値は"+(x+10)+"です.");
		System.out.println("10を減じた値は"+(x-10)+"です.");
	}

}
