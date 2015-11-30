package meikaiJava.Chap04;

import java.util.Scanner;

public class List0418 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します");
		System.out.print("何個加算しますか");
		int n = stdIn.nextInt();

		int sum = 0;
//		double ave = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("整数:");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("合計が1000を超えました");
				System.out.println("最後の数値は無視します");
				break;
			}
			sum += t;
//			ave = sum;
//			ave /= i;
		}
		System.out.print("合計は" + sum + /*"平均は"+ ave + */"です。");
	}

}
/*
演習4-25 平均も求めるように書きかえよ
コメントアウトされた部分が演習で追加した文
*/