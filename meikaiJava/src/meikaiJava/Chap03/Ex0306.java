package meikaiJava.Chap03;

import java.util.Scanner;
//正の値を読み込み,それが10の倍数であるか判定するプログラム
public class Ex0306 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if(x>0){
			if((x%10)==0){
				System.out.println("その値は10の倍数です");
			}else{
				System.out.println("その値は10の倍数ではありません");
			}
		}else{
			System.out.println("正ではない値が入力されました");
		}
	}

}
