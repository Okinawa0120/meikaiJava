package meikaiJava.Chap03;

import java.util.Scanner;
//整数値を読み込んでその絶対値を求めるプログラム
public class Ex0301 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if(x<0){
			x *= -1;
		}
		System.out.println("その絶対値は"+x+"です.");

	}

}
