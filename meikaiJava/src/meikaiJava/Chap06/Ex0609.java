package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//int型の配列を作り全要素を1~10の乱数で埋め尽くすプログラム
public class Ex0609 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner stdIn =new Scanner(System.in);
		System.out.print("要素数:");
		int l = stdIn.nextInt();
		int[] a= new int [l];
		for(int i = 0;i < l;i++){
			a[i] = rand.nextInt(10)+1;
			System.out.println(a[i]);
		}

	}

}
