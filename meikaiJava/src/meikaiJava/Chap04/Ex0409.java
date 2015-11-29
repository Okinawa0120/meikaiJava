package meikaiJava.Chap04;

import java.util.Scanner;
//1から読み込んだ整数値までの整数の積(階乗)を求めるプログラム
public class Ex0409 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("正の整数値");
			n = stdIn.nextInt();
		}while(n<0);
		System.out.print("1から"+n+"までの積は");
		int i = 1;
		while (n > 1) {
			i *= n;
			n--;
		}
		System.out.println(i+"です");
	}

}
