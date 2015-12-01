package meikaiJava.Chap06;
//要素型がint型で要素数が5の配列の要素に対して,先頭から順に5,4,3,2,1を代入して表示するプログラム
public class Ex0602 {
	
	public static void main(String[] args) {
		int[] x = new int[5];
		for (int i = 0; i < 5; i++) {
			x[i] = 5-i;
			System.out.println(x[i]);
		}
	}
}
