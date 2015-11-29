package meikaiJava.Chap02;

import java.util.Scanner;
//名前の性と名を個別に読み込み,挨拶を行うプログラム
public class Ex0210 {
	
	public static void main(String[] args) {
		System.out.println("性名の順に名前を入力して下さい");
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		String f = stdIn.next();
		System.out.println("こんにちは"+s+f+"さん");
//		System.out.println(s+f+"は飯をよそえませんでした");
	}

}
