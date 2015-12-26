package meikaiJava.Chap07;

import java.util.Scanner;

//1からnまでの全整数の和を求めるメソッド
public class Ex0704 {
	static int sumUp(int n){
		int sum=0;
		do{
			sum+=n;
		}while(--n>0);
		return sum;
	}
public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.print("整数値:");
	int a = stdIn.nextInt();
	a=sumUp(a);
	System.out.println(a);
}
}
