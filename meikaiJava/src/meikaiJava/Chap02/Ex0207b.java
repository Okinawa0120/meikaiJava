package meikaiJava.Chap02;

import java.util.Random;
//-9から-1の整数値をランダムに生成するプログラム
public class Ex0207b {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int x =rand.nextInt(9)-10;
		System.out.println("生成した数は"+x+"です.");

	}

}
