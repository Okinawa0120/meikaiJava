package meikaiJava.Chap04;

import java.util.Scanner;
//読み込んだ数だけ*を表示
public class List0411 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか:");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++){
			System.out.print('*');
//			if((i%5)==0){
//				System.out.println();
//			}
		}
//		if(n > 0){
			System.out.println();
//		}
	}

}
/*
演習4-10
読み込んだ値が1未満の時改行文字を出力しないように
List4-11を書き換えたプログラムを作成せよ
for文の後のコメントアウトされたif文が演習で追加した文
演習4-16
5個*を表示するごとに改行するようにList4-11を書き換えた
プログラムを作成せよ
for文中のコメントアウトされたif文が演習で追加した文
*/
