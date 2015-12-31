package meikaiJava.Chap09.Ex0903;

import meikaiJava.Chap09.Ex0902.Day;

/*演習9-3
 銀行口座クラス(第2版)に口座開設日のフィールドとtoStringメソッドを追加せよ
 */
public class Account {
	private String name;
	private String no;
	private long balance;
	private Day openDate;
	
	Account(String n, String num, long z, Day openDate) {
		name = n;
		no = num;
		balance = z;
		this.openDate = new Day(openDate);
	}

	String getName() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}
	
	Day getOpenDate(){
		return new Day(openDate);
	}
	
	public String toString(){
		return String.format("%s\n暗証番号:%s\n残高:%d"
				+ "\n口座開設日:%s",name,no,balance,openDate.toString());
	}

	
	void deposit(long k) {
		balance += k;
	}

	void withdraw(long k) {
		balance -= k;
	}
}
