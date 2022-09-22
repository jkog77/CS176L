import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the cost per square foot: ");
		double costpersqft = sc.nextDouble();
		System.out.print("Please enter the length of the house: ");
		double houseLength = sc.nextDouble();
		System.out.print("Please enter width of the house: ");
		double houseWidth = sc.nextDouble();
		System.out.print("Please enter height of the house: ");
		double houseHeight = sc.nextDouble();
		System.out.print("Please enter the number of windows: ");
		double numWindows = sc.nextDouble();
		System.out.print("Please enter the length of a window: ");
		double windowLength = sc.nextDouble();
		System.out.print("Please enter the width of a window: ");
		double windowWidth = sc.nextDouble();
		System.out.print("Please enter the number of doors: ");
		double numDoors = sc.nextDouble();
		System.out.print("Please enter the length of a door: ");
		double doorLength = sc.nextDouble();
		System.out.print("Please enter the width of a door: ");
		double doorWidth = sc.nextDouble();
		double sqftPeak = 2*(houseLength*houseWidth + 0.5*(houseLength*(houseHeight-houseWidth)));
		double sqftNormal = 2*(houseLength*houseWidth);
		double window = numWindows*windowLength*windowWidth;
		double door = numDoors*doorLength*doorWidth;
		double sqftToPaint = sqftNormal + sqftPeak - (window+door);
		double costToPaint = sqftToPaint * costpersqft;
		System.out.println("Your total paintable surface area is "+ sqftToPaint + " square feet.");
		System.out.println("Your estimate is "+ costToPaint + " dollars.");
		sc.close();
	}

}
