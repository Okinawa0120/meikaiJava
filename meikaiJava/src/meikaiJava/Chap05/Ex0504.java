package meikaiJava.Chap05;

import java.util.Scanner;
//3つの整数値を読み込みその合計と平均を求めるプログラム(平均は実数として表示する)
public class Ex0504 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数値x:");
		int x = stdIn.nextInt();
		System.out.println("整数値y:");
		int y = stdIn.nextInt();
		System.out.println("整数値z:");
		int z = stdIn.nextInt();
		int sum = x+y+z;
		double ave = sum/3.0;
		System.out.println("合計は" + sum + "平均は"+ ave +"です.");
	}

}
