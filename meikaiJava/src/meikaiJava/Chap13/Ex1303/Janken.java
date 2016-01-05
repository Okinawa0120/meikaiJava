package meikaiJava.Chap13.Ex1303;

import java.util.Scanner;

public class Janken {
	public static int janken(Player a,Player b){
		return (a.getHand() - b.getHand() + 3)%3;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Human you = new Human();
		Computer cpu = new Computer();
		do{
			you.setHand();
			cpu.setHand();
			while(janken(you,cpu)==0){
				System.out.println("あいこ");
				you.setHand();
				cpu.setHand();
			}
			if(janken(you,cpu)==1){
				System.out.println("あなたの負けです");
				you.setLose(you.getLose()+1);
				cpu.setWin(cpu.getWin()+1);
			}else{
				System.out.println("あなたの勝ちです");
				cpu.setLose(you.getLose()+1);
				you.setWin(cpu.getWin()+1);
			}
			System.out.println("あなた");
			System.out.println(you.toString());
			System.out.println("コンピュータ");
			System.out.println(cpu.toString());
			System.out.print("続けるなら0,終了するなら0以外の整数を入力:");
		}while(stdIn.nextInt()==0);
	}
}
