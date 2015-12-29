package meikaiJava.Chap07;

import java.util.Scanner;
//a[idx]にxを挿入した配列を生成するメソッド
public class Ex0726 {
	static int[] arrayIns0f(int a[],int idx,int x){
		int[] ins = new int[a.length+1];
		for(int i = 0;i<idx;i++){
			ins[i]=a[i];
		}
		ins[idx]=x;
		for(int i = ins.length-1;i>idx;i--){
			ins[i] = a[i-1];
		}
		return ins;
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
		int[] ins = arrayIns0f(a,idx,x);
		for(int i = 0;i<ins.length;i++){
			System.out.println(ins[i]);
		}
	}
}
