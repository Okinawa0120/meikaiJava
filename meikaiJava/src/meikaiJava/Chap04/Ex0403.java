package meikaiJava.Chap04;

import java.util.Scanner;
//二つの整数値を読み込みその間の整数値を小さい順に表示するプログラム
public class Ex0403 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数a");
		int min = stdIn.nextInt();
		System.out.print("整数b");
		int max = stdIn.nextInt();
		if(min>max){
			int temp=max;
			max=min;
			min=temp;
		}
		do {
			System.out.print(min+" ");
			min++;
		} while (min!=max);
		
	}

}
