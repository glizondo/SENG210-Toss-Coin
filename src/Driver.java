import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		Scanner keyboard = new Scanner(System.in);
		Coin coin = new Coin();

		System.out.println("Welcome to the coin toss game");
		System.out.println("Do you want toss the coin? (Yes/No)");
		String answer = keyboard.nextLine();
		while (answer.equalsIgnoreCase("Yes")) {
			System.out.println("The coin is tossed and...");
			TimeUnit.SECONDS.sleep(2);
			System.out.println(coin.coinToss());
			System.out.println("Again? (Yes/No)");
			answer = keyboard.nextLine();
		}
		keyboard.close();
	}

}
