import java.util.concurrent.TimeUnit;

public class Coin {

	private String headOrTails;
	static int countToss;
	static int heads;
	static int tails;

	public String coinToss() throws InterruptedException {

		int max = 1;
		int min = 0;
		int range = max - min + 1;
		int random = (int) (Math.random() * range) + min;

		if (random == 1) {
			headOrTails = "Heads!!";
			heads++;
		}
		if (random == 0) {
			headOrTails = "Tails!!";
			tails++;
		}
		countToss++;
		return headOrTails;
	}

	public int provideStatisticsHeads() {
		int statisticsHeads = (heads * 100) / countToss;
		return statisticsHeads;
	}

	public int provideStatisticsTails() {
		int statisticsTails =  (tails * 100) / countToss;
		return statisticsTails;
	}
}
