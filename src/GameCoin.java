import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;

public class GameCoin {

	private JFrame frame;
	private Coin coin;
	private JTextField textFieldResult;
	private JTextField textFieldCount;
	private JTextField textFieldPercentageHeads;
	private JTextField textFieldPercentageTails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameCoin window = new GameCoin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameCoin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.getContentPane().setLayout(null);

		JLabel labelIntroGame = new JLabel("Coin Toss Game");
		labelIntroGame.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		labelIntroGame.setOpaque(true);
		labelIntroGame.setFont(new Font("Stencil", Font.BOLD, 26));
		labelIntroGame.setBackground(Color.LIGHT_GRAY);
		labelIntroGame.setHorizontalAlignment(SwingConstants.CENTER);
		labelIntroGame.setBounds(10, 11, 564, 47);
		frame.getContentPane().add(labelIntroGame);

		JButton buttonTossCoin = new JButton("Toss one!");
		buttonTossCoin.setFont(new Font("Stencil", Font.PLAIN, 15));
		buttonTossCoin.setForeground(Color.BLACK);
		buttonTossCoin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		buttonTossCoin.setBackground(Color.GRAY);
		buttonTossCoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coin = new Coin();
				try {
					TimeUnit.SECONDS.sleep(2);
					textFieldResult.setText(coin.coinToss());
				} catch (InterruptedException e1) {
					System.out.println("Something went wrong with the coin toss");

				}

				textFieldCount.setText(Integer.toString(Coin.countToss));
				textFieldPercentageHeads.setText(Integer.toString(coin.provideStatisticsHeads()) + "%");
				textFieldPercentageTails.setText(Integer.toString(coin.provideStatisticsTails()) + "%");
			}
		});
		buttonTossCoin.setBounds(229, 69, 138, 63);
		frame.getContentPane().add(buttonTossCoin);

		textFieldResult = new JTextField();
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldResult.setBounds(10, 283, 564, 67);
		frame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);

		JLabel labelCount = new JLabel("Count");
		labelCount.setBackground(Color.GRAY);
		labelCount.setOpaque(true);
		labelCount.setFont(new Font("Stencil", Font.PLAIN, 12));
		labelCount.setHorizontalAlignment(SwingConstants.CENTER);
		labelCount.setBounds(10, 69, 109, 24);
		frame.getContentPane().add(labelCount);

		textFieldCount = new JTextField();
		textFieldCount.setEditable(false);
		textFieldCount.setBounds(129, 69, 65, 24);
		frame.getContentPane().add(textFieldCount);
		textFieldCount.setColumns(10);

		JLabel labelPercentageHeads = new JLabel("percentage heads");
		labelPercentageHeads.setOpaque(true);
		labelPercentageHeads.setHorizontalAlignment(SwingConstants.CENTER);
		labelPercentageHeads.setFont(new Font("Stencil", Font.PLAIN, 10));
		labelPercentageHeads.setBackground(Color.GRAY);
		labelPercentageHeads.setBounds(10, 170, 109, 24);
		frame.getContentPane().add(labelPercentageHeads);

		JLabel labelPercentageTails = new JLabel("percentage tails");
		labelPercentageTails.setOpaque(true);
		labelPercentageTails.setHorizontalAlignment(SwingConstants.CENTER);
		labelPercentageTails.setFont(new Font("Stencil", Font.PLAIN, 10));
		labelPercentageTails.setBackground(Color.GRAY);
		labelPercentageTails.setBounds(10, 205, 109, 24);
		frame.getContentPane().add(labelPercentageTails);

		textFieldPercentageHeads = new JTextField();
		textFieldPercentageHeads.setEditable(false);
		textFieldPercentageHeads.setColumns(10);
		textFieldPercentageHeads.setBounds(129, 171, 65, 24);
		frame.getContentPane().add(textFieldPercentageHeads);

		textFieldPercentageTails = new JTextField();
		textFieldPercentageTails.setEditable(false);
		textFieldPercentageTails.setColumns(10);
		textFieldPercentageTails.setBounds(129, 206, 65, 24);
		frame.getContentPane().add(textFieldPercentageTails);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
