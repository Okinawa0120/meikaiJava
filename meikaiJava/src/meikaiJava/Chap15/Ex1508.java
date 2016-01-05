package meikaiJava.Chap15;

import java.util.Calendar;
//コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ
public class Ex1508 {
	static void printCalender(int year){
		for(int i=0;i<12;i++){
			printCalender(year,i+1);
		}
	}
	static void printCalender(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.println(year+"年"+month+"月");
		System.out.print("日\t月\t火\t水\t木\t金\t土\n");
		for (int i = 0; i < calendar.getActualMaximum(calendar.DATE)+week; i++) {
			if(i<week){
				System.out.print("　\t");
			}else{
				System.out.print(i-week+1+"\t");
				if(i%7==6){
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		switch (args.length) {
		case 0:
			Calendar calendar = Calendar.getInstance();
			printCalender(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1);
			break;
		case 1:
			printCalender(Integer.parseInt(args[0]));
			break;
		default:
			printCalender(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			break;
		}
	}
}
