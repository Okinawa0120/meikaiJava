package meikaiJava.Chap08.Ex0801;
//名前,身長,体重などをメンバとして持つ人間クラスを作成せよ(フィールドやメソッドは自由に設計して良い)
public class Human {
	private String name;
	private int height;
	private int weight;
	private int age;
	private double fat;
	
	public Human(String name,int height,int weight,int age,double fat) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.age=age;
		this.fat=fat;
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
	
	public void diet(){
		fat *= 0.9;
	}
}
