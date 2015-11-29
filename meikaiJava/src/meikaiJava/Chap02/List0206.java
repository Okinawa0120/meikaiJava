package meikaiJava.Chap02;

public class List0206 {

	public static void main(String[] args) {
		int x;
		int y;
		
		x=63;
		y=18;
		
		System.out.println("xの値は"+x+"です.");
		System.out.println("yの値は"+y+"です.");
		System.out.println("合計は"+(x+y)+"です.");
		System.out.println("平均は"+(x+y)/2+"です");

	}

}
/*演習2-1
x,yに代入する値を実数にするとどうなるか考察せよ
予想
x,yに代入した時に少数部が切り捨てられた整数になり
例えばx=1.5,y=2.6とした時の合計と平均は
合計:1+2=3 平均:(1+2)/2=1(0.5は切り捨て)
となる
結果(Eclipseで実行しようとした場合)
型の不一致: double から int には変換できません
というエラーが起こり実行できない
 */