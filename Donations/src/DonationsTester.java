import java.io.FileNotFoundException;

public class DonationsTester {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Donations giveToMe = new Donations();
		giveToMe.processDonation();
		giveToMe.getStatistics();
	}

}
