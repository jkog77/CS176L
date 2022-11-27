import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
public class MeasurableViewer {

	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 150;
	
	public static void main(String[] args) {
		Scanner measure = new Scanner(System.in);
		
		Measurable[] countries = new Measurable[3];
	    countries[0] = new Country("Uruguay", 176220);
	    countries[1] = new Country("Thailand", 513120);
	    countries[2] = new Country("Belgium", 30510);
	    
	    Measurable[] bank = new Measurable[3];
	    bank[0] = new BankAccount(176220);
	    bank[1] = new BankAccount(513120);
	    bank[2] = new BankAccount(30510);
	    
	    Measurable[] quiz = new Measurable[5];
	    quiz[0] = new Quiz(95);
	    quiz[1] = new Quiz(80);
	    quiz[2] = new Quiz(90);
	    quiz[3] = new Quiz(50);
	    quiz[4] = new Quiz(75);
		
		System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
		int metric = measure.nextInt();
		String UsedMetric = "maximum";
		if (metric == 1) {
			UsedMetric = "Maximum";
		}
		if (metric == 2) {
			UsedMetric = "Minimum";
		}
		if (metric == 3) {
			UsedMetric = "Average";
		}
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton balance = new JButton("Get " + UsedMetric + " Balance");
		panel.add(balance);
		ActionListener listenerBalance = new MeasurableListener(bank, UsedMetric);
		balance.addActionListener(listenerBalance);
		
		JButton country = new JButton("Get " + UsedMetric + " Area");
		panel.add(country);
		ActionListener listenerCountry = new MeasurableListener(countries, UsedMetric);
		country.addActionListener(listenerCountry);
		
		JButton score = new JButton("Get " + UsedMetric + " Score");
		panel.add(score);
		ActionListener listenerScore = new MeasurableListener(quiz, UsedMetric);
		score.addActionListener(listenerScore);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		measure.close();
		
	}
}
