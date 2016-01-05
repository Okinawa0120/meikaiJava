package meikaiJava.Chap14.Ex1403;
/*演習14-3
 * DVDPlayerを利用するプログラム例を作成せよ
 */
public class DVDTester {
	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer();
		dvd.play();
		dvd.slow();
		dvd.stop();
	}
}
