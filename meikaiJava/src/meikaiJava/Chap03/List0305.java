package meikaiJava.Chap03;

import java.util.Scanner;
//読み込んで整数値の符号(正/負/0)を判定するプログラム
public class List0305 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		if(n>0){
			System.out.println("その値は正です");
		}else if(n<0){
			System.out.println("その値は負です");
		}else if(n==0){
			System.out.println("その値は0です");
		}
	}

}
/*演習3-3 
	上記の最後のelseをelse if(n==0)に変更するとどうなるかを検討せよ
	予想
	結果は変更する前と変わらない
	結果
	変更したプログラムと変更していないプログラムで1,-1,0を入力したところ
	変化は見られなかった
*/