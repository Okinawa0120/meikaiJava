package meikaiJava.Chap09.Ex0901;

import meikaiJava.Chap08.Ex0801.Human;
//演習8-1で作成した人間クラスの配列を生成するプログラム
public class ArrayHuman {

	public static void main(String[] args) {
		Human[] a = {	new Human("Aさん", 170, 60, 20, 10),
						new Human("Bさん", 175, 65, 25, 11),
						new Human("Cさん", 168, 80, 30, 20)
					};
		
		Human[] b;
		b = new Human[]{new Human("Xさん", 180, 88, 28, 5),
						new Human("Yさん", 175, 65, 25, 11),
						new Human("Zさん", 158, 55, 19, 10)	
		};
		System.out.println("配列a");
		for(int i = 0;i<a.length;i++){
			System.out.println("a["+i+"]="
								+a[i].getName()
								+" 身長:"+a[i].getHeight()
								+" 体重:"+a[i].getWeight()
								+" 年齢:"+a[i].getAge()
								+" 体脂肪率:"+a[i].getFat());
		}
		System.out.println("配列b");
		for(int i = 0;i<b.length;i++){
			System.out.println("b["+i+"]="
								+b[i].getName()
								+" 身長:"+b[i].getHeight()
								+" 体重:"+b[i].getWeight()
								+" 年齢:"+b[i].getAge()
								+" 体脂肪率:"+b[i].getFat());
		}
	}

}
