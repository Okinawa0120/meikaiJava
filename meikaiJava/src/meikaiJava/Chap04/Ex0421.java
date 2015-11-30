package meikaiJava.Chap04;

import java.util.Scanner;
//それぞれ左上,右上,右下が直角の直角三角形を表示するプログラム
public class Ex0421 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("直角三角形を表示します");
		System.out.print("段数は:");
		int n = stdIn.nextInt();
		System.out.println("左上が直角");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("右上が直角");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++){
				System.out.print(' ');
			}
			for (int j = n-i; j > 0; j--){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("右下が直角");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++){
				System.out.print(' ');
			}
			for (int j = n-i; j >= 0; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
