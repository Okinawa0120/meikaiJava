package meikaiJava.Chap03;

import java.util.Scanner;
//三つの整数値を読み込み照準にソートするプログラム
public class Ex0316 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a:");
		int min = stdIn.nextInt();
		System.out.print("整数値b:");
		int mid = stdIn.nextInt();
		System.out.print("整数値c:");
		int max = stdIn.nextInt();
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
		System.out.println("整数a:"+min);
		System.out.println("整数b:"+mid);
		System.out.println("整数c:"+max);
	}

}
