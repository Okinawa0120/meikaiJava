package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;
//クラス数,各クラスの人数と全員の点数を読み込みクラスごとの合計点,平均点と全体の合計点,平均点を求めるプログラム
public class Ex0619 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int[][] a;
		System.out.print("クラス数:");
		int h = stdIn.nextInt();
		a = new int[h][];
		for(int i = 0;i < a.length;i++){
			int w;
			do{
				System.out.print((i+1)+"組の人数:");
				w = stdIn.nextInt();
			}while(w<1);
			a[i] = new int[w];
		}
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				a[i][j] = rand.nextInt(101);
				System.out.println((i+1)+"組"+(j+1)+"番の学生の点数は"+a[i][j]+"点です");
			}
		}
		int[] sumClass = new int [a.length];
		int sum = 0,n=0;
		for(int i = 0;i < a.length;i++){
			for(int j : a[i]){
				sumClass[i] += j;
				sum += j;
			}
			n += a[i].length;
		}
		for(int i = 0;i <a.length;i++){
			System.out.println((i+1)+"組の合計点は"+sumClass[i]+ "平均点は"+(double)sumClass[i]/a[i].length+"点");
		}
		System.out.println("全体の合計点は"+sum+"平均点は"+(double)sum/n +"です");
	}

}
