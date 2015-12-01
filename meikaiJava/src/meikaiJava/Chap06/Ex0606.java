package meikaiJava.Chap06;

import java.util.Scanner;
//人数と点数を読み込みテストの合計点,平均点,最高点,最低点を表示するプログラム
public class Ex0606 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("人数:");
		final int ninzu = stdIn.nextInt();
		int[] tensu = new int[ninzu];
		System.out.println(ninzu + "の点数を入力してください");
		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "番の点数");
			tensu[i] = stdIn.nextInt();	
		}

		int max = tensu[0];
		int min = tensu[0];
		int sum = tensu[0];
		for (int i = 1; i < tensu.length; i++){
			sum += tensu[i];
			if (tensu[i] > max){ 
				max = tensu[i];
			}else if (tensu[i] < min){
				min = tensu[i];
			}
		}
		System.out.println("最高点は" + max + "です");
		System.out.println("最低点は" + min + "です");
		System.out.println("合計点は" + sum + "です");
		System.out.println("平均点は" + (double)sum/ninzu +"です");
	}

}
