package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//配列の全要素に乱数を代入して横向きの棒グラフで表示
public class List0605 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数:");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++){
			a[i] = 1 + rand.nextInt(10);
		}
		/*List6-5本来の処理
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			for (int j = 0; j < a[i]; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		*/
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < n; j++){
				if(a[j] >= i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < n; i++){
			System.out.print("--");
		}
		System.out.println();
		for(int i = 0; i < n; i++){
			System.out.print(i%10+" ");
		}
		System.out.println();
	}

}
/*
演習6-4 List6-5を書き換えて縦向きの棒グラフで表示するプログラムを作成せよ
*/