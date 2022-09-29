
public class Microwave {

private int time;
private int power;
private int start;

public void clickReset() {
	time = 0;
	power = 0;
	start = 0;
	System.out.println("Reset button was pressed. Power level is 1. Time is 0 seconds.");
}

public void clickTime() {
	time = time + 30;
	System.out.println("Time Button was pressed. Time is "+time+" seconds.");
}

public void clickPower() {
	power = power + 1;
	if (power == 1) 
		power = 2;
	else 
		power = 1; 
	System.out.println("Power Button was pressed. Power level is "+power+".");
}

public void clickStart() {
	start = start + 1;
	System.out.println("Cooking for "+time+" seconds at level "+power+".");
}
}
