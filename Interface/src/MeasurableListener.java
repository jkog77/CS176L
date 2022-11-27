import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MeasurableListener implements ActionListener {
	private Measurable[] objects;
	private String metric;
	
	public MeasurableListener(Measurable[] objects1, String theMetric) {
		objects = objects1;
		metric = theMetric;
	}
	
	public void actionPerformed(ActionEvent event) {
		double result = 0;
		
		if (metric=="Maximum") {
			result = Data.max(objects);
		}
		if (metric=="Minimum") {
			result = Data.min(objects);
		}
		if (metric=="Average") {
			result = Data.average(objects);
		}
		
		if (objects[0].getClass().getName().equals("BankAccount")) {
			System.out.println(metric + " Account Balance is "+ result);
		}
		if (objects[0].getClass().getName().equals("Country")) {
			System.out.println(metric + " Country Area is "+ result);
		}
		if (objects[0].getClass().getName().equals("Quiz")) {
			System.out.println(metric + " Quiz Score is "+ result);
		}
	}

}
