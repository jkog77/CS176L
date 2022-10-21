import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;
public class Donations {
	
	public static void processDonation() throws FileNotFoundException {
		File donations = new File("Donations.txt");
		Scanner sc = new Scanner(donations);
		String categoryi = " ";
		String categoryb = " ";
		String categoryo = " ";
		int numIndividual = 0;
		double amtIndividual = 0;
		int numBusiness = 0;
		double amtBusiness = 0;
		int numOther = 0;
		double amtOther = 0;
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			Boolean Individual = data.startsWith("<individual donation>");
			Boolean Business = data.startsWith("<business donation>");
			Boolean Other = data.startsWith("<other donation>");
			if (Individual == true) {
				categoryi = data;
				String cat1 = categoryi.replaceAll("<individual donation>", "");
				double total = Double.parseDouble(cat1);
				amtIndividual = amtIndividual + total;
				if (total > 0)
					numIndividual++;
				else
					numIndividual--;
				}
			if (Business == true) {
				categoryb = data;
				String cat2 = categoryb.replaceAll("<business donation>", "");
				double total = Double.parseDouble(cat2);
				amtBusiness = amtBusiness + total;
				if (total > 0)
					numBusiness++;
				else
					numBusiness--;
				}
			if (Other == true) {
				categoryo = data;
				String cat3 = categoryo.replaceAll("<other donation>", "");
				double total = Double.parseDouble(cat3);
					amtOther = amtOther + total;
				if (total > 0)
					numOther++;
				else
					numOther--;
				}
			}
		Scanner input = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println("Would you like to process donations now? (enter 'Yes' to continue): ");
		String dono = input.next();
		if (dono.equals("Yes")) {
			System.out.println("Individual: #: "+numIndividual+""+" "+nf.format(amtIndividual));
			System.out.println("Business: #: "+numBusiness+""+" "+nf.format(amtBusiness));
			System.out.println("Other: #: "+numOther+""+" "+nf.format(amtOther));
		}
		else {
			System.out.println("Ending without processing donations");
			
		}
			input.close();
			sc.close();
		}
	public static void getStatistics() throws FileNotFoundException {
		File donations = new File("Donations.txt");
		Scanner sc = new Scanner(donations);
		String categoryi = " ";
		String categoryb = " ";
		String categoryo = " ";
		int numIndividual = 0;
		double amtIndividual = 0;
		int numBusiness = 0;
		double amtBusiness = 0;
		int numOther = 0;
		double amtOther = 0;
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			Boolean Individual = data.startsWith("<individual donation>");
			Boolean Business = data.startsWith("<business donation>");
			Boolean Other = data.startsWith("<other donation>");
			if (Individual == true) {
				categoryi = data;
				String cat1 = categoryi.replaceAll("<individual donation>", "");
				double total = Double.parseDouble(cat1);
				amtIndividual = amtIndividual + total;
				if (total > 0)
					numIndividual++;
				else
					numIndividual--;
				}
			if (Business == true) {
				categoryb = data;
				String cat2 = categoryb.replaceAll("<business donation>", "");
				double total = Double.parseDouble(cat2);
				amtBusiness = amtBusiness + total;
				if (total > 0)
					numBusiness++;
				else
					numBusiness--;
				}
			if (Other == true) {
				categoryo = data;
				String cat3 = categoryo.replaceAll("<other donation>", "");
				double total = Double.parseDouble(cat3);
					amtOther = amtOther + total;
				if (total > 0)
					numOther++;
				else
					numOther--;
				}
			}
		//String category1 = "Individual";
		//String category2 = "Business";
		//String category3 = "Other";
		//System.out.println("Number of donations for "+category1+": "+numIndividual);
		//System.out.println("Total donations for "+category1+": "+amtIndividual);
		//System.out.println("Number of donations for "+category2+": "+numBusiness);
		//System.out.println("Total donations for "+category2+": "+amtBusiness);
		//System.out.println("Number of donations for "+category3+": "+numOther);
		//System.out.println("Total donations for "+category3+": "+amtOther);
		sc.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to process donations now? (enter 'Yes' to continue): ");
		String dono = input.next();
		if (dono.equals("Yes")) {
			processDonation();
			getStatistics();
		}
		else {
			System.out.println("Ending now without processing donations");
		}
		input.close();
	}
}
