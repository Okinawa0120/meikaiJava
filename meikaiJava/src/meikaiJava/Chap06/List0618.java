package meikaiJava.Chap06;

//import java.util.Scanner;
//凸凹な二次元配列
public class List0618 {
	public static void main(String[] args) {
		int[][] c;
		/*
		Scanner stdIn = new Scanner(System.in);
		System.out.print("行数:");
		int h = stdIn.nextInt();
		c = new int[h][];
		for(int i = 0;i < h;i++){
			int w;
			do{
				System.out.print(i+"行目の列数:");
				w = stdIn.nextInt();
			}while(w<1);
			c[i] = new int[w];
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++){
				System.out.print((i+1)+"行"+(j+1)+"列:");
				c[i][j] = stdIn.nextInt();
			}
		}
		*/
		c = new int[3][];
		c[0] = new int[5];
		c[1] = new int[3];
		c[2] = new int[4];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++){
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
	}
}
/*
演習6-18 List6-18を書き換えて行数,各行の列数,各要素の値をキーボードから読み込むようにしたプログラムを作成せよ
演習で追加した文はコメントアウトした
*/