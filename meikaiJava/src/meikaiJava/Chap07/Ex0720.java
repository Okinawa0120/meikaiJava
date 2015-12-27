package meikaiJava.Chap07;

import java.util.Scanner;
//a[idx]にxを挿入するメソッド
public class Ex0720 {
	static void aryIns(int a[],int idx,int x){
		for(int i = a.length-1;i>idx;i--){
			a[i] = a[i-1];
		}
		a[idx]=x;
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
		System.out.println("何番目に値を挿入しますか?:");
		int idx = stdIn.nextInt()-1;
		System.out.println("挿入する値:");
		int x = stdIn.nextInt();
		aryIns(a,idx,x);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
