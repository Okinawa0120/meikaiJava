package meikaiJava.Chap03;

import java.util.Scanner;
//二つの整数値を読み込み降順ソートするプログラム
public class Ex0315 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
			if(a<b){
				int temp =b;
				b=a;
				a=temp;
			}
			System.out.println("整数a:"+a+"整数b:"+b);
	}

}
