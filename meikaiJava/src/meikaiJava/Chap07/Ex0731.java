package meikaiJava.Chap07;
//int型,double型,float型,long型の絶対値を求める多重定義されたメソッド群
public class Ex0731 {
	static int absolute(int x){
		if(x<0){
			x*=-1;
		}
		return x;
	}
	static long absolute(long x){
		if(x<0){
			x*=-1;
		}
		return x;
	}
	static float absolute(float x){
		if(x<0){
			x*=-1;
		}
		return x;
	}
	static double absolute(double x){
		if(x<0){
			x*=-1;
		}
		return x;
	}
}
