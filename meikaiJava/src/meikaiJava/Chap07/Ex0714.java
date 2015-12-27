package meikaiJava.Chap07;

import java.util.Scanner;

//posビット目を最下位としてnビット目までを1にするメソッドsetN
//posビット目を最下位としてnビット目までを0にするメソッドresetN
//posビット目を最下位としてnビット目までを反転するメソッドinverseN
public class Ex0714 {
	static int power(int x, int n) {
		int tmp = 1;

		while (n-- > 0)
			tmp *= x;
		return tmp;
	}
	static int inverseN(int x, int pos,int n){
		int temp = power(2,n)-1;
		temp <<= (pos-1);
		x ^= temp;
		return x;
	}
	static int resetN(int x, int pos,int n){
		int temp = power(2,n)-1;
		temp <<= (pos-1);
		x &= ~temp;
		return x;
	}
	static int setN(int x, int pos,int n){
		int temp = power(2,n)-1;
		temp <<= (pos-1);
		x |= temp;
		return x;
	}
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数を入力してください:");
		int a = stdIn.nextInt();
		System.out.print(a+"は二進数で");
		printBits(a);
		System.out.println("\n何bit目から変更しますか?:");
		int pos =stdIn.nextInt();
		System.out.println("何bit変更しますか?");
		int n = stdIn.nextInt();
		setN(a, pos, n);
		System.out.print("set ");
		printBits(setN(a, pos, n));
		System.out.print("\nreset ");
		printBits(resetN(a, pos, n));
		System.out.print("\ninverse ");
		printBits(inverseN(a, pos, n));
	}
}
