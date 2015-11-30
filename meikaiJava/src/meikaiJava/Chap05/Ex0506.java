package meikaiJava.Chap05;
/*
float型変数を0.0から1.0まで0.001ずつ増やしていく様子と
int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を
横に並べて表示すプログラム
 */
public class Ex0506 {
	
	public static void main(String[] args) {
		int i=0;
		System.out.println("  float    int   ");
		System.out.println("-----------------");
		for (float xf = 0.0F;(xf <= 1.0F)||(i <= 1000); xf += 0.001F,i++) {
			System.out.printf("%8f ",xf);
			float xi = (float)i / 1000;
			System.out.printf("%8f\n",xi);
		}
	}

}
