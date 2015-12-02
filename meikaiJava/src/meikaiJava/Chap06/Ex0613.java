package meikaiJava.Chap06;

import java.util.Scanner;
//配列aの要素を配列bに逆順でコピーするプログラム
public class Ex0613 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int l;
		do{
			System.out.print("要素数:");
			l = stdIn.nextInt();
		}while(l<0);
		int[] a = new int [l];
		int[] b = new int [l];
		for(int i = 0;i < a.length;i++){
			a[i] = i;
		}
		l--;
		for(int i = 0;i < a.length;i++){
			b[i] = a[l-i];
		}

		System.out.println("a b");
		System.out.println("---");
		for(int i = 0;i < a.length;i++){
			System.out.println(a[i] +" "+ b[i]);
		}
	}
}
