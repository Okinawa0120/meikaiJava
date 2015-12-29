package meikaiJava.Chap07;

import java.util.Scanner;

//配列aからa[idx]を削除した配列を生成するメソッド
public class Ex0724 {
	static int[] arrayRmv0f(int a[],int idx){
		int[] rmv = new int[a.length-1];
		for(int i = 0;i<idx;i++){
			rmv[i]=a[i];
		}
		for(;idx<a.length-1;idx++){
			rmv[idx] = a[idx+1];
		}
		return rmv;
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
		System.out.println("何番目の値を削除しますか?:");
		int idx = stdIn.nextInt()-1;
		int[] rmv = arrayRmv0f(a, idx);
		for(int i = 0;i<rmv.length;i++){
			System.out.println(rmv[i]);
		}
	}
}
