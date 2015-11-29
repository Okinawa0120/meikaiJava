package meikaiJava.Chap03;

import java.util.Scanner;
//二つの整数値を読み込み小さい方と大きい方の両方の値を表示するプログラム
public class Ex0314 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		if(a==b){
			System.out.println("2つの値は同じです");
		}else{
			if(a<b){
				int temp =b;
				b=a;
				a=temp;
			}
			System.out.println("大きい方の値は"+a+",小さい方の値は"+b+"です");
		}
	}

}
