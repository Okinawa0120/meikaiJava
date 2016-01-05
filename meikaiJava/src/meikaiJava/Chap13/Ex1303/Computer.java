package meikaiJava.Chap13.Ex1303;

import java.util.Random;

public class Computer extends Player{
	public Computer() {
		super();
	}
	public void setHand(){
		Random rand = new Random();
		setHand(rand.nextInt(3));
	}
}
