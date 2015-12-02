package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//配列の要素の並びをシャッフルするプログラム
public class Ex0612 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int l;
		do{
			System.out.print("要素数:");
			l = stdIn.nextInt();
		}while(l<0);
		int[] a = new int [l];
		for(int i = 0;i < a.length;i++){
			a[i] = i;
		}
		for(int i = 1;i < l;i++){
			int temp = a[i];
			int n = rand.nextInt(a.length);
			a[i] = a[n];
			a[n] = temp;
		}
		for(int i : a){
			System.out.println(i);
		}
	}

}
