package meikaiJava.Chap04;

import java.util.Random;
import java.util.Scanner;
//10~99の二桁の整数値を当てる数当てゲーム
public class Ex0402 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int no = rand.nextInt(89)+10;
		System.out.println("数当てゲーム 2桁の整数を当ててください");
		do{
			System.out.println("整数値を入力:");
			int in = stdIn.nextInt();
			if(in>no){
				System.out.println("もっと小さな数です");
			}else if(in<no){
				System.out.println("もっと大きな数です");
			}else{
				System.out.println("正解!");
				break;
			}
			
		}while(true);
		
	}

}
