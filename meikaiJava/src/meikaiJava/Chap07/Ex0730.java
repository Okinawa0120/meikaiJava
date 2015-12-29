package meikaiJava.Chap07;
//aとb,aとbとc,配列aの最小値を求める多重定義のメソッド群
public class Ex0730 {
	static int min(int a,int b) {
		int min=a;
		if(min>b){
			min=b;
		}
		return min;
	}
	static int min(int a,int b,int c) {
		int min=a;
		if(min>b){
			min=b;
		}
		if(min>c){
			min=c;
		}
		return min;
	}
	static int min(int[] a){
		int min = a[0];
		for(int i=1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
	}
}
