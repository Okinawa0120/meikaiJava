package meikaiJava.Chap05;
//0.0から1.0まで0.001おきに,その値と,その値の2乗を表示するプログラム
public class Ex0507 {
	
	public static void main(String[] args) {
		for (float x = 0.0F; x <= 1.0F; x += 0.002F) {
			System.out.printf("x = %8f",x);
			System.out.printf(" x^2 = %8f\n",(x*x));
		}
	}

}
