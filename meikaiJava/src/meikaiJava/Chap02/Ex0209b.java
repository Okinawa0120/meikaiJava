package meikaiJava.Chap02;

import java.util.Random;
//0.0以上10.0未満の実数値を生成するプログラム
public class Ex0209b {
	
	public static void main(String[] args) {
		Random rand = new Random();
		double x =rand.nextDouble();
		int y =rand.nextInt(9)+1;
		System.out.println("生成した数は"+(x+y)+"です.");

	}
}
