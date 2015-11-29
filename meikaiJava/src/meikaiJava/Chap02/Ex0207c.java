package meikaiJava.Chap02;

import java.util.Random;
//2桁の正の整数を生成するプログラム
public class Ex0207c {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int x =rand.nextInt(90)+10;
		System.out.println("生成した数は"+x+"です.");

	}

}
