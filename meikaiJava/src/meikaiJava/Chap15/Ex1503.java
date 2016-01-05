package meikaiJava.Chap15;

import java.util.Scanner;
//文字列探索のプログラムを書き換えて一致する部分が上下揃うようにせよ
public class Ex1503 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("文字列1:");
		String s1 = stdIn.next();
		System.out.print("文字列2:");
		String s2 = stdIn.next();
		int idx = s1.indexOf(s2);
		if(idx == -1){
			System.out.println(s2+"は"+s1+"に含まれません");
		}else{
			System.out.println("s1:"+s1);
			System.out.print("s2:");
			for(int i = 0;i<idx;i++){
				System.out.print(' ');
			}
			System.out.println(s2);
		}
	}
}
