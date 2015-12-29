package meikaiJava.Chap07;

import java.util.Scanner;

//配列aの値がxの要素のインデックスを先頭から順に格納した配列を生成するメソッド
public class Ex0723 {
	static int[] arraySrchIdx(int[] a, int x) {
		int[] idx = new int[a.length];
		for (int i = 0,n=0; i < a.length; i++){
			if (a[i] == x){
				idx[n] = i;
				n++;
			}
		}
		return idx;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int l;
		do{
			System.out.println("要素数(1以上の値):");
			l =stdIn.nextInt();
		}while(l<1);
		int[] a = new int [l];
		for(int i=0;i<a.length;i++){
			System.out.println(i+1+"番目の値:");
			a[i] =stdIn.nextInt();
		}
		System.out.println("探す値:");
		int x = stdIn.nextInt();
		int[] idx = arraySrchIdx(a, x);
		for(int i = 0;i<a.length;i++){
			System.out.println(idx[i]);
		}
	}
}
