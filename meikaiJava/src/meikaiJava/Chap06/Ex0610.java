package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//連続する要素が同じ値を持たないように演習6-9を改良したプログラム
public class Ex0610 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int l;
		do{
			System.out.print("要素数:");
			l = stdIn.nextInt();
		}while(l<0);
		int[] a = new int [l];
		a[0] = rand.nextInt(10)+1;
		for(int i = 1;i < l;i++){
			do{
				a[i] = rand.nextInt(10)+1;
			}while(a[i]==a[i-1]);
			System.out.println(a[i]);
		}
	}

}
