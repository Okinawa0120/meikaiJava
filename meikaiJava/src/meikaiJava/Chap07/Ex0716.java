package meikaiJava.Chap07;

import java.util.Scanner;
//配列の最小値を求めるメソッド
public class Ex0716 {
	static int min0f(int[] a){
		int min = a[0];
		for(int i=1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
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
		l = min0f(a);
		System.out.println("最小値は"+l+"です");
	}
}
