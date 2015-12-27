package meikaiJava.Chap07;

import java.util.Scanner;
//探索するキーと同じ値が複数あるときもっとも末尾側にある値を返すメソッド
public class Ex0717 {
	static int linerSerchR(int[] a,int key){
		for (int i = a.length-1; i >= 0; i--){
			if (a[i] == key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int l;
		do{
			System.out.println("要素数(1以上の値):");
			l =stdIn.nextInt();
		}while(l<1);
		int[] a = new int [l];
		for(int i=0;i<a.length;i++){
			System.out.println(i+1+"番目の値:");
			a[i] =stdIn.nextInt();
		}
		System.out.println("キー:");
		int key = stdIn.nextInt();
		l = linerSerchR(a,key);
		if(l==-1){
			System.out.println("その値は存在しません");
		}else{
			System.out.println("その値はa["+l+"]にあります");
		}
	}
}
