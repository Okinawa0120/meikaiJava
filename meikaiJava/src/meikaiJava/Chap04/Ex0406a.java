package meikaiJava.Chap04;

import java.util.Scanner;
//List4-7を書き換え読み込んだ値が1未満(*を一個も表示しない)時,改行文字を表示しないようにしたプログラム
public class Ex0406a {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか?");
		int n = stdIn.nextInt();

		int i = 0;
		while (i < n) {
			System.out.print('*');
			i++;
		}
		if(n>0){
			System.out.println();
		}
	}	

}
