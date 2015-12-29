package meikaiJava.Chap07;
//List7-20を書き換えたプログラム
public class Ex0727 {
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if(x.length!=y.length){
			return false;
		}
		for(int i = 0;i<x.length;i++){
			if(x[i].length!=y[i].length){
				return false;
			}
			
		}
		
		for (int i = 0; i < x.length; i++){
			for (int j = 0; j < x[i].length; j++){
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return true;
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
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = new int[2][3];

		boolean equal = addMatrix(a, b, c);
		System.out.println(equal);
		System.out.println("行列a");	printMatrix(a);
		System.out.println("行列b");	printMatrix(b);
		System.out.println("行列c");	printMatrix(c);
	}
}
