package meikaiJava.Chap06;
//要素型がdouble型で要素数が5の配列の要素に対して先頭から1.1,2.2,3.3,4.4,5.5を代入して表示するプログラム
public class Ex0603 {
	
	public static void main(String[] args) {
		double[] x = new double[5];
		for (int i = 0; i < 5; i++) {
			x[i] = (i+1)*11;
			x[i] /= 10;
			System.out.println(x[i]);
		}
	}
}
/*
x[i]=(i+1)*1.1とするとi=2で3.3000000000000003となるため

x[i] = (i+1)*11;
x[i] /= 10;
とした
 */