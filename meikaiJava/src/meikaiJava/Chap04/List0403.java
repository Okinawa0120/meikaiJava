package meikaiJava.Chap04;

import java.util.Random;
import java.util.Scanner;
//数当てゲーム(0〜99を当てさせる)
public class List0403 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);

		System.out.println("数当てゲーム開始!!");
		System.out.println("0〜99の数を当てて下さい");

		int x;
//		int i = 0;
		do {
			System.out.print("いくつかな:");
			x = stdIn.nextInt();

			if (x > no){
				System.out.println("もっと小さな数だよ");
			}
			else if (x < no){
				System.out.println("もっと大きな数だよ");
			}
//			i++;
		} while (/*(*/x != no/*)&&(i<5)*/);
//		if(i==5){
//			System.out.println("正解は"+no+"でした");
//		}else{
			System.out.println("正解です");
//		}
	}
}
/*
演習4-27 数当てゲームのプレーヤーが入力できる回数に制限を設けたプログラムをせよ.
演習で追加した文はコメントアウトした.
*/