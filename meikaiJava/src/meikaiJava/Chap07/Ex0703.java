package meikaiJava.Chap07;

import java.util.Scanner;

//三変数の中央値を求めるメソッド
public class Ex0703 {
	static int med(int min,int med,int max) {
		if(med<min){
			int temp=min;
			min=med;
			med=temp;
		}
		if(max<med){
			int temp=med;
			med=max;
			max=temp;
		}
		if(med<min){
			int temp=min;
			min=med;
			med=temp;
		}
		return med;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		System.out.print("整数値c:");
		int c = stdIn.nextInt();
		a=med(a,b,c);
		System.out.println(a);
	}
}
