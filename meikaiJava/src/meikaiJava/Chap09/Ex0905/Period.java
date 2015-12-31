package meikaiJava.Chap09.Ex0905;

import meikaiJava.Chap09.Ex0902.Day;
/*演習9-5
開始日と終了日から構成される期間を表すクラスを作成せよ
 */
public class Period {
	private Day from;
	private Day to;
	
	public Period(Day from,Day to) {
		this.from = from;
		this.to = to;
	}
	
	void setFrom(Day from){
		this.from = new Day(from);
	}
	void setTo(Day to){
		this.to = new Day(to);
	}
	
	Day getFrom(){
		return new Day(from);
	}
	Day getTo(){
		return new Day(to);
	}
}
