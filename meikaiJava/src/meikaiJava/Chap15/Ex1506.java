package meikaiJava.Chap15;
//コマンドライン引数で与えられた半径を持つ円の円周と面積を表示するプログラムを作成せよ
public class Ex1506 {

	public static void main(String[] args) {
		final double PI = 3.14159265359;
		for(int i = 0;i<args.length;i++){
			System.out.println("半径が"+Double.parseDouble(args[i])+
					"の円の円周は"+Double.parseDouble(args[i])*2*PI+
					"で,面積は"+Double.parseDouble(args[i])*Double.parseDouble(args[i])*PI);
		}

	}

}
