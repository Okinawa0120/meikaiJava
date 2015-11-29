package meikaiJava.Chap03;

import java.util.Random;
/*
0,1,2のどれかの値の乱数を生成し
0ならグー
1ならチョキ
2ならパー
を表示するプログラム
 */
public class Ex0317 {
	public static void main(String[] args){
		Random rand = new Random();
		int x =rand.nextInt(3);
		switch (x) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;
		}
	}
}
