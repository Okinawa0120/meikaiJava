package meikaiJava.Chap07;

import java.util.Scanner;
//List7-7のメソッドputStarsをList7-8のメソッドputCharsを呼び出すことで表示するよう書き換えたメソッド
class Ex0707 {

	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}
	static void putStars(int n) {
		putChars('*', n);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("左下直角の三角形を表示します");
		System.out.print("段数は");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}

