package meikaiJava.Chap10.Ex1002;
/*演習10-2
演習10-1で作成したクラスIdを,インスタンスを生成するたびに
識別番号をnずつ増やして与えるように変更したクラスExIdを作成せよ.
nはメソッドを通じて取得変更できるようにすること
 */
class ExId {
	static int counter = 0;
	private static int n=1;

	private int id;
	
	public ExId() {
		counter += n;
		id = counter;
	}

	public int getId() {
		return id;
	}
	
	public static int getMaxId(){
		return counter;
	}
	public static int getN(){
		return n;
	}
	public static void setN(int i){
		n = i;
	}
}

public class ExIdTester {

	public static void main(String[] args) {
		ExId a = new ExId();
		
		System.out.println("n="+ExId.getN());
		System.out.println("aの識別番号" + a.getId());
		System.out.println("nを4にします");
		
		ExId.setN(4);
		ExId b = new ExId();
		
		System.out.println("bの識別番号" + b.getId());
		System.out.println("最後に与えた識別番号"+ExId.getMaxId());

		System.out.println("ExId.counter = " + ExId.counter);
		System.out.println("a.counter  = " +  a.counter);
		System.out.println("b.counter  = " +  b.counter);
	}
}
