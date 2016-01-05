package meikaiJava.Chap14.Ex1401;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("並行四辺形");
		System.out.print("幅:");
		int width = stdIn.nextInt();
		System.out.print("たかさ:");
		int height = stdIn.nextInt();
		Parallelogram p = new Parallelogram(width, height);
		System.out.println(p.toString());
		System.out.println("面積は"+p.getArea());
		System.out.println();
		
		System.out.println("長方形");
		System.out.print("幅:");
		width = stdIn.nextInt();
		System.out.print("たかさ:");
		height = stdIn.nextInt();
		Rectangle r = new Rectangle(width, height);
		System.out.println(r.toString());
		System.out.println("面積は"+r.getArea());
}
}
