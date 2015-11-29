package meikaiJava.Chap03;

import java.util.Scanner;
//二つの変数a,bに値を読み込んでその大小関係を表示するプログラム
public class Ex0304 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if(a<b){
			System.out.println("bのほうが大きいです");
		}else if(a>b){
			System.out.println("aのほうが大きいです");
		}else{
			System.out.println("aとbは同じ値です");
		}

	}

}
