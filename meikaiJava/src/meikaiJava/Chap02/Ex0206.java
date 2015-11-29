package meikaiJava.Chap02;

import java.util.Scanner;
//キーボードから底辺と高さを読み込み三角形の面積を表示するプログラム
public class Ex0206 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double x = stdIn.nextDouble();
		double y = stdIn.nextDouble();
		System.out.println("底辺:"+x);
		System.out.println("高さ:"+y);
		System.out.println("三角形の面積は"+(x*y/2)+"です.");
	}

}
