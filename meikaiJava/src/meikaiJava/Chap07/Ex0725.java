package meikaiJava.Chap07;

import java.util.Scanner;

//配列aからa[idx]を先頭にnこの要素を削除した配列を生成するメソッド
public class Ex0725 {
	static int[] arrayRmv0fN(int a[],int idx,int n){
		int[] rmv = new int[a.length-n];
		for(int i = 0;i<idx;i++){
			rmv[i]=a[i];
		}
		for(;idx<a.length-n;idx++){
			rmv[idx] = a[idx+n];
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
		System.out.println("何番目から削除しますか?:");
		int idx = stdIn.nextInt()-1;
		System.out.println("なんこの要素を削除しますか?:");
		int n = stdIn.nextInt();
		int[] rmv = arrayRmv0fN(a, idx, n);
		for(int i = 0;i<a.length;i++){
			System.out.println(rmv[i]);
		}
	}
}
