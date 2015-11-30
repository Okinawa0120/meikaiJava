package meikaiJava.Chap04;

import java.util.Scanner;

public class List0419 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します");
		System.out.print("何個加算しますか");
		int n = stdIn.nextInt();

		int sum = 0/*,den = 0*/;
//		double ave = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("整数:");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("負の数は加算しません");
				continue;
			}
			sum += t;
//			den ++;
		}
//		ave = sum;
//		ave /= den;
		System.out.println("合計は" + sum + /*"平均は"+ ave + */"です。");
	}
}
/*
演習4-26 平均も求めるように書きかえよ
コメントアウトされた部分が演習で追加した文
*/