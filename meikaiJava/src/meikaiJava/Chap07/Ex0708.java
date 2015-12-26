package meikaiJava.Chap07;

import java.util.Random;
import java.util.Scanner;

//a以上b未満の乱数を生成するメソッド
public class Ex0708 {
	static int random(int a,int b){
		int r;
		Random rand = new Random();
		r = rand.nextInt(b-a)+a;
		return r;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a以上b未満の乱数を生成します");
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		if(a>b){
			System.out.println("aはbより小さい値にしてください");
		}else{
		a=random(a,b);
		System.out.println(a);
		}
	}
}
