package meikaiJava.Chap13.Ex1302;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		System.out.print("図形は何個:");
		Scanner stdIn = new Scanner(System.in);
		int l = stdIn.nextInt();
		Shape[] p = new Shape[l];
		for (int i = 0; i < p.length; i++) {
			System.out.println((i+1)+"番の図形の種類(1.右上/2.右下/3.左上/4.左下)");
			int s = stdIn.nextInt();
			System.out.print("たかさ:");
			int height = stdIn.nextInt();
			switch (s) {
			case 1:
				p[i] = new RightUpper(height);
				break;
			case 2:
				p[i] = new RightLower(height);
				break;
			case 3:
				p[i] = new LeftUpper(height);
				break;
			case 4:
				p[i] = new LeftLower(height);
				break;
			}
		}

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}
