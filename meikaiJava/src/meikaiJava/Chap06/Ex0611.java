package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//異なる要素が同じ値を持たないように演習6-9を改良したプログラム
public class Ex0611 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int l;
		do{
		System.out.print("要素数:");
		l = stdIn.nextInt();
		}while((l>10)||(l<0));
		int[] a = new int [l];
		for(int i = 0;i < l;i++){
			a[i] = rand.nextInt(10)+1;
			for(int j = 0;j < i;j++){
				if(a[i]==a[j]){
					i--;
					continue;
				}
			}
		}
		for(int i : a){
			System.out.println(i);
		}
	}
}
