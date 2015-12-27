package meikaiJava.Chap07;

import java.util.Scanner;

//配列aからa[idx]を先頭にnこの要素を削除する(idxより後ろの要素をnずらす)
public class Ex0719 {
	static void aryRmvN(int a[],int idx,int n){
		for(;idx<a.length-n;idx++){
			a[idx] = a[idx+n];
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
		System.out.println("何番目から削除しますか?:");
		int idx = stdIn.nextInt()-1;
		System.out.println("なんこの要素を削除しますか?:");
		int n = stdIn.nextInt()-1;
		aryRmvN(a, idx,n);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
