package meikaiJava.Chap07;
//byte型,short型,int型,long型
public class Ex0732 {
	static void printBits(byte x) {
		for (int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	static void printBits(short x) {
		for (int i = 15; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	static void printBits(long x) {
		for (int i = 63; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
}
