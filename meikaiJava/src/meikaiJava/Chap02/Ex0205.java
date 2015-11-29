package meikaiJava.Chap02;

import java.util.Scanner;
//キーボードから読み込んだ2つの実数値の合計と平均を表示するプログラム
public class Ex0205 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double x = stdIn.nextDouble();
		double y = stdIn.nextDouble();
		System.out.println("xの値は"+x+"です.");
		System.out.println("yの値は"+y+"です.");
		System.out.println("合計は"+(x+y)+"です.");
		System.out.println("平均は"+(x+y)/2+"です.");

	}

}
