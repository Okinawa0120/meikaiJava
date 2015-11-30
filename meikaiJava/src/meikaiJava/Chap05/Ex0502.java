package meikaiJava.Chap05;

import java.util.Scanner;
//float型とdouble型の変数に値を読み込んで表示するプログラム
public class Ex0502 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xはfloat型,yはdouble型です");
		System.out.print("x:");
		float x = stdIn.nextFloat();
		System.out.print("y:");
		double y = stdIn.nextDouble();
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
