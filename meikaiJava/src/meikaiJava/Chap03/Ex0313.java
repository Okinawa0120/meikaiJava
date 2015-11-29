package meikaiJava.Chap03;

import java.util.Scanner;
//3つの整数値を読み込み中央値を表示するプログラム
public class Ex0313 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int max = stdIn.nextInt();
		System.out.print("整数値b:");
		int mid = stdIn.nextInt();
		System.out.print("整数値c:");
		int min = stdIn.nextInt();
		if(mid<min){
			int temp=min;
			min=mid;
			mid=temp;
		}
		if(max<mid){
			int temp=mid;
			mid=max;
			max=temp;
		}
		if(mid<min){
			int temp=min;
			min=mid;
			mid=temp;
		}
		System.out.println("中央値は"+mid+"です");
	}

}
