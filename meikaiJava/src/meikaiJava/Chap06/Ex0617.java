package meikaiJava.Chap06;

import java.util.Random;
//6人の国語と数学の点数を読み込んで,科目ごと,学生ごとに平均点を求めるプログラム
public class Ex0617 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] a = new int [6][2];
		//a[生徒][教科],教科は0が国語,1が数学
		for(int i = 0;i < 6;i++){
			a[i][0] = rand.nextInt(101);
			System.out.println((i+1)+"番の学生の国語の点数は"+a[i][0]+"点です");
			a[i][1] = rand.nextInt(101);
			System.out.println((i+1)+"番の学生の数学の点数は"+a[i][1]+"点です");
		}
		int sum0 = 0,sum1 = 0;
		int[] sumStudent = new int [6];
		for(int i = 0;i < 6;i++){
			sum0 += a[i][0];
			sum1 += a[i][1];
			sumStudent[i] = a[i][0]+a[i][1];
		}
		System.out.println("国語の平均点は"+(double)sum0/6+"点");
		System.out.println("数学の平均点は"+(double)sum1/6+"点");
		for(int i = 0;i <6;i++){
			System.out.println((i+1)+"番の学生の平均点は"+(double)sumStudent[i]/2+"点");
		}
	}

}
