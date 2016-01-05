package meikaiJava.Chap15;

import java.util.Scanner;
/*演習15-1
 * 文字列を読み込んでその文字列を逆順に表示するプログラムを作成せよ.
 */
public class Ex1501 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("任意の文字列を入力:");
		String s = stdIn.next();
		System.out.println("逆順に表示します");
		for(int i = s.length();i>0;i--){
			System.out.print(s.charAt(i-1));
		}
		System.out.println();
	}
}
