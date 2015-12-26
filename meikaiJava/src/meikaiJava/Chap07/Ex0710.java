package meikaiJava.Chap07;

import java.util.Random;
import java.util.Scanner;
/*List7-11を拡張して
x+y+z
x+y-z
x-y+z
x-y-z
の4つの問題をランダムに出題するようにしたプログラム
 */
public class Ex0710 {
	static Scanner stdIn = new Scanner(System.in);
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("もう一度?<Yes…1/No…0>:");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1; 
	}

	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("暗算力トレーニング!!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			int a = rand.nextInt(4);
			switch(a){
			case 0:
				while (true) {
					System.out.print(x + " + " + y + " + " + z + " = ");
					int k = stdIn.nextInt();
					if (k == x + y + z)	{
						break;
					}
					System.out.println("違いますよ!!");
				}
				break;
			case 1:
				while (true) {
					System.out.print(x + " + " + y + " - " + z + " = ");
					int k = stdIn.nextInt();
					if (k == x + y - z)	{
						break;
					}
					System.out.println("違いますよ!!");
				}
				break;
			case 2:
				while (true) {
					System.out.print(x + " - " + y + " + " + z + " = ");
					int k = stdIn.nextInt();
					if (k == x - y + z)	{
						break;
					}
					System.out.println("違いますよ!!");
				}
				break;
			case 3:
				while (true) {
					System.out.print(x + " + " + y + " - " + z + " = ");
					int k = stdIn.nextInt();
					if (k == x + y - z)	{
						break;
					}
					System.out.println("違いますよ!!");
				}
				break;
			case 4:
				while (true) {
					System.out.print(x + " - " + y + " - " + z + " = ");
					int k = stdIn.nextInt();
					if (k == x - y - z)	{
						break;
					}
					System.out.println("違いますよ!!");
				}
			}
		} while (confirmRetry());
	}

}
