package meikaiJava.Chap15.Ex1505;
/*演習13-3
 * じゃんけんのプレイヤーを表す抽象クラスを定義しそのクラスから派生して
 * 人間プレイヤークラス(手をキーボードから読み込む)
 * コンピュータプレイヤークラス(手を乱数で生成する)
 * を作成せよ
 */
public class Player {
	private int win;
	private int lose;
	private int hand;
	public Player() {
		this.win = 0;
		this.lose = 0;
		this.hand = 0;
	}
	public int getHand() {
		return hand;
	}
	public int getWin() {
		return win;
	}
	public int getLose() {
		return lose;
	}
	public void setHand(int hand) {
		this.hand = hand;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	
	public String toString() {
		return "win:"+getWin() + " lose:"+getLose() + " hand:"+getHand();
	}
}
