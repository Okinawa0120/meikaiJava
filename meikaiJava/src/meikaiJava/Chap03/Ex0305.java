package meikaiJava.Chap03;

import java.util.Scanner;
//正の整数を読み込み,それが5で割り切れるかを判定するプログラム
public class Ex0305 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if(x>0){
			if((x%5)==0){
				System.out.println("その値は5で割り切れます");
			}else{
				System.out.println("その値は5で割り切れません");
			}
		}else{
			System.out.println("正ではない値が入力されました");
		}
	}

}
