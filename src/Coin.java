import java.util.concurrent.TimeUnit;

public class Coin {

	private String headOrTails;

	public String coinToss() throws InterruptedException {

		int max = 1;
		int min = 0;
		int range = max - min + 1;
		int random = (int) (Math.random() * range) + min;

		if (random == 1) {
			headOrTails = "Heads!!";
		}
		if (random == 0) {
			headOrTails = "Tails!!";
		}

		return headOrTails;
	}
}
