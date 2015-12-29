package meikaiJava.Chap07;
//int型の1次元配列とint型の2次元配列の全要素を表示する多重定義されたメソッド群
public class Ex0733 {
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	
	static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
