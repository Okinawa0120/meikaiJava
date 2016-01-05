package meikaiJava.Chap15.Ex1505;

import java.util.Scanner;

/*演習15-3
 * 3人で行うじゃんけんプログラムを作成せよ.
 * プレーヤ3人のうち2人はコピュータで1人は人間とする.
 * また演習13-3で作成したプレーヤクラスを利用すること.
 */
public class Janken3P {
	static void printHand(Player you,Player cpu1,Player cpu2){
		String[] hands = {"グー", "チョキ", "パー"};
		System.out.println("あなたは"+hands[you.getHand()]+"で,CPU1は"
				+hands[cpu1.getHand()]+"で,CPU2は"+hands[cpu2.getHand()]+"です.");
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Human you = new Human();
		Computer cpu1 = new Computer();
		Computer cpu2 = new Computer();
		do{
			you.setHand();
			cpu1.setHand();
			cpu2.setHand();
			int judge = (you.getHand()+cpu1.getHand()+cpu2.getHand())%3;
			printHand(you, cpu1, cpu2);
			while(judge==0){
				System.out.println("あいこ");
				you.setHand();
				cpu1.setHand();
				cpu2.setHand();
				judge = (you.getHand()+cpu1.getHand()+cpu2.getHand())%3;
				printHand(you, cpu1, cpu2);
			}
			if(judge==1){
				if(you.getHand()==cpu1.getHand()){
					System.out.println("あなたの勝ちです");
					cpu1.setWin(cpu1.getWin()+1);
					cpu2.setLose(cpu2.getLose()+1);
					you.setWin(you.getWin()+1);
				}else if(you.getHand()==cpu2.getHand()){
					System.out.println("あなたの勝ちです");
					cpu1.setLose(cpu1.getLose()+1);
					cpu2.setWin(cpu2.getWin()+1);
					you.setWin(you.getWin()+1);
				}else{
				System.out.println("あなたの負けです");
				you.setLose(you.getLose()+1);
				cpu1.setWin(cpu1.getWin()+1);
				cpu2.setWin(cpu2.getWin()+1);
				}
			}else{
				if(you.getHand()==cpu1.getHand()){
					System.out.println("あなたの負けです");
					cpu1.setLose(cpu1.getLose()+1);
					cpu2.setWin(cpu2.getWin()+1);
					you.setLose(you.getLose()+1);
				}else if(you.getHand()==cpu2.getHand()){
					System.out.println("あなたの負けです");
					cpu1.setWin(cpu1.getWin()+1);
					cpu2.setLose(cpu2.getLose()+1);
					you.setLose(you.getLose()+1);
				}else{
					System.out.println("あなたの勝ちです");
					you.setWin(you.getWin()+1);
					cpu1.setLose(cpu1.getLose()+1);
					cpu2.setLose(you.getLose()+1);
				}
			}
			System.out.println("あなた");
			System.out.println(you.toString());
			System.out.println("コンピュータ1");
			System.out.println(cpu1.toString());
			System.out.println("コンピュータ2");
			System.out.println(cpu2.toString());
			System.out.print("続けるなら0,終了するなら0以外の整数を入力:");
			System.out.println();
		}while(stdIn.nextInt()==0);
		
		int judge = (you.getHand()+cpu1.getHand()+cpu2.getHand())%3;
		while(judge==0){
			System.out.println();
		}
	}
}
