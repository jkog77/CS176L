
public class Instructor extends Person {
	/**
	   An instructor is represented by a name, a birth year, and a salary.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	private double salary;

	public Instructor(String name1, int birthYear1, double salary1) {
		super(name1, birthYear1);
		salary = salary1;
	}

	   /**
	      Returns the string represention of the object.
	      @return a string representation of the object
	   */
	   public String toString()
	   {
	      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	   }

}
