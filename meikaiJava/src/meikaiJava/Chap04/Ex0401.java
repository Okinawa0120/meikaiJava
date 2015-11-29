package meikaiJava.Chap04;

import java.util.Scanner;
//List0305を好きなだけ何度もでも繰り返し実行できるようにしたプログラム
public class Ex0401 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do{
			System.out.println("整数値:");
			int n = stdIn.nextInt();
			if(n>0){
				System.out.println("その値は正です");
			}else if(n<0){
				System.out.println("その値は負です");
			}else if(n==0){
				System.out.println("その値は0です");
			}
			System.out.println("もう一度実行するなら1を入力");
			retry = stdIn.nextInt();
		}while(retry==1);
	}

}
