package meikaiJava.Chap14.Ex1402;

public class RobotPetTester {
	static void intro(Pet p) {
		p.introduce();
	}

	public static void main(String[] args) {
		Pet[] a = {
			new Pet("アメデオ", "マルコ"),
			new RobotPet("ガンダム", "アムロ"),
			new Pet("ピカチュウ", "サトシ"),
		};

		for (Pet p : a) {
			intro(p);
			if (p instanceof RobotPet) {
				((RobotPet) p).changeSkin(1);
			}
			System.out.println();
		}
		
	}
}
