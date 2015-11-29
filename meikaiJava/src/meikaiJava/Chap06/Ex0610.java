package meikaiJava.Chap06;

import java.util.Random;
import java.util.Scanner;

public class Ex0610 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int l = stdIn.nextInt();
		int[] a = new int [l];
		for(int i = 0;i < l;i++){
			a[i] = rand.nextInt()+1;
			
		}
	}

}
