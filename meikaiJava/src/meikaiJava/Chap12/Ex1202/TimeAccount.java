package meikaiJava.Chap12.Ex1202;
/*演習12-2
定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した
結果を返却するメソッドを作成せよ.
ただしaやbの参照先が,Accountクラス型のインスタンスであれば,普通預金の金額を比較の対象とすること
 */
class TimeAccount extends Account {
	private long timeBalance;
	
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	long getTimeBalance() {
		return timeBalance;
	}

	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	static int compBalance(Account a,Account b){
		long suma = a.getBalance();
		long sumb = b.getBalance();
		if ((a instanceof TimeAccount)&&(b instanceof TimeAccount)) {
			suma += ((TimeAccount) a).getTimeBalance();
			sumb += ((TimeAccount) b).getTimeBalance();	
		}
		if(suma>sumb){
			return 1;
		}else if(suma<sumb){
			return -1;
		}
		return 0;
	}
}