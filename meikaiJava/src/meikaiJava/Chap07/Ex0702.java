package meikaiJava.Chap07;

import java.util.Scanner;

//三変数の最小値を求めるメソッド
public class Ex0702 {
	static int min(int a,int b,int c) {
		int min=a;
		if(min>b){
			min=b;
		}
		if(min>c){
			min=c;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		System.out.print("整数値c:");
		int c = stdIn.nextInt();
		a=min(a,b,c);
		System.out.println(a);
	}
}
