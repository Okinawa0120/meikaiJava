package meikaiJava.Chap07;

import java.util.Scanner;
//配列の全要素の合計を求めるメソッド
public class Ex0715 {
	static int sum0f(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
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
		l = sum0f(a);
		System.out.println("全要素の合計は"+l+"です");
	}
}
