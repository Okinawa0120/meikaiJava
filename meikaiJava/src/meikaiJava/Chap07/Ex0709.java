package meikaiJava.Chap07;

import java.util.Scanner;
//正の整数値: と表示してキーボードから正の整数値を読み込む
public class Ex0709 {
	static int readPlusInt(){
		Scanner stdIn = new Scanner(System.in);
		int a;
		do{
		System.out.println("正の整数値:");
		a = stdIn.nextInt();
		}while(a<0);
		return a;
	}
	public static void main(String[] args) {
		int a = readPlusInt();
		System.out.println(a);
	}
}
