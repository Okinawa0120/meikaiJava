package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//探索するキー値と同じ要素が複数個存在する場合最も末尾にある要素を見つけるプログラム
public class Ex0607 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = 12;
		int[] a = new int[n];
		for (int j = 0; j < n; j++)
			a[j] = rand.nextInt(10);

		System.out.print("配列aの全要素の値{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.println(" }");

		System.out.print("探す数値:");
		int key = stdIn.nextInt();

		int i;
		for (i = n-1; i >= 0; i--){
			if (a[i] == key){
				break;
			}
		}
		if (i < n){
			System.out.println("それはa[" + i + "]にあります");
		}else{
			System.out.println("それはありません");			
		}
	}
}
