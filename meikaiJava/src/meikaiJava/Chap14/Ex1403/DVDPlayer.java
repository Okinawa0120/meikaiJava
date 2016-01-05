package meikaiJava.Chap14.Ex1403;

class DVDPlayer implements ExPlayer {

	public void play() {
		System.out.println("DVD再生開始");
	}

	public void stop() {
		System.out.println("DVD再生終了"); 
	}

	public void slow() {
		System.out.println("DVDスロー再生開始"); 
	}
}

