package meikaiJava.Chap09.Ex0904;

import meikaiJava.Chap09.Ex0902.Day;

//名前,身長,体重などをメンバとして持つ人間クラスを作成せよ(フィールドやメソッドは自由に設計して良い)
//演習9-4人間クラスに誕生日のフィールドとtoStringメソッドを追加せよ
public class Human {
	private String name;
	private int height;
	private int weight;
	private int age;
	private double fat;
	private Day birthday;
	
	public Human(String name,int height,int weight,int age,double fat,Day birthday) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.age=age;
		this.fat=fat;
		this.birthday=birthday;
	}
	
	public String getName(){
		return name;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
	public int getAge(){
		return age;
	}
	public double getFat(){
		return fat;
	}
	public Day getBirthday(){
		return new Day(birthday);
	}
	
	public void diet(){
		fat *= 0.9;
	}
	public String toString(){
		return String.format("%s\n身長:%d\n体重:%d\n年齢:%d\n"
				+ "体脂肪率:%3f\n誕生日:%s", name,height,weight,age,fat,birthday);
	}
}