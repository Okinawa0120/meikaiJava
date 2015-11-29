package meikaiJava.Chap04;

import java.util.Scanner;
//読み込んだ値の数だけ*と+を交互に表示するプログラム
public class Ex0407 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか?");
		int n = stdIn.nextInt();

		int i = 0;
		while (i < n) {
			if(i%2==0){
				System.out.print('*');
			}else{
				System.out.print('+');
			}
			i++;
		}
		if(n>=1){
			System.out.println();
		}
	}

}
