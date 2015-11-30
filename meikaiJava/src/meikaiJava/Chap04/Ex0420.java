package meikaiJava.Chap04;

import java.util.Scanner;
//*を使ってn段の正方形を表示するプログラム
public class Ex0420 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
