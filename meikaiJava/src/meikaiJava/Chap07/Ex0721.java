package meikaiJava.Chap07;

import java.util.Scanner;
//二つの配列の要素を交換するメソッド(要素数が異なる場合は短い方の分だけ交換する)
public class Ex0721 {
	static Scanner stdIn = new Scanner(System.in);
	static int lenInp(){
		int l;
		do{
			System.out.println("要素数(1以上の値):");
			l =stdIn.nextInt();
		}while(l<1);
		return l;
	}
	static void aryInp(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println(i+1+"番目の値:");
			a[i] =stdIn.nextInt();
		}
	}
	static void aryExchng(int[] a,int[] b){
		int l;
		if(a.length>b.length){
			l=b.length;
		}else{
			l=a.length;
		}
		for(int i = 0;i<l;i++){
			int temp = a[i];
			a[i]=b[i];
			b[i]=temp;
		}
	}
	public static void main(String[] args) {
		System.out.println("配列aの要素数");
		int[] a = new int[lenInp()];
		System.out.println("配列aの要素を入力");
		aryInp(a);
		
		System.out.println("配列bの要素数");
		int[] b = new int[lenInp()];
		System.out.println("配列bの要素を入力");
		aryInp(b);
		
		aryExchng(a, b);
		System.out.println("配列a");
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("配列b");
		for(int i = 0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
