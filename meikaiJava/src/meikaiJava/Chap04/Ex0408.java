package meikaiJava.Chap04;

import java.util.Scanner;
//読み込んだ整数の桁を求めるプログラム
public class Ex0408 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("正の整数値");
			n = stdIn.nextInt();
		}while(n<0);
		int i = 0;
		while (n > 0) {
			n /= 10;
			i++;
		}
		System.out.println("その値は"+i+"桁です");
	}
	
}
