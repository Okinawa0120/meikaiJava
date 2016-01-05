package meikaiJava.Chap15;

import java.util.Scanner;
//読み込んだ文字列の全文字の文字コードを表示するプログラムを作成せよ
public class Ex1502 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("任意の文字列を入力:");
		String s = stdIn.next();
		System.out.println("文字コードを表示します");
		for(int i = 0;i<s.length();i++){
			System.out.println((i+1)+"番目の文字コードは"+s.codePointAt(i));
		}
	}
}
