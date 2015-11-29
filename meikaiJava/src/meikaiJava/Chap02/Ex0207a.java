package meikaiJava.Chap02;

import java.util.Random;
//1~9の整数をランダムに表示するプログラム
public class Ex0207a {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int x =rand.nextInt(9)+1;
		System.out.println("生成した数は"+x+"です.");

	}
	
}
