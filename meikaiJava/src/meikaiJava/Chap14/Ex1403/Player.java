package meikaiJava.Chap14.Ex1403;

public interface Player {
	void play();
	void stop();
}

interface ExPlayer extends Player {
	void slow();
}