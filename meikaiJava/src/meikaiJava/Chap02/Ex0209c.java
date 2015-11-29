package meikaiJava.Chap02;

import java.util.Random;
//-1.0以上1.0未満の実数値をランダムに生成するプログラム
public class Ex0209c {
	
	public static void main(String[] args) {
		Random rand = new Random();
		double x =rand.nextDouble();
		int y =rand.nextInt(2)-1;
		System.out.println("生成した数は"+(x+y)+"です.");

	}

}
