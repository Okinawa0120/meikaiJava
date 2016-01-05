package meikaiJava.Chap15;
//List15-15を拡張for分で実現したプログラムを作成せよ
public class Ex1507 {
	public static void main(String[] args) {
		double sum = 0.0;
		for (String s:args){
			sum += Double.parseDouble(s);
		}
		System.out.println("合計は" + sum + "です");
	}
}
