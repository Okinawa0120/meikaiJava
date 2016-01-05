package meikaiJava.Chap15.Ex1505;

import java.util.Scanner;

public class Human extends Player{
	public Human() {
		super();
	}
	public void setHand(){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("出す手を選択(0.グー/1.チョキ/2.パー)");
		this.setHand(stdIn.nextInt());
	}
}
