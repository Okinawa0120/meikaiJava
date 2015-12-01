package meikaiJava.Chap06;

import java.util.Scanner;
//配列の要素数と個々の要素の値を読み込んで初期化しと同様の形式で各要素の値を表示するプログラム
public class Ex0605 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("要素数:");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[i] = ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("a = {");
		for(int i = 0; i < n; i++){
			if(i!=0){
				System.out.print(", ");
			}
			System.out.print(x[i]);
		}
		System.out.println("}");
	}

}
