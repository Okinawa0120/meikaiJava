package meikaiJava.Chap02;

import java.util.Random;
import java.util.Scanner;
//キーボードから読み込んだ整数の±5の範囲の乱数を生成するプログラム
public class Ex0208 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		Random rand = new Random();
		int y =rand.nextInt(11)-5;
		System.out.println("入力された値の±5の範囲の乱数を生成しました.それは"+(x+y)+"です.");
	}

}
