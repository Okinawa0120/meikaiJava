package meikaiJava.Chap03;

import java.util.Scanner;
//二つの整数値を読み込み,後者が前者の約数であるか調べるプログラム
public class Ex0302 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		if((x%y)==0){
			System.out.println("BはAの約数です");
		}else{
			System.out.println("BはAの約数ではありません");
		}
	}

}
