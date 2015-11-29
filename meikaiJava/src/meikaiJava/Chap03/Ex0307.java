package meikaiJava.Chap03;

import java.util.Scanner;
/*正の値を読み込み,それを3で割ったあまりに応じて
	割り切れる
	あまり1
	あまり2
	のどれかを表示するプログラム
 */
public class Ex0307 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if(x>0){
			if((x%3)==0){
				System.out.println("その値は3で割り切れます");
			}else if((x%3)==1){
				System.out.println("その値を3で割ったあまりは1です");
			}else{
				System.out.println("その値を3で割ったあまりは2です");
			}
		}else{
			System.out.println("正ではない値が入力されました");
		}
	}

}
