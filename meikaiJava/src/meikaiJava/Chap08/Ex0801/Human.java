package meikaiJava.Chap08.Ex0801;
//名前,身長,体重などをメンバとして持つ人間クラスを作成せよ(フィールドやメソッドは自由に設計して良い)
public class Human {
	private String name;
	private int height;
	private int weight;
	private int age;
	private double fat;
	
	Human(String name,int height,int weight,int age,double fat) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.age=age;
		this.fat=fat;
	}
	
	String getName(){
		return name;
	}
	int getHeight(){
		return height;
	}
	int getWeight(){
		return weight;
	}
	int getAge(){
		return age;
	}
	double getFat(){
		return fat;
	}
	
	void diet(){
		fat *= 0.9;
	}
}
