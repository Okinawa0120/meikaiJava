package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//連続する要素が同じ値を持たないように演習6-9を改良したプログラム
public class Ex0610 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int l = stdIn.nextInt();
		int[] a = new int [l];
		for(int i = 0;i < l;i++){
			a[i] = rand.nextInt()+1;
			
		}
	}

}
