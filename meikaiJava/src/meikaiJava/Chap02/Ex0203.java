package meikaiJava.Chap02;

import java.util.Scanner;

//キーボードから読み込んだ整数値をそのまま表示すプログラム

public class Ex0203 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.println(x+"と入力しましたね.");
	}

}
