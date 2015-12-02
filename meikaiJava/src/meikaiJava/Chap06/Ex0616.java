package meikaiJava.Chap06;

import java.util.Scanner;
//4行3列の行列と3行4列の行列の積を求めるプログラム
public class Ex0616 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] a = new int [4][3];
		int[][] b = new int [3][4];
		//iが行,jが列
		System.out.println("行列a");
		for(int i = 0;i < 4;i++){
			for(int j = 0;j <3;j++){
				System.out.print((i+1)+"行"+(j+1)+"列:");
				a[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("行列b");
		for(int i = 0;i < 3;i++){
			for(int j = 0;j <4;j++){
				System.out.print((i+1)+"行"+(j+1)+"列:");
				b[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("行列a");
		for(int i = 0;i < 4;i++){
			for(int j = 0;j <3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("行列b");
		for(int i = 0;i < 3;i++){
			for(int j = 0;j <4;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int[][] t = new int [4][4];
		for(int i = 0;i < 4;i++){
			for(int j = 0;j <4;j++){
				for(int n = 0;n<3;n++){
				t[i][j] += a[i][n]*b[n][j];
				}
			}
		}
		System.out.println("行列aと行列bの積");
		for(int i = 0;i < 4;i++){
			for(int j = 0;j <4;j++){
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}

}
