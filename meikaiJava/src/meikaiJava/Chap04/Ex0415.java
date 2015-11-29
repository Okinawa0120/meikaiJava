package meikaiJava.Chap04;

import java.util.Scanner;
//身長と標準体重を表示するプログラム
public class Ex0415 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int s,e,i;//start,end,interval
		do {
			System.out.println("何cmから:");
			s = stdIn.nextInt();
		} while (s <= 0);
		do {
			System.out.println("何cmまで:");
			e = stdIn.nextInt();
		} while (e <= 0);
		do {
			System.out.println("何cmごと:");
			i = stdIn.nextInt();
		} while (i <= 0);
		System.out.println("身長 標準体重");
		for(;s <= e;s+=i){
			System.out.println(s+" "+(s-100)*0.9);
		}
	}
	
}
