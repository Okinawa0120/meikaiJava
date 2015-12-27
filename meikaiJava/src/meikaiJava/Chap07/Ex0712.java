package meikaiJava.Chap07;

import java.util.Scanner;

/*整数を右にnビット回転するメソッドと左にnビット回転するメソッド
回転とは最上位ビットと最下位ビットがつながっているとみなしてシフトすること
 */
public class Ex0712 {
	static int rRotate(int x,int n){
		n %= 32;
		int temp = x <<(32-n);
		n = x >> n;
		n |= temp;
		return n;
	}
	static int lRotate(int x,int n){
		n %= 32;
		int temp = x >>(32-n);
		n = x << n;
		n |= temp;
		return n;
	}
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("シフトする整数を入力してください:");
		int a = stdIn.nextInt();
		System.out.println("何bitシフトしますか?:");
		int b = stdIn.nextInt();
		int r = rRotate(a, b);
		int l = lRotate(a, b);
		System.out.print("右");
		printBits(r);
		System.out.print("\n左");
		printBits(l);
	}
}
