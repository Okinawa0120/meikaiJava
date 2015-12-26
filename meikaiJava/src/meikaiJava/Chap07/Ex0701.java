package meikaiJava.Chap07;

import java.util.Scanner;

//受け取った値の符号を-1,0,1で返すメソッド
public class Ex0701 {
	static int sign0f(int n) {
		if(n<0){
			return -1;
		}
		if(n==0){
			return 0;
		}
			return 1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値:");
		int a = stdIn.nextInt();
		a=sign0f(a);
		System.out.println(a);
	}

}
