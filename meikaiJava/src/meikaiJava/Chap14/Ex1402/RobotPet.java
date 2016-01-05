package meikaiJava.Chap14.Ex1402;
/*演習14-2
 * ロボット型ペットクラスRoboPetを拡張した,着せ替え可能なロボット型ペットクラスを作成せよ
 * インターフェースSkinnableを実装すること
 */
class Pet {
	private String name;
	private String masterName;

	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	public String getName() { return name; }

	public String getMasterName() { return masterName; }

	public void introduce() {
		System.out.println("僕の名前は" + name + "です"); 
		System.out.println("ご主人様の名前は" + masterName + "です");
	}
}

class RobotPet extends Pet implements Skinnable{

	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}

	public void introduce() {
		System.out.println("私はロボット.名前は" + getName() + "."); 
		System.out.println("ご主人様は" + getMasterName() + ".");
	}

	public void work(int sw) {
		switch (sw) {
		 case 0: System.out.println("掃除します"); break;
		 case 1: System.out.println("洗濯します"); break;
		 case 2: System.out.println("炊事します"); break;
		}
	}

	public void changeSkin(int skin) {
		System.out.println("スキンを");
		switch (skin) {
		 case BLACK:   System.out.print("黒");	break;
		 case RED:     System.out.print("赤");	break;
		 case GREEN:   System.out.print("緑");	break;
		 case BLUE:    System.out.print("青");	break;
		 case LEOPARD: System.out.print("ヒョウ柄");	break;
		 default:		System.out.print("無地");	break;
		}
		System.out.println("に変更しました");
	}
}
