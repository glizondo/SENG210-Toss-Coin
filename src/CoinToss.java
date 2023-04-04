
public class CoinToss implements IGameAlgorithmProvider, IGameStatisticsProvider {

	private String headOrTails;
	private int countToss;
	private int heads;
	private int tails;
	private int statisticsHeads;
	private int statisticsTails;

	public String randomThrow() throws InterruptedException {

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
		generateStatistics();
		return headOrTails;
	}

	public void generateStatistics() {
		statisticsHeads = (heads * 100) / countToss;
		statisticsTails = (tails * 100) / countToss;
	}

	public String getHeadOrTails() {
		return headOrTails;
	}

	public void setHeadOrTails(String headOrTails) {
		this.headOrTails = headOrTails;
	}

	public int getCountToss() {
		return countToss;
	}

	public void setCountToss(int countToss) {
		this.countToss = countToss;
	}

	public int getHeads() {
		return heads;
	}

	public void setHeads(int heads) {
		this.heads = heads;
	}

	public int getTails() {
		return tails;
	}

	public void setTails(int tails) {
		this.tails = tails;
	}

	public int getStatisticsHeads() {
		return statisticsHeads;
	}

	public void setStatisticsHeads(int statisticsHeads) {
		this.statisticsHeads = statisticsHeads;
	}

	public int getStatisticsTails() {
		return statisticsTails;
	}

	public void setStatisticsTails(int statisticsTails) {
		this.statisticsTails = statisticsTails;
	}

}
