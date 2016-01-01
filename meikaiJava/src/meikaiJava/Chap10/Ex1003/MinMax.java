package meikaiJava.Chap10.Ex1003;
/*演習10-3
 二値,三値,配列の最大値,最小値を求めるメソッドを集めたユーティリティクラスを作成せよ
 */
public class MinMax {
	//二値,最小
	public static byte min(byte a,byte b){
		return a<b ? a : b;
	}
	public static short min(short a,short b){
		return a<b ? a : b;
	}
	public static int min(int a,int b){
		return a<b ? a : b;
	}
	public static long min(long a,long b){
		return a<b ? a : b;
	}
	public static float min(float a,float b){
		return a<b ? a : b;
	}
	public static double min(double a,double b){
		return a<b ? a : b;
	}
	
	//二値,最大
	public static byte max(byte a,byte b){
		return a>b ? a : b;
	}
	public static short max(short a,short b){
		return a>b ? a : b;
	}
	public static int max(int a,int b){
		return a>b ? a : b;
	}
	public static long max(long a,long b){
		return a>b ? a : b;
	}
	public static float max(float a,float b){
		return a>b ? a : b;
	}
	public static double max(double a,double b){
		return a>b ? a : b;
	}
	
	//三値,最小
	public static byte min(byte a,byte b,byte c){
		byte min = a;
		if(min>b){
			min = b;
		}
		if(min>c){
			min = c;
		}
		return min;
	}
	public static short min(short a,short b,short c){
		short min = a;
		if(min>b){
			min = b;
		}
		if(min>c){
			min = c;
		}
		return min;
	}
	public static int min(int a,int b,int c){
		int min = a;
		if(min>b){
			min = b;
		}
		if(min>c){
			min = c;
		}
		return min;
	}
	public static long min(long a,long b,long c){
		long min = a;
		if(min>b){
			min = b;
		}
		if(min>c){
			min = c;
		}
		return min;
	}
	public static float min(float a,float b,float c){
		float min = a;
		if(min>b){
			min = b;
		}
		if(min>c){
			min = c;
		}
		return min;
	}
	public static double min(double a,double b,double c){
		double min = a;
		if(min>b){
			min = b;
		}
		if(min>c){
			min = c;
		}
		return min;
	}
	
	//三値,最大
	public static byte max(byte a,byte b,byte c){
		byte max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		return max;
	}
	public static short max(short a,short b,short c){
		short max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		return max;
	}
	public static int max(int a,int b,int c){
		int max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		return max;
	}
	public static long max(long a,long b,long c){
		long max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		return max;
	}
	public static float max(float a,float b,float c){
		float max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		return max;
	}
	public static double max(double a,double b,double c){
		double max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		return max;
	}
	
	//配列,最小
	public static byte min(byte[] a){
		byte min = a[0];
		for(int i = 1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
	}
	public static short min(short[] a){
		short min = a[0];
		for(int i = 1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
	}
	public static int min(int[] a){
		int min = a[0];
		for(int i = 1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
	}
	public static long min(long[] a){
		long min = a[0];
		for(int i = 1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
	}
	public static float min(float[] a){
		float min = a[0];
		for(int i = 1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
	}
	public static double min(double[] a){
		double min = a[0];
		for(int i = 1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		return min;
	}
	
	//配列,最大
		public static byte max(byte[] a){
			byte max = a[0];
			for(int i = 1;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
				}
			}
			return max;
		}
		public static short max(short[] a){
			short max = a[0];
			for(int i = 1;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
				}
			}
			return max;
		}
		public static int max(int[] a){
			int max = a[0];
			for(int i = 1;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
				}
			}
			return max;
		}
		public static long max(long[] a){
			long max = a[0];
			for(int i = 1;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
				}
			}
			return max;
		}
		public static float max(float[] a){
			float max = a[0];
			for(int i = 1;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
				}
			}
			return max;
		}
		public static double max(double[] a){
			double max = a[0];
			for(int i = 1;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
				}
			}
			return max;
		}
}
