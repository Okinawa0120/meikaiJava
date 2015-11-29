package meikaiJava.Chap02;

import java.util.Random;
//0.0以上1.0未満の実数値をランダムに生成するプログラム
public class Ex0209a {
	
	public static void main(String[] args) {
		Random rand = new Random();
		double x =rand.nextDouble();
		System.out.println("生成した数は"+x+"です.");

	}

}
