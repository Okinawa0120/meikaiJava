package meikaiJava.Chap07;

//2次元配列aと同じ配列を生成するメソッド
public class Ex0729 {
	static int[][] arrayClone2(int[][] a){
		int[][] clone;
		clone = new int[a.length][];
		for(int i = 0;i<a.length;i++){
			 clone[i] = new int[a[i].length];
		 }
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				clone[i][j] = a[i][j];
			}
		}
		return clone;
	}
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + "  ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int [][] x = arrayClone2(a);
		System.out.println("行列a");	printMatrix(a);
		System.out.println("行列aのコピー");	printMatrix(x);
	}
}
