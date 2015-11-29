package meikaiJava.Chap04;

import java.util.Scanner;
//Ex0413を書き換えて式を表示するようにしたプログラム
public class Ex0414 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;
		do {
			System.out.println("正の整数値:");
			x = stdIn.nextInt();
		} while (x <= 0);
		int sum = 0;
		for(int i = 1;i < x;i++){
			sum+=i; 
			System.out.print(i+"+");
		}
		sum+=x;
		System.out.println(x+"="+sum);
	}

}
