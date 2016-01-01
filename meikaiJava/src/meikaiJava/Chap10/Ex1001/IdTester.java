package meikaiJava.Chap10.Ex1001;
/*演習10-1
 List10-3のクラスIdに最後に与えた識別番号を返すメソッドを追加せよ
 */
class Id {
	static int counter = 0;

	private int id;
	
	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
	
	public static int getMaxId(){
		return counter;
	}
}

public class IdTester {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("aの識別番号" + a.getId());
		System.out.println("bの識別番号" + b.getId());
		System.out.println("最後に与えた識別番号"+Id.getMaxId());

		System.out.println("Id.counter = " + Id.counter);
		System.out.println("a.counter  = " +  a.counter);
		System.out.println("b.counter  = " +  b.counter);
	}
}
