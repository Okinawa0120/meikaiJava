package meikaiJava.Chap03;

import java.util.Scanner;
//3つの整数値を読み込み最小値を表示するプログラム
public class Ex0312 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		System.out.print("整数値c:");
		int c = stdIn.nextInt();
		int min = a;
		if(min>b){
			min = b;
		}
		if(min>c){
			min = c;
		}
		System.out.println("最小値は"+min+"です");
	}

}
