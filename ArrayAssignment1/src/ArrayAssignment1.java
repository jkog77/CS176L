public class ArrayAssignment1 {
	
	public static void main(String[] args) {
		double[] values = {25.3, 100.0, -10.0, -1.5, 13.0, 98.6, 18.0, 123.456, 125.6, 123.146};
		
		for (double element : values) {
			System.out.print(element + " ");
	}
		System.out.println(" ");
		
		double largest = Integer.MIN_VALUE;
		for (double el: values) {
			if (largest < el) {
				largest = el;
			}
		}
		System.out.println("The largest element in the array is : "+largest);
		
		int negative = 0;
		for (double e: values) {
			if (e < 0) {
				negative++;
			}
		}
		System.out.println("There are "+negative+" negative numbers in the array");
	}
	
	
	

}
