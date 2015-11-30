package meikaiJava.Chap04;

import java.util.Scanner;

public class Ex0423 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("ピラミッドを表示します");
		System.out.print("段数は:");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >= 0; j--){
				System.out.print(' ');
			}
			for (int j = 0; j <= (i-1)*2; j++){
				System.out.print(i%10);
			}
			System.out.println();
		}
	}

}
