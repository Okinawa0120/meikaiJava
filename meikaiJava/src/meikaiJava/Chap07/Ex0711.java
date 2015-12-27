package meikaiJava.Chap07;

import java.util.Scanner;
//整数をシフトした値が2のべき乗の乗算または除算と等しくなることを確認するプログラム
public class Ex0711 {
	static int power(int x, int n) {
		int tmp = 1;

		while (n-- > 0)
			tmp *= x;
		return tmp;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("シフトする整数を入力してください:");
		int a = stdIn.nextInt();
		System.out.println("何bitシフトしますか?(右にシフトするなら負,左にシフトするなら正):");
		int b = stdIn.nextInt();
		if(b<0){
			b *= -1;
			System.out.println(a+"を"+b+"bit右にシフトした整数は"+(a>>b));
			System.out.println(a+"を2の"+b+"乗で割った値は"+(a/power(2,b)));
		}else{
			System.out.println(a+"を"+b+"bit左にシフトした整数は"+(a<<b));
			System.out.println(a+"と2の"+b+"乗の積は"+(a*power(2,b)));
		}
	}
}