package meikaiJava.Chap03;

import java.util.Scanner;
//2値の差が10以下か11以上か判定するプログラム
public class Ex0311 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		int dif=(a>b ? a-b:b-a);
		if(dif>10){
			System.out.println("それらの差は11以上です");
		}else{
			System.out.println("それらの差は10以下です");
		}
	}

}
