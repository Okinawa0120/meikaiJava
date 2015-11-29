package meikaiJava.Chap03;

import java.util.Scanner;
/*
キーボードから読み込んだ点数に応じて優/良/可/不可を判定するプログラム
優	100〜80
良	79〜70
可	69〜60
不可	59〜0
 */
public class Ex0308 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if((x>=0)&&(x<=100)){
			if(x>=80){
				System.out.println("優");
			}else if(x<60){
				System.out.println("不可");
			}else if(x<70){
				System.out.println("可");
			}else{
				System.out.println("良");
			}
		}else{
			System.out.println("0から100の間ではない値が入力されました");
		}
	}

}
