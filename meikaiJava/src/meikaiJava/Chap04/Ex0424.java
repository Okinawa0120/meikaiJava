package meikaiJava.Chap04;

import java.util.Scanner;
//正の整数値を読み込み素数であるか判定するプログラム
public class Ex0424 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("正の整数値");
			n = stdIn.nextInt();
		}while(n<0);
		int i;
		for(i = 2;i < n;i++){
			if((n%i)==0){
				break;
			}
		}
		if(i==n){
			System.out.println(n+"は素数です");
		}else{
			System.out.println(n+"は素数ではありません");
		}
	}

}
