package meikaiJava.Chap07;

import java.util.Scanner;

//渡された配列と要素数,全要素が同じ配列を生成し返却するメソッド
public class Ex0722 {
	static int[] arrayClone(int[] a){
		int[] clone = new int[a.length];
		for(int i=0;i<a.length;i++){
			clone[i] = a[i];
		}
		return clone;
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
		int [] x = arrayClone(a);
		for(int i = 0;i<a.length;i++){
			System.out.println(x[i]);
		}
	}
}
