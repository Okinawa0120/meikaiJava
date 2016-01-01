package meikaiJava.Chap10.Ex1004;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
//日付クラス(第4版)
/*演習10-4
日付クラス(第4版)を以下のように改良せよ
・引数なしのコンストラクタによる初期化を実行時の日付でする.
・不正な引数(13月など)指定されたら適切な値に調整する.
以下のメソッドを追加せよ
・元旦から何日目であるかを求めるメソッド
・年何の残り日数を求めるメソッド
・他の日付との前後関係を判定するインスタンスメソッド
・二つの日付の前後関係を判定するクラスメソッド
・日付を一つ進めるメソッド
・次の日の日付を返すメソッド
・日付を1つ戻すメソッド
・前の日の日付を返すメソッド
・日付をn日進めるメソッド
・n日後の日付を返すメソッド
・日付をn日戻すメソッド
・n日前の日付を返すメソッド
 */
public class Day {
	GregorianCalendar today = new GregorianCalendar();
	private int year  = today.get(YEAR);
	private int month = today.get(MONTH) + 1;
	private int date  = today.get(DATE);
	private final int[] MONTHMAX = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	public Day(){ }
	public Day(int year){
		this.year = year;
	}
	public Day(int year, int month){
		this(year);
		if(month<0){
			month = 1;
		}else if(month>12){
			month = 12;
		}
		this.month = month;
	}
	public Day(int year, int month, int date){
		this(year, month);
		if(date<0){
			date = 1;
		}else if(date>MONTHMAX[this.month-1]){
			date = MONTHMAX[this.month-1];
		}
		this.date = date;
	}
	public Day(Day d){
		this(d.year, d.month, d.date);
	}

	public int getYear()  { return year; }
	public int getMonth() { return month; }
	public int getDay()   { return date; }

//---------------------------------------------------
	//元旦から何日目であるかを求めるメソッド
	public int howManyDays(){
		int days=0;
		for(int i = 1;i<this.month;i++){
			if((i==2)&&(isLeap(this.year))){
				days += 29;
			}else{
				days += MONTHMAX[i];
			}
		}
		days += this.date;
		return days;
	}
	//年内の残り日数を求めるメソッド
	public int theRemainder(){
		int days = MONTHMAX[this.month-1]-this.date;
		for(int i = this.month;i<12;i++){
			if((i==2)&&(isLeap(this.year))){
				days += 29;
			}else{
				days += MONTHMAX[i];
			}
		}
		return days;
	}
	//他の日付との前後関係を判定するインスタンスメソッド
	public int compare(Day other){
		if(this.year>other.year){
			return 1;	//otherより後	
		}
		if(this.year<other.year){
			return -1;	//otherより前	
		}
		if(this.month>other.month){
			return 1;	//otherより後	
		}
		if(this.month<other.month){
			return -1;	//otherより前	
		}
		if(this.date>other.date){
			return 1;	//otherより後	
		}
		if(this.date<other.date){
			return -1;	//otherより前	
		}
		return 0;		//同じ日
	}
	//二つの日付の前後関係を判定するクラスメソッド
	public static int compare(Day a,Day b){
		return a.compare(b);
	}
	//日付を一つ進めるメソッド
	public void forward(){
		this.forwardN(1);
	}
	//次の日の日付を返すメソッド
	public static Day forward(Day day){
		return Day.forwardN(day, 1);
	}
	//日付を1つ戻すメソッド
	public void back(){
		this.backN(1);
	}
	//前の日の日付を返すメソッド
	public static Day back(Day day){
		return Day.backN(day, 1);
	}
	//日付をn日進めるメソッド
	public void forwardN(int n){
		while(true){
			int temp;
			if((this.month==2)&&(isLeap(this.year))){
				temp = 29-this.date;
			}else{
				temp = MONTHMAX[this.month-1]-this.date;
			}
			if(n>temp){
				n -= temp;
				if(this.month==12){
					this.month = 1;
					this.year += 1;
				}
				this.month += 1;
			}else{
				this.date += date;
			}
		}
	}
	//n日後の日付を返すメソッド
	public static Day forwardN(Day day,int n){
		Day copy = new Day(day);
		copy.forwardN(n);
		return copy;
	}
	//日付をn日戻すメソッド
	public void backN(int n){
		while(n>=this.date){
			n-=this.date;
			if(this.month==1){
				this.year -= 1;
				this.month = 12;
			}
			if((this.month==2)&&(isLeap(this.year))){
				this.date = 29;
			}else{
				this.date = MONTHMAX[this.month-1];
			}
		}
		this.date -= n;
	}
	//n日前の日付を返すメソッド
	public static Day backN(Day day,int n){
		Day copy = new Day(day);
		copy.backN(n);
		return copy;
	}
//-----------------------------------------------
	
	public void setYear(int year)   { this.year  = year; }
	public void setMonth(int month) { this.month = month; }
	public void setDate(int date)   { this.date  = date; }

	public void set(int year, int month, int date) {
		this.year  = year;
		this.month = month;
		this.date  = date;
	}

	public boolean isLeap() { return isLeap(year); }

	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)", 
				year, month, date, wd[dayOfWeek()]);
	}
}
