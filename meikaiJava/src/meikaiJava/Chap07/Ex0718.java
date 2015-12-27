package meikaiJava.Chap07;

import java.util.Scanner;

//配列aから要素a[idx]を削除する(idxより後ろの要素を1つずらす)メソッド
public class Ex0718 {
	static void aryRmv(int a[],int idx){
		for(;idx<a.length-1;idx++){
			a[idx] = a[idx+1];
		}
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
		aryRmv(a, idx);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
