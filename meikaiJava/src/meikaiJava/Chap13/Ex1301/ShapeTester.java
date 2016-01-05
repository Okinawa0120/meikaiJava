package meikaiJava.Chap13.Ex1301;

import java.util.Scanner;

/*演習13-1
図形クラス群をテストするプログラムを作成せよ.
Shape型の配列を利用して,インスタンスの生成と表示を行うこと
個々の要素が参照するインスタンスはキーボードから読み込むこと
 */
public class ShapeTester {

	public static void main(String[] args) {
		System.out.print("図形は何個:");
		Scanner stdIn = new Scanner(System.in);
		int l = stdIn.nextInt();
		Shape[] p = new Shape[l];
		for (int i = 0; i < p.length; i++) {
			System.out.println((i+1)+"番の図形の種類(1.点/2.水平線/3.垂直線/4.長方形)");
			int s = stdIn.nextInt();
			switch (s) {
			case 1:
				p[i] = new Point();
				break;
			case 2:
				System.out.print("長さ:");
				int hlength = stdIn.nextInt();
				p[i] = new HorzLine(hlength);
				break;
			case 3:
				System.out.print("長さ:");
				int vlength = stdIn.nextInt();
				p[i] = new VirtLine(vlength);
				break;
			case 4:
				System.out.print("幅:");
				int width = stdIn.nextInt();
				System.out.print("たかさ:");
				int height = stdIn.nextInt();
				p[i] = new Rectangle(width, height);
				break;
			}
		}

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}
