package meikaiJava.Chap07;

import java.util.Scanner;
//指定した桁の数字を1にするメソッドset
//指定した桁の数字を0にするメソッドreset
//指定した桁の数字を反転するメソッドinverse
public class Ex0713 {
	static int inverse(int x, int pos){
		int temp = 1;
		temp <<= (pos-1);
		x ^= temp;
		return x;
	}
	static int reset(int x, int pos){
		int temp = 1;
		temp <<= (pos-1);
		temp = ~temp;
		x &= temp;
		return x;
	}
	static int set(int x, int pos){
		int temp = 1;//0b00000000000000000000000000000001
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
		System.out.println("\n何bit目を変更しますか?:");
		int pos =stdIn.nextInt();
		System.out.print("set ");
		printBits(set(a,pos));
		System.out.print("\nreset ");
		printBits(reset(a,pos));
		System.out.print("\n inverse ");
		printBits(inverse(a,pos));
	}
}
