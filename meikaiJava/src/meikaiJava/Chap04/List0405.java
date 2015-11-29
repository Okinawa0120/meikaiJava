package meikaiJava.Chap04;

import java.util.Scanner;
//正の整数値をカウントダウン(その2)
public class List0405 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントダウンを開始します");
		int x;
		do {
			System.out.println("正の整数値:");
			x = stdIn.nextInt();
		} while (x <= 0);
		while(x >= 0){
			System.out.println(--x);//xの値を表示した後デクリメント
		}
	}
}
/*
演習4-5 x--を--xにするとどうなるか
予想
例として5と入力すると
4
3
2
1
0
-1
と表示される.
結果は予想通りだった.
 */