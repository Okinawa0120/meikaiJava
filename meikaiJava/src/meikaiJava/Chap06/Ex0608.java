package meikaiJava.Chap06;

import java.util.Scanner;
//double型配列の全要素のの合計値と平均値を求めるプログラム
public class Ex0608 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("要素数:");
		final int n = stdIn.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("要素の値");
			a[i] = stdIn.nextDouble();	
		}
		double sum = 0;
		for (double i : a){
			sum += i;
		}
		System.out.println("合計値は" + sum + "です");
		System.out.println("平均値は" + sum/n +"です");
	}

}
