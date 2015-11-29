package meikaiJava.Chap04;

import java.util.Scanner;
//1から読み込んだ値までの和を求めるプログラム(ループにはforを使用する)
public class Ex0413 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;
		do {
			System.out.println("正の整数値:");
			x = stdIn.nextInt();
		} while (x <= 0);
		int sum = 0;
		for(int i = 1;i <= x;i++){
			sum+=i; 
		}
		System.out.println("1から"+x+"までの和は"+sum);
	}

}
