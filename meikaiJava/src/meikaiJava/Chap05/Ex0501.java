package meikaiJava.Chap05;

import java.util.Scanner;
//10進数を読み込んで8,16進数で表示するプログラム
public class Ex0501 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.printf("8進数では%oです\n",x);
		System.out.printf("16進数では%xです\n",x);
	}

}
