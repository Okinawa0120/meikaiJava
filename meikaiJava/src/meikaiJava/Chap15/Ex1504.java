package meikaiJava.Chap15;

import java.util.Scanner;

//xを小数点以下の部分をp桁で全体を少なくともw桁で表示するメソッドを作成せよ
public class Ex1504 {
	public static void printDouble(double x, int p, int w){
		System.out.printf(String.format("%%%d.%df\n",w, p),x);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("実数を入力:");
		double x = stdIn.nextDouble();
		System.out.print("全体の桁数:");
		int w = stdIn.nextInt();
		System.out.print("小数点以下を何桁で表すか:");
		int p = stdIn.nextInt();
		printDouble(x, p, w);
	}
}
